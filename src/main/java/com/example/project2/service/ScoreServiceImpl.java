package com.example.project2.service;

import com.example.project2.entity.Score;
import com.example.project2.entity.Student;
import com.example.project2.entity.Subject;
import com.example.project2.repository.ScoreRepository;
import com.example.project2.repository.StudentRepository;
import com.example.project2.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly=true, propagation=Propagation.REQUIRES_NEW)
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    ScoreRepository scoreRepository;

    @Autowired
    SubjectRepository subjectRepository;

    @Autowired
    StudentRepository studentRepository;

    @Transactional(readOnly = false)
    @Override
    public Score add(Score score) {

        score.setStudent(studentRepository.findOne(score.getStudentId()));
        score.setSubject(subjectRepository.findOne(score.getSubjectId()));
        return scoreRepository.save(score);
    }

    @Transactional(readOnly = false)
    @Override
    public Score select(String id) {

        Score score = scoreRepository.findOne(id);
        Student student=score.getStudent();
        Subject subject=score.getSubject();
        return score;
    }

    @Transactional(readOnly = false)
    @Override
    public Score update(Score score) {
        return scoreRepository.save(score);
    }

    @Transactional(readOnly = false)
    @Override
    public void delete(String id) {
        scoreRepository.delete(id);
    }

    @Transactional(readOnly = false)
    @Override
    public void updatesemester(String semester, String studentId) {
        scoreRepository.updateSemester(semester,studentId);
    }
}
