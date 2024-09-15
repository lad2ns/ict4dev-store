package com.example.stock_service.models;

import java.util.ArrayList;
import java.util.List;

public class StockModel {
    public ProductModel productModel;
    public int qtd;

    public StockModel(ProductModel productModel, int qtd) {
        this.productModel = productModel;
        this.qtd = qtd;
    }
    public ProductModel getProductModel() {
        return productModel;
    }
    public void setProductModel(ProductModel productModel) {
        this.productModel = productModel;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public static List<StockModel> getStock() {
        List<StockModel> stock = new ArrayList<StockModel>();
        stock.add(new StockModel(new ProductModel("123", "Mousepad", 2000, 1), 3));
        
        return stock;
    }

}
