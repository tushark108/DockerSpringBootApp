package com.example.DockerDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    Long rollNo = 1L;
    @Autowired
    StudentRepo studentRepo;

    @GetMapping("/get")
    public List<Student> getStudent(){
        return studentRepo.findAll();
    }

    @GetMapping("/add")
    public Student addStudent(){
      Student s1 = new Student();

      s1.setName("A"+rollNo);
      s1.setRollNo(rollNo++);
      s1.setDepartment("Science");
      studentRepo.save(s1);
      return s1;
    }

}
