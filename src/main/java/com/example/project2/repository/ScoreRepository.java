package com.example.project2.repository;

import com.example.project2.entity.Score;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends CrudRepository<Score,String> {

    @Query(value="UPDATE student SET current_semester = ?1 WHERE student_id = ?2",nativeQuery = true)
    public void updateSemester(String semester, String studentId);
}
