package com.pama.service;

import com.pama.domain.member.Member;
import com.pama.dto.member.MemberDto;
import com.pama.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {

    private final MemberRepository memberRepository;
    private final Logger logger = LoggerFactory.getLogger(getClass());


    public MemberDto saveMember(MemberDto memberDto){
        //DTO to Entity
        Member entity = Member.toEntity(memberDto);
        logger.info("To Entity : " + entity.toString());

        // save action
        Member saveEntity = memberRepository.save(entity);
        logger.info("save Entity : " + saveEntity.toString());

        // Entity to DTO
        MemberDto dto = MemberDto.toDto(saveEntity);
        logger.info("To DTO : " + dto);

        return dto;
    }


    public MemberDto getMemberOne(MemberDto memberDto){
        Member entity = Member.toEntity(memberDto);

        Member memberOneEntity = memberRepository.findMemberByMemberId(entity.getMemberId());

        MemberDto dto = MemberDto.toDto(memberOneEntity);
        logger.info("to DTO : " + dto);
        return dto;
    }

    public List<MemberDto> getMemberList(){
        List<Member> memberListEntity = memberRepository.findAll();


        List<MemberDto> memberListDto = memberListEntity.stream().map(MemberDto::toDto).collect(Collectors.toList());

        return memberListDto;

    }
}
