package com.study.controller;

import com.study.dto.member.MemberDto;
import com.study.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/memberList")
    public List<MemberDto> memberDtoList(){
        return memberService.getMemberList();
    }
}
