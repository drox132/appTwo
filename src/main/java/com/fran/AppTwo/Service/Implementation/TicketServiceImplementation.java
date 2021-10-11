package com.fran.AppTwo.Service.Implementation;

import com.fran.AppTwo.Model.Ticket;
import com.fran.AppTwo.Repository.TicketRepository;
import com.fran.AppTwo.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public int totalprecioCompra(List<Integer> listaProductosComprados) {

        int  resultadoTotal=0;
     /*   for (int indice=0; indice < listaProductosComprados.size(); indice++ ){

            int numeroParaSumar= listaProductosComprados.get(indice);
            resultadoTotal= resultadoTotal+numeroParaSumar;
        }*/

        for (int particularPrice: listaProductosComprados){
            resultadoTotal=resultadoTotal+particularPrice;
        }
        return resultadoTotal;
    }


}
