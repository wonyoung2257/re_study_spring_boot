package com.example.re_study_spring_boot.service;

import org.springframework.stereotype.Service;

@Service
public class MemberService {
    public String greet(String name){
        return String.format("Welcome, %s", name);
    }
}
