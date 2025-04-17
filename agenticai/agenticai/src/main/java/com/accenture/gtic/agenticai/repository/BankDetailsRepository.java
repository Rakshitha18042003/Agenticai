package com.accenture.gtic.agenticai.repository;

import com.accenture.gtic.agenticai.entity.BankDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankDetailsRepository extends JpaRepository<BankDetails, Long> {}
