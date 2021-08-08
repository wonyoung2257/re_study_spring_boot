package com.example.re_study_spring_boot.repository;

import com.example.re_study_spring_boot.model.Member;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {

}
