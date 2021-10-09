package com.fran.AppTwo.Service.Implementation;

import com.fran.AppTwo.Model.Ticket;
import com.fran.AppTwo.Repository.TicketRepository;
import com.fran.AppTwo.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImplementation implements TicketService {

    private final TicketRepository ticketRepository;


    @Autowired
    public TicketServiceImplementation(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Ticket insertTicket(int totalPrice) {
        return ticketRepository.insertTicket(totalPrice);
    }
}
