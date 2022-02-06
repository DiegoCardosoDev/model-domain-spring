package com.example.modeldomain.dto;

import com.example.modeldomain.entities.Client;
import com.example.modeldomain.entities.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

    private Order order;
    private Client client;


}
