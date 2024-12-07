package com.example.paymentservice.services;

import org.springframework.stereotype.Service;

@Service
public class RazorpayPaymentGateway implements PaymentGateway {
    @Override
    public String getPaymentLink() {
        return null;
    }
}
