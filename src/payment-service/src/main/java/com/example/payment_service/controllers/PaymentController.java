package com.example.payment_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.payment_service.models.PaymentModel;
import com.example.payment_service.services.PaymentService;

@RestController
@RequestMapping("/api/v1/payment")
public class PaymentController {
    private PaymentService service = new PaymentService();

    @GetMapping("history")
    public String getHistory() {
        return service.getHistory();
    }

    @PostMapping("pay")
    public String pay(@RequestBody PaymentModel model) {
        return service.pay(model);
    }
}