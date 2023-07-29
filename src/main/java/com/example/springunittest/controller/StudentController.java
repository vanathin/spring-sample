package com.example.springunittest.controller;

import com.example.springunittest.entity.Student;
import com.example.springunittest.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    @NonNull private StudentService studentService;



    @PostMapping(value = "/save", produces = "application/json")
    public ResponseEntity<ResponseWrapper> saveInvoice(@RequestBody Student student) {
        studentService.saveStudent(student);
        ResponseWrapper responseWrapper = ResponseWrapper.builder()
                .data(student)
                .message("SUCCESS")
                .status("true")
                .build();
        return ResponseEntity.ok(responseWrapper);
    }
}
