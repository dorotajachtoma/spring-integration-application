package com.registrationapp.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "attendees")
@SequenceGenerator(name = "attendees_gen", sequenceName = "attendees_seq", allocationSize = 1)
public class Attendee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "attendees_gen")
    @Column(name = "attendee_id", unique = true, nullable = false)
    private Long id;

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
