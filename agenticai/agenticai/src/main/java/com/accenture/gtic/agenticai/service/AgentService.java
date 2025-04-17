package com.accenture.gtic.agenticai.service;

import com.accenture.gtic.agenticai.dto.AgentRegistrationDTO;
import com.accenture.gtic.agenticai.entity.Agent;
import com.accenture.gtic.agenticai.entity.BankDetails;
import com.accenture.gtic.agenticai.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    @Service
    public class AgentService {
        @Autowired
        private AgentRepository agentRepository;

        public void registerAgent(AgentRegistrationDTO dto) {
            BankDetails bank = new BankDetails();
            bank.setName(dto.getBankDetails().getName());
            bank.setAccountNumber(dto.getBankDetails().getAccountNumber());
            bank.setIFSCCode(dto.getBankDetails().getIFSCCode());
            bank.setBranchName(dto.getBankDetails().getBranchName());

            Agent agent = new Agent();
            agent.setAgentName(dto.getAgentName());
            agent.setEmailId(dto.getEmailId());
            agent.setPINCode(dto.getPINCode());
            agent.setAadharNumber(dto.getAadharNumber());
            agent.setBankDetails(bank);

            agentRepository.save(agent);
        }
    }
