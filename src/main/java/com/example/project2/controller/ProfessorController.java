package com.example.project2.controller;

import com.example.project2.dto.ProfessorDTO;
import com.example.project2.entity.Professor;
import com.example.project2.service.ProfessorService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
Developed by Chaman
 */
@RestController
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    ProfessorService professorService;

    @PostMapping("/addProfessor")
    public void addProfessor(@RequestBody ProfessorDTO professorDTO){
        Professor professor=new Professor();
        BeanUtils.copyProperties(professorDTO,professor);
        professorService.addProfessor(professor);
    }

    @GetMapping("/getProfessorDetails")
    public ProfessorDTO getProfessorDetails(@RequestParam String id){
        ProfessorDTO professorDTO=new ProfessorDTO();
        Professor professor=professorService.getProfessor(id);
        BeanUtils.copyProperties(professor,professorDTO);
        return professorDTO;
    }

    @PutMapping("/updateProfessor")
    public void updateProfessor(@RequestBody ProfessorDTO professorDTO){
        Professor professor=new Professor();
        BeanUtils.copyProperties(professorDTO,professor);
        professorService.updateProfessor(professor);
    }

    @DeleteMapping("/deleteProfessor")
    public void deleteProfessor(@RequestParam String id){
        professorService.deleteProfessor(id);
    }
}
