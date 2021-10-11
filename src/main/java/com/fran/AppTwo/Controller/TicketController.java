package com.fran.AppTwo.Controller;


import com.fran.AppTwo.Model.Ticket;
import com.fran.AppTwo.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/ticket")
public class TicketController {

    private final TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping ("/insertticket")
    public Ticket insertTicket (@RequestBody Ticket totalPrice) {
        return ticketService.insertTicket(totalPrice.getTotalPrice());
    }

    @PostMapping ("/totalticketcompra")
    public int totalprecioCompra(@RequestBody List<Integer> listaProductosComprados) {
        return 1;



    }


}
