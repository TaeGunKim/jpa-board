package com.study;

import com.study.domain.member.Member;
import com.study.domain.vacation.VacationGiven;
import com.study.dto.member.MemberDto;
import com.study.repository.MemberRepository;
import com.study.repository.VacationGivenRepository;
import com.study.service.MemberService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
public class MemberRepositoryTest {

//    @Autowired
//    MemberRepository memberOldRepository;

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    VacationGivenRepository vacationGivenRepository;

    @Autowired
    MemberService memberService;



    @Test
    void saveMember(){

        System.out.println("hello world~");

        LocalDate now = LocalDate.now();
        System.out.println(now);

        Member saveParams = Member.builder()
                .memberId("admin1")
                .memberPassword("1234")
                .memberName("관리자1")
                .memberBirthDate(now)
                .memberJoinDate(now)
                .build();

        Member member  = memberRepository.save(saveParams);
        Assertions.assertEquals(member.getMemberId(), "admin1");
    }

    @Test
    void memberList(){
        System.out.println("1111");
        List<Member> list = memberRepository.findAll();
        System.out.println("2222");
        for(Member member : list){
            System.out.println(member);
        }
        System.out.println("3333");
    }

    @Test
    void givenVaction(){

        Member member = memberRepository.findById(1L).get();
        System.out.println(member.getMemberId());
        LocalDate now = LocalDate.now();
        System.out.println(now);

        VacationGiven saveParams = VacationGiven.builder()
                .vacationGivenMemberId(member.getMemberId())
                .vacationGivenStartDate(now)
                .vacationGivenEndDate(now)
                .vacationGivenType("BASIC")
                .vacationGivenTitle("Basic vacation")
                .vacationGivenDate(1)
                .vacationGivenDesc("this is basic vaction")
                .vacationGivenCreatedId("admin")
                .build();
        VacationGiven vacationGiven = vacationGivenRepository.save(saveParams);


//        List<Member> vacationGivens = vacationGivenRepository.findAll();
//        List<Member> vacationGivenList = vacationGivenRepository.findAll();

    }

    @Test
    void givenVacationList(){
        List<VacationGiven> vacationGivenList = vacationGivenRepository.findAll();
        for(VacationGiven given : vacationGivenList){
            System.out.println(given.getVacationGivenMemberId());
            Member member = memberRepository.findMemberByMemberId(given.getVacationGivenMemberId());
            System.out.println(member.getMemberName());
            System.out.println(given.getVacationGivenStartDate());
            System.out.println(given.getVacationGivenEndDate());
            System.out.println(given.getVacationGivenTitle());
        }

    }


    @Test
    void memberListtest(){
        System.out.println("123123");
        List<MemberDto> List = memberService.getMemberList();
        System.out.println(List);
        for(MemberDto m : List){
            System.out.println(m.getMemberId());
            System.out.println(m.getMemberName());
        }
    }



/*
    // 회원 정보 생성
    @Test
    void saveMemberOld() {
        Member saveParams = Member.builder()
                .loginId("dyl6266")
                .password("1234")
                .name("도뎡")
                .gender(Gender.M)
//                .birthday(LocalDate.of(1994, 9, 12))
                .deleteYn(false)
                .build();

        Member member = memberOldRepository.save(saveParams);
        Assertions.assertEquals(member.getLoginId(), "dyl6266");
    }

    // 전체 회원 조회
    @Test
    void findAllMember() {
        memberOldRepository.findAll();
    }

    // 회원 상세정보 조회
    @Test
    void findMemberById() {
        Member member = memberOldRepository.findById(1L).orElseThrow(() -> new EntityNotFoundException());
        Assertions.assertEquals(member.getLoginId(), "dyl6266");
    }

    // 회원 정보 삭제
    @Test
    void deleteMemberById() {
        memberOldRepository.deleteById(1L);
    }


    @Test
    void tgkim(){
        Member member = memberOldRepository.findMemberByName("taegun1");
        if(member != null){
            System.out.println(member.getId());
        }
    }

    @Test
    void tgkim2(){
        List<Member> memberList = memberOldRepository.findMemberByGender(Gender.M);
        if(memberList.size() > 0 ){
            for(Member member : memberList){
                System.out.println(member.getId());
            }
        }
    }*/
}
