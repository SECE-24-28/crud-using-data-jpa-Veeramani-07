package com.Fighter.Dubakur.Service;

import com.Fighter.Dubakur.Model.Student;
import com.Fighter.Dubakur.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    Repo r;
    public List<Student> getAllStudent() {
        return r.findAll();

    }
}
