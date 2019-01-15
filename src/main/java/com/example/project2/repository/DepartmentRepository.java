package com.example.project2.repository;


import com.example.project2.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
Developed by Chaman
 */
@Repository
public interface DepartmentRepository  extends CrudRepository<Department,String> {
}
