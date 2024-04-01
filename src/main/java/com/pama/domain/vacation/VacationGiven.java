package com.pama.domain.vacation;

import com.pama.domain.member.Member;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="vacation_given")
public class VacationGiven {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vacation_given_seq")
    private Long id;

    @Column(name = "vacation_given_member_id")
    private String vacationGivenMemberId;

    @Column(name = "vacation_given_start_date")
    private LocalDate vacationGivenStartDate;

    @Column(name = "vacation_given_end_date")
    private LocalDate vacationGivenEndDate;

    @Column(name = "vacation_given_type")
    private String vacationGivenType;

    @Column(name = "vacation_given_title")
    private String vacationGivenTitle;

    @Column(name = "vacation_given_date")
    private int vacationGivenDate;

    @Column(name = "vacation_given_desc")
    private String vacationGivenDesc;

    @Column(name = "vacation_given_create_id")
    private String vacationGivenCreatedId;

    @Builder
    public VacationGiven(
            String vacationGivenMemberId,
            LocalDate vacationGivenStartDate,
            LocalDate vacationGivenEndDate,
            String vacationGivenType,
            String vacationGivenTitle,
            int vacationGivenDate,
            String vacationGivenDesc,
            String vacationGivenCreatedId
        ) {
        this.vacationGivenMemberId = vacationGivenMemberId;
        this.vacationGivenStartDate = vacationGivenStartDate;
        this.vacationGivenEndDate = vacationGivenEndDate;
        this.vacationGivenType = vacationGivenType;
        this.vacationGivenTitle = vacationGivenTitle;
        this.vacationGivenDate = vacationGivenDate;
        this.vacationGivenDesc = vacationGivenDesc;
        this.vacationGivenCreatedId = vacationGivenCreatedId;
    }
}
