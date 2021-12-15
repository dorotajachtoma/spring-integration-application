package com.registrationapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pricing_categories")
public class PricingCategory {

    @Id
    @Column(name = "pricing_category_code", unique = true, nullable = false, length = 1)
    private String code;

    @Column(name = "pricing_category_name", nullable = false, length = 20)
    private String name;

    @Column(name = "pricing_start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "pricing_end_date", nullable = false)
    private LocalDate endDate;
}
