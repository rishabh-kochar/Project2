package com.example.project2.service;


import com.example.project2.repository.*;
import com.example.project2.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly=true, propagation=Propagation.REQUIRES_NEW)
public class StudentServiceImpl implements StudentService {
    

        @Autowired
        StudentRepository studentRepository;

        @Transactional(readOnly = false)
        @Override
        public Student add(Student student) {
            return studentRepository.save(student);
        }

        @Transactional(readOnly = false)
        @Override
        public Student select(String id) {
            return studentRepository.findOne(id);
        }

        @Transactional(readOnly = false)
        @Override
        public Student update(Student student) {
            return studentRepository.save(student);
        }

        @Transactional(readOnly = false)
        @Override
        public void delete(String id) {
            studentRepository.delete(id);
        }

}
