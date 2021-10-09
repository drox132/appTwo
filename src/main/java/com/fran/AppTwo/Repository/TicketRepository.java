package com.fran.AppTwo.Repository;

import com.fran.AppTwo.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository <Ticket,Integer> {


    @Query (value = "EXEC insertTicket @Finalprice = :totalPrice ", nativeQuery = true )
    Ticket insertTicket (@Param( "totalPrice") int totalPrice);




}
