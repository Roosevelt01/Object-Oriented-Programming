package OOP.Polimorfismo.SistemadeVehiculos.Hijas;

import OOP.Polimorfismo.SistemadeVehiculos.Vehicle;

public class Motorcycle extends Vehicle {
    public Motorcycle(String brand, int speed) {
        super(brand, speed);
    }

    public void doWheelie(){
        System.out.println("Motorcycle is doing a wheelie");
    }

    @Override
    public void move() {
        System.out.println("Motorcycle is speeding on the road");
    }
}
