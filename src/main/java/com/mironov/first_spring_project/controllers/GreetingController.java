package com.mironov.first_spring_project.controllers;
import com.mironov.first_spring_project.models.Student;
import com.mironov.first_spring_project.service.StudentService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String showWelcomePage(){
        return "index";
    }

    @GetMapping("/form")
    public String showForm() {
        return "form";
    }

    @GetMapping("/get-info")
    public String showGetInfoForm(){
        return "test";
    }

    @PostMapping("/submit")
    @ResponseBody
    public Map<String, String> submitForm(@RequestParam Map<String, String> params) {
        Student stud = Student.builder().
                firstName(params.get("name")).
                lastName(params.get("lastname")).
                email(params.get("email")).
                program(params.get("program")).
                studyYear(params.get("studyYear")).build();
        Map<String, String> response = StudentService.getAllData(stud);
        return response;
    }



}