package com.example.project2.service;

import com.example.project2.entity.Department;

import java.util.List;
/*
Developed by Chaman
 */

public interface DepartmentService {

    void addDepartment(Department department);

    Department getDepartment(String id);

    List<Department> departmentList();

    void updateDepartment(Department department);

    void deleteDepartment(String id);
}
