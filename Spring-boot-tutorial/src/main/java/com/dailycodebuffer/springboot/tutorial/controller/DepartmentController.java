package com.dailycodebuffer.springboot.tutorial.controller;

import com.dailycodebuffer.springboot.tutorial.entity.DepartmentEntity;
import com.dailycodebuffer.springboot.tutorial.error.DepartmentNotFoundException;
import com.dailycodebuffer.springboot.tutorial.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    private static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);
    @PostMapping("/saveDepartment")
    public DepartmentEntity saveDepartment(@Valid @RequestBody DepartmentEntity departmentEntity){
        logger.info("Inside save department");
        return departmentService.saveDepartment(departmentEntity);
    }

    @GetMapping("/getDepartment")
    public List<DepartmentEntity> getDepartment(){
        return departmentService.getDepartment();
    }
    @GetMapping("/getDepartmentById/{id}")
    public DepartmentEntity getDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        return departmentService.getDepartmentById(departmentId);
    }

    @DeleteMapping("/deleteDepartmentById/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Deleted record Successfully";
    }

    @DeleteMapping("/deleteDepartment")
    public String deleteDepartment(){
        departmentService.deleteDepartment();
        return "Successfully deleted all records";
    }

    @PutMapping("/updateDepartment/{id}")
    public DepartmentEntity updateDepartment(@PathVariable("id") Long departmentId,@RequestBody DepartmentEntity departmentEntity){
        return departmentService.updateDepartment(departmentId,departmentEntity);
    }

    @GetMapping("/getDepartmentByName/{name}")
    public DepartmentEntity getDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.getDepartmentByName(departmentName);
    }
}
