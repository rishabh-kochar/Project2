package com.example.project2.dto;

public class ProfessorRankDTO {
    private String professorid;
    private String professorname;
    private int rank;

    public String getProfessorid() {
        return professorid;
    }

    public void setProfessorid(String professorid) {
        this.professorid = professorid;
    }

    public String getProfessorname() {
        return professorname;
    }

    public void setProfessorname(String professorname) {
        this.professorname = professorname;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
