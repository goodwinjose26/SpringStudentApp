package com.example.studentapp2_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@GetMapping("/")
    public  String homepage()
{
    return "welcome";
}

@GetMapping("/content")
    public String contentpage()
{
    return  "welcome to contentpage";
}

}

