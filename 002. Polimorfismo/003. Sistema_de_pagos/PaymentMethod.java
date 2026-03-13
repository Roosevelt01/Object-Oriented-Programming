package OOP.Polimorfismo.Sistema_de_pagos;

public class PaymentMethod {

    public double processPayment(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
            return 0;
        }

        return amount;
    }
}
