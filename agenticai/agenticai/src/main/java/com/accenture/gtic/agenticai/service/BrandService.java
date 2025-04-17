package com.accenture.gtic.agenticai.service;

import com.accenture.gtic.agenticai.dto.BrandRegistrationDTO;
import com.accenture.gtic.agenticai.entity.Brand;
import com.accenture.gtic.agenticai.entity.ProductDetails;
import com.accenture.gtic.agenticai.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandService {
    @Autowired
    private BrandRepository brandRepository;

    public void registerBrand(BrandRegistrationDTO dto) {
        ProductDetails product = new ProductDetails();
        product.setName(dto.getProductDetails().getName());
        product.setModel(dto.getProductDetails().getModel());

        Brand brand = new Brand();
        brand.setBrandName(dto.getBrandName());
        brand.setEmailId(dto.getEmailId());
        brand.setPINCode(dto.getPINCode());
        brand.setGSTNumber(dto.getGSTNumber());
        brand.setMarketSize(dto.getMarketSize());
        brand.setProductDetails(product);

        brandRepository.save(brand);
    }
}

