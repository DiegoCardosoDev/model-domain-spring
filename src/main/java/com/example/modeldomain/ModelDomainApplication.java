package com.example.modeldomain;

import com.example.modeldomain.entities.Client;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModelDomainApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ModelDomainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Client client1 = new Client(null, "Diego cardoso", "diegocardoso2gmail.com");
        Client client2 = new Client(null, "Saphyra Nogueira", "diegocardoso2gmail.com");
        Client client3 = new Client(null, "Tamires Da silva", "diegocardoso2gmail.com");
        Client client4 = new Client(null, "Cristhopher cardoso", "diegocardoso2gmail.com");
    }
}
