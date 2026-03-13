package OOP.Polimorfismo.Sistema_de_pagos;

public class Paypal extends PaymentMethod{
    @Override
    public double processPayment(double amount) {
        amount = super.processPayment(amount);

        if (amount == 0 ){
            return 0;
        }

        return amount-(amount * 0.03);
    }
}

