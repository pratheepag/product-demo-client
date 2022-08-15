package com.example.productdemoclient.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.example.productdemoclient.model.Product;

@Service
public class ProductService {
    
    public Product getProductById(int productId) {
        
        Client client = ClientBuilder.newBuilder().newClient();
        WebTarget target = client.target("http://localhost:8080/services/");
        target = target.path("products").path(String.valueOf(productId));
         
        Invocation.Builder builder = target.request();
        Response response = builder.get();
        return builder.get(Product.class);
    }
}
