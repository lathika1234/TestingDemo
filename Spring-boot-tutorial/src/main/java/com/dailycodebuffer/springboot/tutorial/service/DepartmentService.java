package com.dailycodebuffer.springboot.tutorial.service;

import com.dailycodebuffer.springboot.tutorial.entity.DepartmentEntity;
import com.dailycodebuffer.springboot.tutorial.error.DepartmentNotFoundException;

import java.util.List;
public interface DepartmentService {
    public DepartmentEntity saveDepartment(DepartmentEntity departmentEntity);

    public List<DepartmentEntity> getDepartment();

    public DepartmentEntity getDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    public void deleteDepartment();

    public DepartmentEntity updateDepartment(Long departmentId, DepartmentEntity departmentEntity);

    public DepartmentEntity getDepartmentByName(String departmentName);
}
