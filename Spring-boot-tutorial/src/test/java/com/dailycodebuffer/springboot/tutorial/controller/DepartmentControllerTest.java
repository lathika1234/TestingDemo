//package com.dailycodebuffer.springboot.tutorial.controller;
//
//import com.dailycodebuffer.springboot.tutorial.entity.DepartmentEntity;
//import com.dailycodebuffer.springboot.tutorial.service.DepartmentService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@WebMvcTest(DepartmentController.class)
//class DepartmentControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private DepartmentService departmentService;
//
//    private DepartmentEntity departmentEntity;
//
//    @BeforeEach
//    void setUp() {
//        departmentEntity=DepartmentEntity.builder().departmentName("ITBT").departmentAddress("Ranchi").departmentCode("123ed").departmentId(1L).build();
//    }
//
//    @Test
//    void saveDepartment() throws Exception{
//        DepartmentEntity inputDepartment=DepartmentEntity.builder().departmentName("ITBT").departmentAddress("Ranchi").departmentCode("123ed").build();
//        Mockito.when(departmentService.saveDepartment(inputDepartment)).thenReturn(departmentEntity);
//        mockMvc.perform(post("/saveDepartment").contentType(MediaType.APPLICATION_JSON).content("{\n" +
//                "    \"departmentName\":\"ITBT\",\n" +
//                "    \"departmentAddress\":\"Ranchi\",\n" +
//                "    \"departmentCode\":\"123ed\"\n" +
//                "}")).andExpect(status().isOk());
//    }
//
//    @Test
//    void getDepartmentById() throws Exception{
//        Mockito.when(departmentService.getDepartmentById(1L)).thenReturn(departmentEntity);
//        mockMvc.perform(get("/getDepartmentById/1").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andExpect(jsonPath("$.departmentName").value(departmentEntity.getDepartmentName()));
//    }
//}