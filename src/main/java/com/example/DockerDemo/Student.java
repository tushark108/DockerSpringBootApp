package com.example.DockerDemo;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @Column(name = "roll_no")
    private Long rollNo;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String department;

    // ✅ No-arg constructor (required by JPA)
    public Student() {
    }

    // ✅ Parameterized constructor
    public Student(Long rollNo, String name, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
    }

    // ✅ Getters and Setters
    public Long getRollNo() {
        return rollNo;
    }

    public void setRollNo(Long rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
