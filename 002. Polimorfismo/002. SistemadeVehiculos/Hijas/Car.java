package OOP.Polimorfismo.SistemadeVehiculos.Hijas;

import OOP.Polimorfismo.SistemadeVehiculos.Vehicle;

public class Car extends Vehicle {
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    public void honk(){
        System.out.println("Car is honking");
    }

    @Override
    public void move() {
        System.out.println("Car is driving on the road");
    }
}
