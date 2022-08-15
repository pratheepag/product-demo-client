package com.example.productdemoclient;
import com.example.productdemoclient.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.productdemoclient.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ProductController {
    
    @Autowired
    private ProductService service;
    
    @Autowired
    private Product productModel;
    
    @RequestMapping(value="/product")
    public String getProduct(
            @RequestParam(name = "productId", required = false, defaultValue = "") String productId, 
            Model model) {
        log.info("Product Id is " + productId);
        if(productId != null && !productId.equals("")) {
            model.addAttribute("product", service.getProductById(Integer.parseInt(productId)));
        }
        return "index";
    }
}
