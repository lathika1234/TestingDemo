package com.dailycodebuffer.springboot.tutorial.repository;

import com.dailycodebuffer.springboot.tutorial.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Long> {
    public DepartmentEntity findByDepartmentName(String departmentName);
    public DepartmentEntity findByDepartmentNameIgnoreCase(String departmentName);
}
