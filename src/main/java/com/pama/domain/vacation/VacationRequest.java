package com.pama.domain.vacation;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.configurationprocessor.json.JSONArray;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="vacation_request")
public class VacationRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vacation_seq")
    private Long id;

    @Column(name = "vacation_request_type")
    private String vacationRequestType;

    @Column(name = "vacation_request_sub_type")
    private String vacationRequestSubType;

    @Column(name = "vacation_request_sign_memeber")
    private String vacationRequest;

    @Column(name = "vacation_request_start_date")
    private LocalDate vacationRequestStartDate;

    @Column(name = "vacation_request_end_date")
    private LocalDate vacationRequestEndDate;

    @Column(name = "vacation_request_create_id")
    private String vacationRequestCreateId;

    @Column(name = "vacation_request_modify_id")
    private String vacationRequestModifyId;




}
