package com.example.project2.service;

import com.example.project2.entity.Subject;

public interface SubjectService {

    void addSubject(Subject subject);

    Subject getSubjectDetail(String id);

    void updateSubject(Subject subject);

    void deleteSubject(String id);

}
