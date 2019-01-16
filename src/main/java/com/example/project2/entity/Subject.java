package com.example.project2.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/*
Developed by DurgaPrasad
 */
@Entity
@Table(name = Subject.TABLE_NAME)
public class Subject {

    public static final String TABLE_NAME="subject";
    public static final String ID_COLUMN="subjectId";

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid",strategy = "uuid2")
    @Column(name = Subject.ID_COLUMN)
    private String subjectId;
    private String subjectName;
    private int subjectCredits;
    private String professorId;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professor")
    private Professor professor;

    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Score> scoreList = new ArrayList<>();

    public static String getTableName() {
        return TABLE_NAME;
    }

    public static String getIdColumn() {
        return ID_COLUMN;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectCredits() {
        return subjectCredits;
    }

    public void setSubjectCredits(int subjectCredits) {
        this.subjectCredits = subjectCredits;
    }

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId='" + subjectId + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", subjectCredits=" + subjectCredits +
                '}';
    }

    public List<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<Score> scoreList) {
        this.scoreList = scoreList;
    }
}
