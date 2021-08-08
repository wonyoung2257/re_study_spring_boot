//package com.example.re_study_spring_boot;
//
//import com.example.re_study_spring_boot.model.Member;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.util.Map;
//
//public class Main {
//    public static void main(String[] args) throws Exception {
//        ObjectMapper mapper = new ObjectMapper();
//
//        Member user= new Member();
//        user.setId("korea");
//        user.setName("jb");
//        user.setOrg("koscom");
//
//        String json = mapper.writeValueAsString(user);
//        System.out.println("json = " + json);
//
//        Member deserUser = mapper.readValue(json, Member.class);
//        System.out.println("deserUser = " + deserUser);
//
//        Map<String, Object> deserMap= mapper.readValue(json,Map.class);
//        System.out.println("deserMap = " + deserMap);
//    }
//}
