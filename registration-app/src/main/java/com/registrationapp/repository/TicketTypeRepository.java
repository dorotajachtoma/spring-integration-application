package com.registrationapp.repository;


import com.registrationapp.model.TicketType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TicketTypeRepository extends JpaRepository<TicketType, Long> {

    Optional<TicketType> findByCode(String code);

}
