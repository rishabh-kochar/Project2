package com.example.project2.service;

import com.example.project2.entity.Department;
import com.example.project2.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/*
Developed by Chaman
 */
@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public void addDepartment(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public Department getDepartment(String id) {
        return departmentRepository.findOne(id);
    }

    @Override
    public void updateDepartment(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public void deleteDepartment(String id) {
        departmentRepository.delete(id);
    }

    @Override
    public List<Department> departmentList() {

        List<Department> departmentList = new ArrayList<>();
        Iterable<Department> employeeIterable = departmentRepository.findAll();
        employeeIterable.forEach(departmentList::add);
        return departmentList;

    }
}
