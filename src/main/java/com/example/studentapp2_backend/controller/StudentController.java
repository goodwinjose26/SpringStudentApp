package com.example.studentapp2_backend.controller;

import com.example.studentapp2_backend.model.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@GetMapping("/")
    public  String homepage()
{
    return "welcome";
}

@PostMapping(path="/add",consumes = "application/json", produces = "application/json")
    public String add(@RequestBody Students s)
{
    System.out.println(s.toString());
    return  "student details added successfully";
}


}

