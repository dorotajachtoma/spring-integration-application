package com.registrationapp.repository;


import com.registrationapp.model.PricingCategory;
import com.registrationapp.model.TicketPrice;
import com.registrationapp.model.TicketType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TicketPriceRepository extends JpaRepository<TicketPrice, Long> {

    @Query("from TicketPrice tp left join fetch tp.ticketType left join fetch tp.pricingCategory")
    List<TicketPrice> findAll();

    Optional<TicketPrice> findByTicketTypeAndPricingCategory(TicketType ticketType, PricingCategory pricingCategory);

}
