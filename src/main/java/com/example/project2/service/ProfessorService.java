package com.example.project2.service;

import com.example.Project2.entity.Professor;

/*
Developed by Chaman
 */
public interface ProfessorService {

    void addProfessor(Professor professor);

    Professor getProfessor(String id);

    void updateProfessor(Professor professor);

    void deleteProfessor(String id);
}
