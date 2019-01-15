package com.example.project2.dto;
/*
Developed by Chaman
 */
public class ProfessorDTO {
    private String professorId;
    private String professorName;
    private String primaryDeptId;
    private String secondaryDeptId;

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
}
