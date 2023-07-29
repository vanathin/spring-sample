package com.example.springunittest.persistence;

import com.example.springunittest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentInterface extends JpaRepository<Student, Long> {
}
