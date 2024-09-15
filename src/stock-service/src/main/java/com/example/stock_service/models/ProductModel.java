package com.example.stock_service.models;

public class ProductModel {
    public String id;
    public String name;
    public double price;
    public int qtd;
    
    public ProductModel(String id, String name, double price, int qtd) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qtd = qtd;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
