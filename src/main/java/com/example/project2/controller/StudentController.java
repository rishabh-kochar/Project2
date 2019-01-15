package com.example.project2.controller;


import com.example.project2.dto.StudentDTO;
import com.example.project2.entity.Student;
import com.example.project2.service.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/addstudent")
    public Student add(@RequestBody StudentDTO studentDTO) {
        Student student=new Student();
        BeanUtils.copyProperties(studentDTO,student);
        return studentService.add(student);
    }

    @RequestMapping(value = "/selectstudent",method = RequestMethod.GET)
    public void select(@RequestParam String id) {
        Student student=studentService.select(id);
        System.out.println(student);
    }

    @RequestMapping(value = "/updatestudent",method = RequestMethod.PUT)
    public Student update(@RequestBody StudentDTO studentDTO) {
        Student student=new Student();
        BeanUtils.copyProperties(studentDTO,student);
        return studentService.update(student);
    }

    @RequestMapping(value = "/deletestudent",method = RequestMethod.DELETE)
    public void delete(@RequestParam String id) {
        studentService.delete(id);
    }
}
