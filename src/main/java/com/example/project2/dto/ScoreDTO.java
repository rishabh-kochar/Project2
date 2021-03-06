package com.example.project2.dto;

public class ScoreDTO {
    private String studentId;
    private String semester;
    private String subjectId;
    private String professorId;
    private double score;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "studentId='" + studentId + '\'' +
                ", semester='" + semester + '\'' +
                ", subjectId='" + subjectId + '\'' +
                ", professorId='" + professorId + '\'' +
                ", score=" + score +
                '}';
    }
}
