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
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "attendees")
@SequenceGenerator(name = "attendees_gen", sequenceName = "attendees_seq", allocationSize = 1)
public class Attendee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "attendees_gen")
    @Column(name = "attendee_id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "first_name", nullable = false, length = 30)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 30)
    private String lastName;

    @Column(name = "email", unique = true, nullable = false, length = 80)
    private String email;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

    @Column(name = "title", length = 40)
    private String title;

    @Column(name = "company", length = 50)
    private String company;


}
