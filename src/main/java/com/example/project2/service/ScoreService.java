package com.example.project2.service;


import com.example.project2.entity.Score;

public interface ScoreService {
    Score add(Score score);
    Score select(String id);
    Score update(Score score);
    void delete(String id);
    void updatesemester(String semester, String studentId);
}
