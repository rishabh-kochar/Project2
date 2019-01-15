package com.example.project2.repository;

import com.example.project2.entity.Professor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
Developed by Chaman
 */
@Repository
public interface ProfessorRepository extends CrudRepository<Professor,String>{
}
