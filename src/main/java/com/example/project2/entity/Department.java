package com.example.project2.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/*
Developed by Chaman
 */
@Entity
@Table(name = Department.TABLE_NAME)
public class Department {

    public static final String TABLE_NAME="Department";
    public static final String ID_COLUMN="Id";


    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid",strategy = "uuid2")
    @Column(name = Department.ID_COLUMN)
    private String departmentId;
    private String departmentName;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Student> studentList = new ArrayList<>();

    public static String getTableName() {
        return TABLE_NAME;
    }

    public static String getIdColumn() {
        return ID_COLUMN;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
