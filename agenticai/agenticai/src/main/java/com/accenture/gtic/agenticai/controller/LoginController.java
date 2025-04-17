package com.accenture.gtic.agenticai.controller;

import com.accenture.gtic.agenticai.dto.AgentRegistrationDTO;
import com.accenture.gtic.agenticai.dto.BrandRegistrationDTO;
import com.accenture.gtic.agenticai.dto.LoginRequest;
import com.accenture.gtic.agenticai.service.AgentService;
import com.accenture.gtic.agenticai.service.AuthService;
import com.accenture.gtic.agenticai.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/v1")
public class LoginController {

    @Autowired
    private AuthService authService;
    @Autowired
    private AgentService agentService;
    @Autowired
    private BrandService brandService;

    @PostMapping("/login")
    public ResponseEntity<?> userLogin(@RequestBody LoginRequest userDetail) {
        boolean authenticated = authService.authenticate(userDetail.getUsername(), userDetail.getPassword());
        if (!authenticated) return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");

        String userType = authService.getUserType(userDetail.getUsername());
        return ResponseEntity.ok(Map.of("message", "Login successful", "userType", userType));
    }

    @PostMapping("/submitAgentForm")
    public ResponseEntity<?> submitAgentForm(@RequestBody AgentRegistrationDTO userForm) {
        agentService.registerAgent(userForm);
        return ResponseEntity.ok("Agent registered successfully");
    }

    @PostMapping("/submitBrandForm")
    public ResponseEntity<?> submitBrandForm(@RequestBody BrandRegistrationDTO userFormBrand) {
        brandService.registerBrand(userFormBrand);
        return ResponseEntity.ok("Brand registered successfully");

    }

    @PostMapping(value = "/v1/submitConsentForm")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity submitConsentForm() {
        return ResponseEntity.ok().build();
    }

    @PostMapping(value = "/v1/brandProductProbabilityScoreList")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity brandProductProbabilityScoreList() {
        return ResponseEntity.ok().build();
    }
}

