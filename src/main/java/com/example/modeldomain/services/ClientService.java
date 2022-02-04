package com.example.modeldomain.services;


import com.example.modeldomain.entities.Client;
import com.example.modeldomain.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ClientService {

    private ClientRepository clientRepository;

    public List<Client> findAll(){
        List<Client> list =clientRepository.findAll();
        return list;
    }

    public Client findById(Long id){
        Optional<Client> obj = clientRepository.findById(id);

        return obj.orElseThrow(()-> new RuntimeException(
                "obj nao encontrado" + Client.class.getName()));


    }
}
