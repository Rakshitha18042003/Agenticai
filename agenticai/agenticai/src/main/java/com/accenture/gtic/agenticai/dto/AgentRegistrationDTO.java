package com.accenture.gtic.agenticai.dto;
public class AgentRegistrationDTO {
    private String agentName;
    private String emailId;
    private String PINCode;
    private String aadharNumber;
    private BankDetailsDTO bankDetails;

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

    public BankDetailsDTO getBankDetails() {
        return bankDetails;
    }
    public void setBankDetails(BankDetailsDTO bankDetails) {
        this.bankDetails = bankDetails;
    }
}
