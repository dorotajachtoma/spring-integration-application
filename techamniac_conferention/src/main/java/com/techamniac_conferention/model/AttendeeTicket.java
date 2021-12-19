package com.techamniac_conferention.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "attendee_tickets")
@SequenceGenerator(name = "attendee_tickets_gen", sequenceName = "attendee_tickets_seq", allocationSize = 1)
public class AttendeeTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "attendee_tickets_gen")
    @Column(name = "attendee_ticket_id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "ticket_code", unique = true, nullable = false, updatable = false, length = 40)
    private String ticketCode;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false, orphanRemoval = true)
    @JoinColumn(name = "attendee_id", unique = true, nullable = false)
    private Attendee attendee;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ticket_price_id", nullable = false)
    private TicketPrice ticketPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "discount_code_id")
    private DiscountCode discountCode;

    @Column(name = "net_price", nullable = false, precision = 8, scale = 2)
    private BigDecimal netPrice;

}
