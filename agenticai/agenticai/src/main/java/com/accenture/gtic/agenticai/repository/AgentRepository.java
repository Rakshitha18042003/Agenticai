package com.accenture.gtic.agenticai.repository;

import com.accenture.gtic.agenticai.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long> {}
