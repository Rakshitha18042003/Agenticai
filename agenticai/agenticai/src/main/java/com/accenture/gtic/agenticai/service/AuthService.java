package com.accenture.gtic.agenticai.service;

import com.accenture.gtic.agenticai.dto.AgentRegistrationDTO;
import com.accenture.gtic.agenticai.entity.Agent;
import com.accenture.gtic.agenticai.entity.BankDetails;
import com.accenture.gtic.agenticai.entity.User;
import com.accenture.gtic.agenticai.repository.UserRepository;
import com.accenture.gtic.agenticai.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    public boolean authenticate(String username, String password) {
        return userRepository.findByUsername(username)
                .map(user -> user.getPassword().equals(password)) // replace with hash check later
                .orElse(false);
    }

    public String getUserType(String username) {
        return userRepository.findByUsername(username)
                .map(User::getUserType)
                .orElse("UNKNOWN");
    }
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
        agent.setPassword(dto.getPassword()); // <- NEW

        agentRepository.save(agent);
    }


}
