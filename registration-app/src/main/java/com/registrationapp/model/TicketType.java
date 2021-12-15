package com.registrationapp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ticket_types")
public class TicketType {

    @Id
    @Column(name = "ticket_type_code", unique = true, nullable = false, length = 1)
    private String code;

    @Column(name = "ticket_type_name", nullable = false, length = 30)
    private String name;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Column(name = "includes_workshop", nullable = false)
    private boolean includesWorkshop;
}