package com.mironov.first_spring_project.service;

import com.mironov.first_spring_project.models.Student;
import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;


@AllArgsConstructor

public class StudentService {

    Student stud;

    public static Map<String,String> getAllData(Student stud){
        Map<String,String> data = new HashMap<>();
        data.put("name", stud.getFirstName());data.put("lastname", stud.getLastName());
        data.put("email", stud.getEmail());data.put("program",stud.getProgram());data.put("studyYear", stud.getStudyYear());
        data.put("birthday", stud.getBirthday());
        return  data;
    }
}
