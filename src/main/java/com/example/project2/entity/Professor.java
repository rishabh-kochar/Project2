package com.example.project2.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
/*
Developed by Chaman
 */

@Entity
@Table(name = Professor.TABLE_NAME)
public class Professor {

    public static final String TABLE_NAME="professor";
    public static final String ID_COLUMN="Id";

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid",strategy = "uuid2")
    @Column(name = Department.ID_COLUMN)
    private String professorId;
    private String professorName;
    private String primaryDeptId;
    private String secondaryDeptId;

    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL,orphanRemoval = true)
//    private List<Subject> subjectList=new ArrayList<>();

    public static String getTableName() {
        return TABLE_NAME;
    }

    public static String getIdColumn() {
        return ID_COLUMN;
    }

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getPrimaryDeptId() {
        return primaryDeptId;
    }

    public void setPrimaryDeptId(String primaryDeptId) {
        this.primaryDeptId = primaryDeptId;
    }

    public String getSecondaryDeptId() {
        return secondaryDeptId;
    }

    public void setSecondaryDeptId(String secondaryDeptId) {
        this.secondaryDeptId = secondaryDeptId;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "professorId='" + professorId + '\'' +
                ", professorName='" + professorName + '\'' +
                ", primaryDeptId='" + primaryDeptId + '\'' +
                ", secondaryDeptId='" + secondaryDeptId + '\'' +
                '}';
    }
}
