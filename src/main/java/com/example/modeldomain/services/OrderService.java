package com.example.modeldomain.services;

import com.example.modeldomain.dto.OrderDTO;
import com.example.modeldomain.entities.Order;
import com.example.modeldomain.repositories.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@Service
public class OrderService {


    private OrderRepository orderRepository;

   public List<Order> findAll(){
       return orderRepository.findAll();
   }

    public Order findById(Long id){
        Optional<Order> order = orderRepository.findById(id);
        return order.orElseThrow(()-> new RuntimeException("order nao encontrada" + Order.class.getName()));
    }
}
