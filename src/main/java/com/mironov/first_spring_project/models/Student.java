package com.mironov.first_spring_project.models;


import lombok.*;

@Builder
@Data
public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String program;
    private String studyYear;
    private String birthday;
    private boolean isDebt;

}
