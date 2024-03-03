package com.pama.member;

import com.pama.domain.member.Member;
import com.pama.domain.member.MemberRepository;
import com.pama.domain.member.MemberRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
public class MemberController {


    @Autowired
    MemberRepository memberRepository;

    @Autowired
    MemberRepository2 memberRepository2;

    @GetMapping("/hello")
    public String hello(){
        return "Hello world!";
    }

    @GetMapping("/getMember")
    public Member getMember(String id){
//        System.out.println("hello getMember !");
//        Member member = memberRepository.findById(1L).orElseThrow(() -> new EntityNotFoundException());
//
//        System.out.println("hard cord test ------");
//        System.out.println(member.getName());
//        System.out.println(member.toString());


//        if(id != null){
            System.out.println("param cord test ------");
            Long idParam = Long.parseLong(id);
            Member member2 = memberRepository2.findById(idParam).orElseThrow(() -> new EntityNotFoundException());
            System.out.println(member2.getName());
            System.out.println(member2.toString());
//        }
        System.out.println("goodbye~");
        return member2;
    }

    @GetMapping("getMemberList")
    public List<Member> getMemberList(){
        List<Member> memberList = memberRepository2.findAll();
        return memberList;
    }


}
