package com.techamniac_conferention.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AttendeeRegistration {

    @NotNull
    @Pattern(regexp = "[PSC]")
    private String ticketType;

    private String discountCode;

    @NotNull
    @Size(min = 1, max = 30)
    private String firstName;

    @NotNull
    @Size(min = 1, max = 30)
    private String lastName;

    @NotNull
    @Size(min = 3, max = 80)
    @Pattern(regexp = ".+@.+")
    private String email;

    @Size(max = 20)
    private String phoneNumber;

    @Size(max = 40)
    private String title;

    @Size(max = 50)
    private String company;

}
