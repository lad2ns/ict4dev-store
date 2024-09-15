package com.example.payment_service.services;

import java.time.LocalDateTime;

import com.example.payment_service.models.PaymentModel;

public class PaymentService {
    public String pay(PaymentModel model) {
        return "You've paid " + model.amount + " on " + model.product + " product";
    }
    public String getHistory() {
        return "You've paid 2.000,00 on Mousepad. Date: " + LocalDateTime.now();
    }
}
