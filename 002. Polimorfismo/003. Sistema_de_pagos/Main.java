package OOP.Polimorfismo.Sistema_de_pagos;

public class Main {
    public static void main(String[] args) {
        PaymentMethod[] methods= {
            new CreditCard(),
            new Paypal(),
            new BankTransfer()
        };

        double amount = 0;

        for(PaymentMethod method: methods){
            System.out.println(method.processPayment(amount));
            System.out.println();
        }
    }
}
