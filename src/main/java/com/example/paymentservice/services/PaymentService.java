package com.example.paymentservice.services;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private PaymentGatewaySelector paymentGatewaySelector;

    public PaymentService(PaymentGatewaySelector paymentGatewaySelector) {
        this.paymentGatewaySelector = paymentGatewaySelector;
    }

    public String generatePaymentLink(){
        //Logic to update Db when payment starts

        return paymentGatewaySelector.getPaymentGateway().getPaymentLink();
    }
}
