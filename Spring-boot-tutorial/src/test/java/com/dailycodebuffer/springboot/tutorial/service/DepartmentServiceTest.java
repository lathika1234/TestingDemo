//package com.dailycodebuffer.springboot.tutorial.service;
//
//import com.dailycodebuffer.springboot.tutorial.entity.DepartmentEntity;
//import com.dailycodebuffer.springboot.tutorial.repository.DepartmentRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest
//class DepartmentServiceTest {
//    @Autowired
//    private DepartmentService departmentService;
//    @Autowired
//    @MockBean
//    private DepartmentRepository departmentRepository;
//    @BeforeEach
//    void setUp() {
//        DepartmentEntity departmentEntity=DepartmentEntity.builder().departmentName("CSE").departmentAddress("Mangalore").departmentCode("IT8").departmentId(1L).build();
//        Mockito.when(departmentRepository.findByDepartmentName("CSE")).thenReturn(departmentEntity);
//    }
//    @Test
//    @DisplayName("Get data based on valid department name")
//    //@Disabled
//    public void whenValidDeapartmentName_thenDepartmentShouldFount(){
//        String departmentName="CSE";
//        DepartmentEntity found=departmentService.getDepartmentByName(departmentName);
//        assertEquals(departmentName,found.getDepartmentName());
//    }
//}