package com.accenture.gtic.agenticai.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "brands")
public class Brand {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String brandName;
        private String emailId;
        private String PINCode;
        private String GSTNumber;
        private String marketSize;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getBrandName() {
                return brandName;
        }

        public void setBrandName(String brandName) {
                this.brandName = brandName;
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

        public String getGSTNumber() {
                return GSTNumber;
        }

        public void setGSTNumber(String GSTNumber) {
                this.GSTNumber = GSTNumber;
        }

        public String getMarketSize() {
                return marketSize;
        }

        public void setMarketSize(String marketSize) {
                this.marketSize = marketSize;
        }

        public ProductDetails getProductDetails() {
                return productDetails;
        }

        public void setProductDetails(ProductDetails productDetails) {
                this.productDetails = productDetails;
        }

        @OneToOne(cascade = CascadeType.ALL)
        private ProductDetails productDetails;
    }

