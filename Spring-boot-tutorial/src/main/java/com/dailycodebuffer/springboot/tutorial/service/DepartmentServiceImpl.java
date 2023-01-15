package com.dailycodebuffer.springboot.tutorial.service;

import com.dailycodebuffer.springboot.tutorial.entity.DepartmentEntity;
import com.dailycodebuffer.springboot.tutorial.error.DepartmentNotFoundException;
import com.dailycodebuffer.springboot.tutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public DepartmentEntity saveDepartment(DepartmentEntity departmentEntity) {
        return departmentRepository.save(departmentEntity);
    }

    @Override
    public List<DepartmentEntity> getDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public DepartmentEntity getDepartmentById(Long departmentId) throws DepartmentNotFoundException {
       // return departmentRepository.findById(departmentId).get();
        Optional<DepartmentEntity> dept = departmentRepository.findById(departmentId);
        if(!dept.isPresent()){
            throw new DepartmentNotFoundException("Department is Not Availble");
        }else return dept.get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public void deleteDepartment() {
        departmentRepository.deleteAll();
    }

    @Override
    public DepartmentEntity updateDepartment(Long departmentId, DepartmentEntity departmentEntity) {
        DepartmentEntity depDB = departmentRepository.findById(departmentId).get();
        if(Objects.nonNull(departmentEntity.getDepartmentName()) && !"".equalsIgnoreCase(departmentEntity.getDepartmentName())){
            depDB.setDepartmentName(departmentEntity.getDepartmentName());
        }
        if(Objects.nonNull(departmentEntity.getDepartmentAddress()) && !"".equalsIgnoreCase(departmentEntity.getDepartmentAddress())){
            depDB.setDepartmentAddress(departmentEntity.getDepartmentAddress());
        }
        if(Objects.nonNull(departmentEntity.getDepartmentCode()) && !"".equalsIgnoreCase(departmentEntity.getDepartmentCode())){
            depDB.setDepartmentCode(departmentEntity.getDepartmentCode());
        }
        return departmentRepository.save(depDB);
    }

    @Override
    public DepartmentEntity getDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentName(departmentName);
    }
}
