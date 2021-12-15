package com.registrationapp.repository;


import com.registrationapp.model.AttendeeTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendeeTicketRepository extends JpaRepository<AttendeeTicket, Long> {
}
