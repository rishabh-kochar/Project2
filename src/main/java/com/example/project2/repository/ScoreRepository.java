package com.example.project2.repository;

import com.example.project2.entity.Score;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends CrudRepository<Score,String> {
}
