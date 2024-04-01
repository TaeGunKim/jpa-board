package com.pama.domain.member;

import com.pama.domain.vacation.VacationGiven;
import com.pama.dto.member.MemberDto;
import jdk.jshell.Snippet;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@Slf4j
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
@Table(name="member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_seq")
    private Long id;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "member_password")
    private String memberPassword;

    @Column(name = "member_name")
    private String memberName;

    @Column(name = "member_birth_date")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate memberBirthDate;

    @Column(name = "member_join_date")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate memberJoinDate;

//    private List<VacationGiven> vacationGivenList = new ArrayList<VacationGiven>();

//    @Builder
//    public Member(String memberId, String memberPassword, String memberName, LocalDate memberBirthDate, LocalDate memberJoinDate){
//        this.memberId = memberId;
//        this.memberPassword = memberPassword;
//        this.memberName = memberName;
//        this.memberBirthDate = memberBirthDate;
//        this.memberJoinDate = memberJoinDate;
//    }

    public static Member toEntity(MemberDto dto){
        return Member.builder()
                .id(dto.getId())
                .memberId(dto.getMemberId())
                .memberPassword(dto.getMemberPassword())
                .memberBirthDate(dto.getMemberBirthDate())
                .memberJoinDate(dto.getMemberJoinDate())
                .build();
    }

}
