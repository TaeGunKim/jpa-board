package com.pama.repository;

import com.pama.domain.vacation.VacationGiven;
import com.pama.domain.vacation.VacationRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacationRequestRepository extends JpaRepository<VacationRequest, Long>{


}
