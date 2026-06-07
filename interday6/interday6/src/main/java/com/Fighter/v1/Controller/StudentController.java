package com.Fighter.Dubakur.Controller;

import com.Fighter.Dubakur.Model.Student;
import com.Fighter.Dubakur.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService ss;
    @GetMapping("students")
    public List<Student> getAllStudents(){
        return ss.getAllStudent();
    }
}
