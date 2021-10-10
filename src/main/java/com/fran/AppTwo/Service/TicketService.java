package com.fran.AppTwo.Service;

import com.fran.AppTwo.Model.Ticket;

import java.util.List;

public interface TicketService {

    Ticket insertTicket (int totalPrice);

    int calculateTotalPrice(List<Integer> priceList);
}
