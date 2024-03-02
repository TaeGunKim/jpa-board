package com.pama.domain.common;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@MappedSuperclass
public abstract class BaseTimeEntity {

    @Column(name = "created_date")
    private String createdDate;   // 생성일시

    @Column(name = "modified_date")
    private String modifiedDate;  // 최종 수정일시

    @PrePersist
    public void prePersist() {
        this.createdDate = currentDateTime();
    }

    @PreUpdate
    public void preUpdate() {
        this.modifiedDate = currentDateTime();
    }


    public String currentDateTime(){
        // 현재 날짜 및 시간 얻기
        LocalDateTime currentDateTime = LocalDateTime.now();

        // 원하는 형식으로 날짜 출력
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("현재 날짜 및 시간: " + formattedDateTime);
        return formattedDateTime;
    }

}
