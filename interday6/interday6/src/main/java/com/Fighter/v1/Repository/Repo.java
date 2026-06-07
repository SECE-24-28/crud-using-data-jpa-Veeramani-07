package com.Fighter.Dubakur.Repository;

import com.Fighter.Dubakur.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Student, Integer> {
}
