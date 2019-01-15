package com.example.project2.service;

import com.example.project2.entity.Professor;
import com.example.project2.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    @Autowired
    ProfessorRepository professorRepository;

    @Override
    public void addProfessor(Professor professor) {
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
}
