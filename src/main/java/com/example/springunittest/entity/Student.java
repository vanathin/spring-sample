package com.example.springunittest.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
}
