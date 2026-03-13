package OOP.Polimorfismo.SistemadeVehiculos;

public class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }

    public void move(){
        System.out.println("The vehicle is moving");
    }
}
