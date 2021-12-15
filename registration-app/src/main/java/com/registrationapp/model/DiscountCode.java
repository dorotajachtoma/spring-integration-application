package com.registrationapp.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "discount_codes")
@SequenceGenerator(name = "discount_codes_gen", sequenceName = "discount_codes_seq", allocationSize = 1)
public class DiscountCode {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "discount_codes_gen")
    @Column(name = "discount_code_id", unique = true, nullable = false)
    private Long id;

    @Column(name = "discount_code", nullable = false, length = 20)
    private String code;

    @Column(name = "discount_name", nullable = false, length = 30)
    private String name;

    @Column(name = "discount_type", nullable = false, length = 1)
    private String type;

    @Column(name = "discount_amount", nullable = false, precision = 8, scale = 2)
    private BigDecimal amount;

}