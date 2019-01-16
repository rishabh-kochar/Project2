package com.example.project2.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = Student.TABLE_NAME)
public class Student {

    public static final String TABLE_NAME="STUDENT";
    public static final String ID_COLUMN="STUDENTId";

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = Student.ID_COLUMN)
    private String studentId;

    private String studentName;
    private String departmentId;
    private String currentSemester;
    private double cgpa;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Score> scoreList = new ArrayList<>();

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department")
    private Department department;

//    private Score score;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(String currentSemester) {
        this.currentSemester = currentSemester;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public static String getTableName() {
        return TABLE_NAME;
    }

    public static String getIdColumn() {
        return ID_COLUMN;
    }

    public List<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<Score> scoreList) {
        this.scoreList = scoreList;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", currentSemester='" + currentSemester + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}