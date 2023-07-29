package com.example.springunittest.service;

import com.example.springunittest.entity.Student;
import com.example.springunittest.persistence.StudentInterface;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    @NonNull private StudentInterface studentInterface;

    public void saveStudent(Student s) {
        studentInterface.save(s);
    }
}
