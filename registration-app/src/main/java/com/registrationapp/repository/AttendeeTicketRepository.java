package com.registrationapp.repository;


import com.registrationapp.model.AttendeeTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface AttendeeTicketRepository extends JpaRepository<AttendeeTicket, Long> {

    @Query("from AttendeeTicket at left join fetch at.attendee left join fetch at.ticketPrice left join fetch at.discountCode where at.id = :id")
    Optional<AttendeeTicket> findById(@Param("id") int id);

    @Query("from AttendeeTicket at left join fetch at.attendee left join fetch at.ticketPrice left join fetch at.discountCode where at.ticketCode = :ticketCode")
    Optional<AttendeeTicket> findByTicketCode(@Param("ticketCode") String ticketCode);
}
