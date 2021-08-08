package com.example.re_study_spring_boot.controller;

import com.example.re_study_spring_boot.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Controller
@Slf4j
public class HelloController2 {

    MemberService memberService;

    @Autowired
    private void setMemberService(MemberService memberService){
        this.memberService = memberService;
    }

    @GetMapping("hello-string2")
    @ResponseBody
    public String helloString(String name){
        return memberService.greet(name);
    }

    @GetMapping("hello-mvc2")
    public String helloTempleate(String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";

    }

    @PostConstruct
    public void postConstruct(){
        log.info("I am already CONSTRUCTED");
    }

    @PreDestroy
    public void preDestroy(){
        log.info("here");
        log.info("I will be destroyed.");
    }
}
