package com.example.project2.service;

import com.example.project2.entity.Department;
import com.example.project2.entity.Professor;
import com.example.project2.repository.DepartmentRepository;
import com.example.project2.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    @Autowired
    ProfessorRepository professorRepository;


    @Autowired
    DepartmentRepository departmentRepository;
    @Override
    public void addProfessor(Professor professor) {
        professor.setPrimaryDepartment(departmentRepository.findOne(professor.getPrimaryDeptId()));
        if(professor.getSecondaryDeptId() != null)
        professor.setSecondaryDepartment(departmentRepository.findOne(professor.getSecondaryDeptId()));
        professorRepository.save(professor);
    }

    @Override
    public Professor getProfessor(String id) {
        return professorRepository.findOne(id);

    }

    @Override
    public void updateProfessor(Professor professor) {
        professorRepository.save(professor);
    }

    @Override
    public void deleteProfessor(String id) {
        professorRepository.delete(id);
    }

    @Override
    public List<Professor> getAllProfessor() {
        List<Professor> professorList = new ArrayList<>();
        Iterable<Professor> employeeIterable = professorRepository.findAll();
        employeeIterable.forEach(professorList::add);
        return professorList;
    }
}
