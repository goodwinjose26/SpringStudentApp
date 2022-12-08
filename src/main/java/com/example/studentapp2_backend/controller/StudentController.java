package com.example.studentapp2_backend.controller;

import com.example.studentapp2_backend.dao.StudentDao;
import com.example.studentapp2_backend.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentDao dao;
@GetMapping("/")
    public  String homepage()
{
    return "welcome";
}

@CrossOrigin()
@PostMapping(path="/add",consumes = "application/json", produces = "application/json")
    public String add(@RequestBody Students s)
{
    System.out.println(s.toString());
    return  "student details added successfully";
}


}

