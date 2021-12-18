package com.registrationapp.repository;


import com.registrationapp.model.PricingCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricingCodeRepository extends JpaRepository<PricingCategory, String> {

}
