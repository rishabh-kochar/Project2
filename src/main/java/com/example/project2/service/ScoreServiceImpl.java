package com.example.project2.service;

import com.example.project2.entity.Score;
import com.example.project2.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly=true, propagation=Propagation.REQUIRES_NEW)
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    ScoreRepository scoreRepository;

    @Transactional(readOnly = false)
    @Override
    public Score add(Score score) {
        return scoreRepository.save(score);
    }

    @Transactional(readOnly = false)
    @Override
    public Score select(String id) {
        return scoreRepository.findOne(id);
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

    @Override
    public void updatesemester(String semester, String studentId) {
        scoreRepository.updateSemester(semester,studentId);
    }
}
