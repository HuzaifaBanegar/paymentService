package services;

public class PaymentGatewaySelector {
    private RayzorPayGateway rayzorPayGateway;
    private StripeGateway stripeGateway;
    public PaymentGatewaySelector(RayzorPayGateway rayzorPayGateway, StripeGateway stripeGateway) {
        this.rayzorPayGateway = rayzorPayGateway;
        this.stripeGateway = stripeGateway;
    }

    public PaymentGateway getPaymentGateway() {
        return stripeGateway;
    }
}
