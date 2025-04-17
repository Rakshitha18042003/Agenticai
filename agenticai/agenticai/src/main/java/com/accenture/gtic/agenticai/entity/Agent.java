package com.accenture.gtic.agenticai.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "agents")
public class Agent {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String agentName;
        private String emailId;
        private String PINCode;
        private String aadharNumber;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getAgentName() {
                return agentName;
        }

        public void setAgentName(String agentName) {
                this.agentName = agentName;
        }

        public String getEmailId() {
                return emailId;
        }

        public void setEmailId(String emailId) {
                this.emailId = emailId;
        }

        public String getPINCode() {
                return PINCode;
        }

        public void setPINCode(String PINCode) {
                this.PINCode = PINCode;
        }

        public String getAadharNumber() {
                return aadharNumber;
        }

        public void setAadharNumber(String aadharNumber) {
                this.aadharNumber = aadharNumber;
        }

        public BankDetails getBankDetails() {
                return bankDetails;
        }

        public void setBankDetails(BankDetails bankDetails) {
                this.bankDetails = bankDetails;
        }

        @OneToOne(cascade = CascadeType.ALL)
        private BankDetails bankDetails;
    }

