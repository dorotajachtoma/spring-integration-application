package com.techamniac_conferention.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ticket_prices")
@SequenceGenerator(name = "ticket_prices_gen", sequenceName = "ticket_prices_seq", allocationSize = 1)
public class TicketPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticket_prices_gen")
    @Column(name = "ticket_price_id", unique = true, nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ticket_type_code", nullable = false)
    private TicketType ticketType;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "pricing_category_code", nullable = false)
    private PricingCategory pricingCategory;

    @Column(name = "base_price", nullable = false, precision = 8, scale = 2)
    private BigDecimal basePrice;

}
