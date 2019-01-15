package com.example.project2.service;

import com.example.project2.entity.Student;

import java.util.List;

public interface StudentService {
    Student add(Student student);
    Student select(String studentId);
    Student update(Student student);
    void delete(String studentId);
    double getCurrentSGPA(String studentId);
    double getAggregateCGPA(String studentId);
}
