package com.fran.AppTwo.Service;

import com.fran.AppTwo.Model.Ticket;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface TicketService {

    Ticket insertTicket (int totalPrice);

    int totalprecioCompra (List<Integer> listaProductosComprados);
}
