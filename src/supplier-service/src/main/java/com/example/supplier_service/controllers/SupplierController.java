package com.example.supplier_service.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.supplier_service.models.SupplierModel;
import com.example.supplier_service.services.SupplierService;

@RestController
@RequestMapping("/api/v1/supplier")
public class SupplierController {
    private SupplierService service = new SupplierService();

    @GetMapping("all")
    public List<SupplierModel> getHistory() {
        return service.getAll();
    }
}