package services;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private PaymentGatewaySelector paymentGatewaySelector;

    public PaymentService(PaymentGatewaySelector paymentGatewaySelector) {
        this.paymentGatewaySelector = paymentGatewaySelector;
    }


    public void generatePaymentLink(){
        System.out.println(paymentGatewaySelector.getPaymentGateway().getPaymentLink());
    }
}
