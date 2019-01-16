package com.example.project2.controller;

import com.example.project2.dto.SubjectDTO;
import com.example.project2.entity.Subject;
import com.example.project2.repository.SubjectRepository;
import com.example.project2.service.SubjectService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/*
Developed by Durgaprasad
 */
@RestController
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @PostMapping("/addSubject")
    public void addSubject(@RequestBody SubjectDTO subjectDTO){
        Subject subject=new Subject();
        BeanUtils.copyProperties(subjectDTO,subject);
        subjectService.addSubject(subject);
    }

    @GetMapping("/getSubjectDetails")
    public SubjectDTO getSubjectDetails(@RequestParam String id){
        SubjectDTO subjectDTO=new SubjectDTO();
        Subject subject = subjectService.getSubjectDetail(id);
        BeanUtils.copyProperties(subject,subjectDTO);
        return subjectDTO;
    }

    @PutMapping("/updateSubject")
    public void updateSubject(@RequestBody SubjectDTO subjectDTO){
        Subject subject=new Subject();
        BeanUtils.copyProperties(subjectDTO,subject);
        subjectService.updateSubject(subject);
    }

    @DeleteMapping("/deleteSubject")
    public void deleteSubject(@RequestParam String id){
        subjectService.deleteSubject(id);
    }

}
