package com.example.productdemoclient.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "Inventory")
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Inventory {
    private int id;
    private Long availableStock;

}