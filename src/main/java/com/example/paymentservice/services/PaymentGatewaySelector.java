package com.example.paymentservice.services;

import org.springframework.stereotype.Service;

@Service
public class PaymentGatewaySelector {
    private RazorpayPaymentGateway razorPayPaymentGateway;
    private StripePaymentGateway stripeGateway;

    public PaymentGatewaySelector(RazorpayPaymentGateway razorPayPaymentGateway, StripePaymentGateway stripeGateway) {
        this.razorPayPaymentGateway = razorPayPaymentGateway;
        this.stripeGateway = stripeGateway;
    }

    public PaymentGateway getPaymentGateway() {
        //Logic on business use-case on which gateway to select
        return stripeGateway;
    }
}
