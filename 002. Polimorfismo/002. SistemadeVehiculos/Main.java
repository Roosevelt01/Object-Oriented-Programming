package OOP.Polimorfismo.SistemadeVehiculos;

import OOP.Polimorfismo.SistemadeVehiculos.Hijas.Car;
import OOP.Polimorfismo.SistemadeVehiculos.Hijas.Motorcycle;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Bugatti Chiron Super Sport", 490),
                new Motorcycle("Ducati Panigale V4 R", 300)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.showInfo();
            vehicle.move();
            System.out.println();
        }
    }
}