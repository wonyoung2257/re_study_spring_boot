package com.example.re_study_spring_boot.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Member {

    @Id
    @GeneratedValue
    Long seq;
    String id;
    String name;
    String org;
    Boolean active;

}
