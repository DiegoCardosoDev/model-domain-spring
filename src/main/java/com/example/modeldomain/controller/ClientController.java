package com.example.modeldomain.controller;

import com.example.modeldomain.entities.Client;
import com.example.modeldomain.services.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/products")
public class ClientController {

    private ClientService clientService;

    @GetMapping
    public ResponseEntity<List<Client>> findAll(){
        List<Client> list = clientService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Client> findbyId(@PathVariable Long id){
        Client obj = this.clientService.findById(id);
        return ResponseEntity.ok().body( obj);
    }
}
