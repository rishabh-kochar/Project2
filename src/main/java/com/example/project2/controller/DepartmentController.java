package com.example.project2.controller;

import com.example.project2.dto.DepartmentDTO;
import com.example.project2.entity.Department;
import com.example.project2.service.DepartmentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
Developed by Chaman
 */
@RestController
@RequestMapping("/department")
public class DepartmentController  {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/addDepartment")
    public void addDepartment(@RequestBody DepartmentDTO departmentDTO){
        System.out.println(departmentDTO.toString());
        Department department=new Department();
        BeanUtils.copyProperties(departmentDTO,department);
        departmentService.addDepartment(department);
    }

    @GetMapping("/getDepartment")
    public void getDepartment(@RequestParam String id){
        departmentService.getDepartment(id);
    }


}
