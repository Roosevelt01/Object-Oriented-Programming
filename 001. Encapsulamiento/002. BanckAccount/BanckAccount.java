package Encapsulacion.BackAccount;

public class BankAccount {
    private String owner;
    private double balance;
    private String accountNumber;

    public BankAccount(String owner, double balance, String accountNumber){
        this.owner = validarTexto(owner, "Unknown");
        this.accountNumber = validarTexto(accountNumber, "000");
        this.balance = (balance < 0) ? 0 : balance;
    }

    private String validarTexto(String texto, String valorPorDefecto) {
        if (texto == null || texto.trim().isEmpty()) {
            return valorPorDefecto;
        }
        return texto;
    }

    public String getOwner(){
        return owner;
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double deposit(double amount){
        if(amount>0){
            this.balance+= amount;
        }else{
            System.out.println("Ingrese un valor mayor a 0");
        }
        return this.balance;
    }

    public double withdraw(double amount){
        if(amount > 0){
            System.out.println("Ingrese un valor mayor a 0");
            return this.balance;
        }

        if(amount > this.balance) {
            System.out.println("Fondos insuficientes");
            return this.balance;
        }

        this.balance -= amount;
        return this.balance;
    }

    @Override
    public String toString() {
        return "owner='" + this.owner + '\'' +
                ", balance=" + this.balance +
                ", accountNumber='" + this.accountNumber + '\'';
    }
}
