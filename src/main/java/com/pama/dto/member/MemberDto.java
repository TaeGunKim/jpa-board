package com.pama.dto.member;

import com.pama.domain.member.Member;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MemberDto {

    private Long id;
    private String memberId;
    private String memberPassword;
    private String memberName;
    private LocalDate memberBirthDate;
    private LocalDate memberJoinDate;

    public static MemberDto toDto(Member entity){
        return MemberDto.builder()
                .id(entity.getId())
                .memberId(entity.getMemberId())
                .memberPassword(entity.getMemberPassword())
                .memberName(entity.getMemberName())
                .memberBirthDate(entity.getMemberBirthDate())
                .memberJoinDate(entity.getMemberJoinDate())
                .build();
    }

}
