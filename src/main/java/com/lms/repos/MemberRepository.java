package com.lms.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.model.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
