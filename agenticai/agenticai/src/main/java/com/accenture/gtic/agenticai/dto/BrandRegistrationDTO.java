package com.accenture.gtic.agenticai.dto;

public class BrandRegistrationDTO {
    private String brandName;
    private String emailId;
    private String PINCode;
    private String GSTNumber;
    private ProductDetailsDTO productDetails;
    private String marketSize;

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

    public ProductDetailsDTO getProductDetails() {
        return productDetails;
    }
    public void setProductDetails(ProductDetailsDTO productDetails) {
        this.productDetails = productDetails;
    }

    public String getMarketSize() {
        return marketSize;
    }
    public void setMarketSize(String marketSize) {
        this.marketSize = marketSize;
    }
}

