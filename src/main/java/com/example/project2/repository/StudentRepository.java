package com.example.project2.repository;


import com.example.project2.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository <Student,String>{

    @Query(value = "SELECT AVG(score) FROM score sc, Student s WHERE  where sc.student_id = ?1 " +
            "AND st.semester = s.current_semester",nativeQuery = true)
    public double findCurrentSGPA(String studentId);

    @Query(value = "SELECT SUM(sc.score*sb.subject_credits) / SUM(sb.subject_credits) FROM score sc, subject sb WHERE " +
            "st.student_id = ?1 AND sb.id = sc.subject_id"
            ,nativeQuery = true)
    public double findAggregateCGPA(String studentId);
}
