package com.example.project2.service;

import com.example.project2.entity.Professor;
import com.example.project2.entity.Subject;
import com.example.project2.repository.ProfessorRepository;
import com.example.project2.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl  implements SubjectService{

    @Autowired
    SubjectRepository subjectRepository;

    @Autowired
    ProfessorRepository professorRepository;

    @Override
    public void addSubject(Subject subject) {
        Professor professor=professorRepository.findOne(subject.getProfessorId());
        subject.setProfessor(professor);
        subjectRepository.save(subject);
    }

    @Override
    public Subject getSubjectDetail(String id) {
        return subjectRepository.findOne(id);
    }

    @Override
    public void updateSubject(Subject subject) {
        subjectRepository.save(subject);
    }

    @Override
    public void deleteSubject(String id) {
        subjectRepository.delete(id);
    }
}
