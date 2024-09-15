package com.example.stock_service.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stock_service.models.ProductModel;
import com.example.stock_service.models.StockModel;
import com.example.stock_service.services.StockService;

@RestController
@RequestMapping("/api/v1/stock")
public class StockController {
    private StockService service = new StockService();

    @PostMapping("debit")
    public List<StockModel> getHistory(@RequestBody ProductModel model) {
        return service.debit(model);
    }
}