package Encapsulacion.BackAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount person1 = new BankAccount("Jeison", 500, "Acc-100");

        System.out.println("Owner: " + person1.getOwner());
        System.out.println("Account Number: " + person1.getAccountNumber());
        System.out.println("Balance: " + person1.getBalance());

        System.out.println("\nDepósito");
        person1.deposit(200);
        System.out.println("Balance después del depósito: " + person1.getBalance());

        System.out.println("\nRetiro");
        person1.withdraw(100);
        System.out.println("Balance después del retiro: " + person1.getBalance());

        System.out.println("\nIntento de retiro inválido");
        person1.withdraw(1000);

        System.out.println("\nEstado final de la cuenta:");
        System.out.println(person1);
    }
}
