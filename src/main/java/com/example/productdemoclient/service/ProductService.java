package com.example.productdemoclient.service;

import java.util.Collections;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;
import org.springframework.stereotype.Service;

import com.example.productdemoclient.model.Product;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@Service
public class ProductService {
    
    public Product getProductById(int productId) {
        Client client = ClientBuilder.newBuilder().newClient().register(JacksonJsonProvider.class);
        WebTarget target = client.target("http://localhost:8080/services/");
        target = target.path("products").path(String.valueOf(productId));
         
        Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON_TYPE);
        Response response = builder.get();
        return builder.get(Product.class);
    }
}
