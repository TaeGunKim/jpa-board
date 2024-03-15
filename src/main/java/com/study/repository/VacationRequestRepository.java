package com.study.repository;

import com.study.domain.vacation.VacationGiven;
import com.study.domain.vacation.VacationRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacationRequestRepository extends JpaRepository<VacationRequest, Long>{


}
