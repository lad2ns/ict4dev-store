package com.example.product_service.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product_service.models.ProductModel;
import com.example.product_service.services.ProductService;

@RestController
@RequestMapping("/api/v1/products")
public class PaymentController {
    private ProductService service = new ProductService();

    @GetMapping("all")
    public List<ProductModel> getHistory() {
        return service.getAll();
    }
}