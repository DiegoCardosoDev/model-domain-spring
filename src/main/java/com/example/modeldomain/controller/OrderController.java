package com.example.modeldomain.controller;

import com.example.modeldomain.dto.OrderDTO;
import com.example.modeldomain.entities.Order;
import com.example.modeldomain.services.OrderService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/orders")
public class OrderController {


    private OrderService orderService;
    private ModelMapper mapper;


    @GetMapping
    public ResponseEntity<List<OrderDTO>> findAll() {
        return ResponseEntity.ok()
                .body(orderService.findAll().stream().map(x -> mapper.map(x, OrderDTO.class)).collect(Collectors.toList()));

    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order order = this.orderService.findById(id);
        return ResponseEntity.ok().body(order);
    }
}
