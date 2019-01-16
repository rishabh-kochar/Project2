package com.example.project2.repository;

import com.example.project2.dto.ProfessorRankDTO;
import com.example.project2.entity.Professor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import java.util.List;

/*
Developed by Chaman
 */
@Repository
public interface ProfessorRepository extends CrudRepository<Professor,String>{
    @Query(value = "SELECT prof.professor_name from score sc,subject sb ,professor prof where sc.subject_id =  sb.subject_id AND sb.professor_id=prof.professor_id GROUP BY prof.professor_id ORDER BY SUM(sc.score)/COUNT(DISTINCT (sc.student_id))/COUNT(DISTINCT (sc.subject_id));",nativeQuery = true)
    List<String> getProfessorRank();
}
