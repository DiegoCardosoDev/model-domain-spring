package com.example.modeldomain.entities;


import com.example.modeldomain.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.time.Instant;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_order")
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Instant moment;
    private OrderStatus status;
    private Double total;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;


    public Order(Long id, Instant moment, OrderStatus status, Client client) {
        this.id = id;
        this.moment = moment;
        this.status = status;
        this.total = total;
        this.client = client;
    }
}
