package com.accenture.gtic.agenticai.repository;

import com.accenture.gtic.agenticai.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {}
