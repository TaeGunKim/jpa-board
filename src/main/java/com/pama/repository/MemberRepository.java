package com.pama.repository;

import com.pama.domain.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    public Member findMemberByMemberIdOrMemberName(String memberId, String memberName);
    public Member findMemberByMemberId(String memberId);

    public List<Member> findAll();


}
