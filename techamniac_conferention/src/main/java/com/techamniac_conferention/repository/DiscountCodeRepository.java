package com.techamniac_conferention.repository;

import com.techamniac_conferention.model.DiscountCode;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface DiscountCodeRepository extends JpaRepository<DiscountCode, Integer> {

    Optional<DiscountCode> findByCode(String code);
}
