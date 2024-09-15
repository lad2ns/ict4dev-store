package com.example.stock_service.services;

import java.util.List;
import java.util.stream.Collectors;

import com.example.stock_service.models.ProductModel;
import com.example.stock_service.models.StockModel;

public class StockService {
    public List<StockModel> debit(ProductModel product) {
        List<String> stockIds = StockModel.getStock().stream().map(stock -> stock.productModel.getId()).collect(Collectors.toList());
        
        return StockModel.getStock().stream().map(stock -> {
            if (stockIds.contains(product.getId())) {
                stock.setQtd((int) (stock.getQtd() - product.getQtd()));
            }

            return stock;
        }).collect(Collectors.toList());
    }
}
