package com.example.modeldomain;

import com.example.modeldomain.entities.Client;
import com.example.modeldomain.entities.Order;
import com.example.modeldomain.entities.OrderItem;
import com.example.modeldomain.entities.Product;
import com.example.modeldomain.repositories.ClientRepository;
import com.example.modeldomain.repositories.OrdemItemRepository;
import com.example.modeldomain.repositories.OrderRepository;
import com.example.modeldomain.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.Arrays;

@AllArgsConstructor
@SpringBootApplication
public class ModelDomainApplication implements CommandLineRunner {


    private ClientRepository clientRepository;
    private ProductRepository productRepository;
    private OrderRepository orderRepository;
    private OrdemItemRepository ordemItemRepository;


    public static void main(String[] args) {
        SpringApplication.run(ModelDomainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Client client1 = new Client(null, "Diego cardoso", "diegocardoso@gmail.com");
        Client client2 = new Client(null, "Saphyra Nogueira", "saphyra@gmail.com");
        Client client3 = new Client(null, "Tamires Da silva", "tamires@gmail.com");
        Client client4 = new Client(null, "Cristhopher cardoso", "chris.11@gmail.com");

        clientRepository.saveAll(Arrays.asList(client1,client2, client3,client4));

        Product p1 = new Product(null, "TV", 1000.0);
        Product p2 = new Product(null, "Mouse", 40.0);
        Product p3 = new Product(null, "PC", 1200.0);

        productRepository.saveAll(Arrays.asList(p1, p2, p3));

        Order o1 = new Order(null, Instant.parse("2022-02-01T11:25:09Z"), OrderStatus.PAID, client1);
        Order o2 = new Order(null, Instant.parse("2022-02-05T11:25:09Z"), OrderStatus.WAYTING, client1);

        orderRepository.saveAll(Arrays.asList(o1,o2));

        OrderItem item1 = new OrderItem(null,1, 1000.0,p1,o1);
        OrderItem item2 = new OrderItem(null,1, 40.0,p2,o2);

        ordemItemRepository.saveAll(Arrays.asList(item1,item2));




    }
}
