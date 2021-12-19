package com.techamniac_conferention.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "discount_codes")
@SequenceGenerator(name = "discount_codes_gen", sequenceName = "discount_codes_seq", allocationSize = 1)
public class DiscountCode {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "discount_codes_gen")
    @Column(name = "discount_code_id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "discount_code", nullable = false, length = 20)
    private String code;

    @Column(name = "discount_name", nullable = false, length = 30)
    private String name;

    @Column(name = "discount_type", nullable = false, length = 1)
    private String type;

    @Column(name = "discount_amount", nullable = false, precision = 8, scale = 2)
    private BigDecimal amount;


}
