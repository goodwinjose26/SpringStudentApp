package com.example.studentapp2_backend.controller;

import com.example.studentapp2_backend.dao.StudentDao;
import com.example.studentapp2_backend.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentDao dao;
@GetMapping("/")
    public  String homepage()
{
    return "welcome";
}

@CrossOrigin(origins = "*")
@PostMapping(path="/add",consumes = "application/json", produces = "application/json")
    public String add(@RequestBody Students s)
{
    //System.out.println(s.toString());
    dao.save(s);
    return  "student details added successfully";
}


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Students> searchStudent(@RequestBody Students s)
    {
        String admno=String.valueOf(s.getAdmno());
        System.out.println(admno);
        return (List<Students>) dao.searchStudent(s.getAdmno());
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Students> view()
    {
        return (List<Students>) dao.findAll();
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> delete(@RequestBody Students s)
    {
        String id=String.valueOf(s.getId());
        System.out.println(id);
        dao.deleteStudent(s.getId());
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }



}

