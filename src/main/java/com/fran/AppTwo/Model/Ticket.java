package com.fran.AppTwo.Model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "ticket")
@Getter
@Setter
@NoArgsConstructor
public class Ticket {

    @Id
    private int id;
    @Column (name= "preciototal")
    private int totalPrice;


    public Ticket(int id, int totalPrice) {
        this.id = id;
        this.totalPrice = totalPrice;
    }

    public Ticket(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
