package com.example.project2.service;

import com.example.project2.entity.Department;
/*
Developed by Chaman
 */

public interface DepartmentService {

    void addDepartment(Department department);

    Department getDepartment(String id);

    void updateDepartment(Department department);

    void deleteDepartment(String id);
}
