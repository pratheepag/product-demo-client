package com.example.productdemoclient.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "Product")
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Product {
    private int id;
    private String description;

}