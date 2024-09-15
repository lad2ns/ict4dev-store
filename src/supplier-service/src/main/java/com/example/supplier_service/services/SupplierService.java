package com.example.supplier_service.services;

import java.util.ArrayList;
import java.util.List;

import com.example.supplier_service.models.SupplierModel;

public class SupplierService {
    public List<SupplierModel> getAll() {
        List<SupplierModel> supliers = new ArrayList<>();

        supliers.add(new SupplierModel("1", "Game Store Zone"));
        supliers.add(new SupplierModel("2", "Station Computer"));

        return supliers;
    }
}
