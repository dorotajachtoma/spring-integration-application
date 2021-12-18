package com.registrationapp.repository;


import com.registrationapp.model.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface AttendeeRepository extends JpaRepository<Attendee, Long> {
}
