package com.example.product_service.services;

import java.util.ArrayList;
import java.util.List;

import com.example.product_service.models.ProductModel;

public class ProductService {
    public List<ProductModel> getAll() {
        List<ProductModel> products = new ArrayList<>();

        products.add(new ProductModel("123", "MousePad", 2000.0));
        products.add(new ProductModel("456", "Monitor", 3000));
        products.add(new ProductModel("789", "Keyboard", 1200));

        return products;
    }
}
