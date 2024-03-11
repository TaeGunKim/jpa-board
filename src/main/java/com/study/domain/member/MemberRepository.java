package com.study.domain.member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    public Member findMemberByName(String name);

    public List<Member> findMemberByGender(Gender gender);
}
