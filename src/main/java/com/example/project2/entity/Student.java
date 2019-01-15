package com.example.project2.entity;

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