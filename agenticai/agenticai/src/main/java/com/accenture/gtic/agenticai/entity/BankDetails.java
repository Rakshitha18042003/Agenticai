package com.accenture.gtic.agenticai.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bank_details")
public class BankDetails {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String accountNumber;
        private String IFSCCode;
        private String branchName;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getAccountNumber() {
                return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
                this.accountNumber = accountNumber;
        }

        public String getIFSCCode() {
                return IFSCCode;
        }

        public void setIFSCCode(String IFSCCode) {
                this.IFSCCode = IFSCCode;
        }

        public String getBranchName() {
                return branchName;
        }

        public void setBranchName(String branchName) {
                this.branchName = branchName;
        }
}


