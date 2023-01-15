//package com.dailycodebuffer.springboot.tutorial.repository;
//
//import com.dailycodebuffer.springboot.tutorial.entity.DepartmentEntity;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@DataJpaTest
//class DepartmentRepositoryTest {
//
//    @Autowired
//    private DepartmentRepository departmentRepository;
//
//    @Autowired
//    private TestEntityManager testEntityManager;
//
//    @BeforeEach
//    void setUp() {
//        DepartmentEntity departmentEntity = DepartmentEntity.builder().departmentName("mechanical").departmentAddress("Mangalore").departmentCode("IS890").build();
//        testEntityManager.persist(departmentEntity);
//    }
//
//    @Test
//    @DisplayName("Get data based on valid department name")
//    //@Disabled
//    public void whenFindById_thenReturnDepartment(){
//        DepartmentEntity departmentEntity=departmentRepository.findById(1L).get();
//        assertEquals(departmentEntity.getDepartmentName(),"mechanical");
//    }
//}