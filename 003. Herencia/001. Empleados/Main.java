package OOP.Herencia.Empleados;

import OOP.Herencia.Empleados.Hijas.Developer;

public class Main {
    public static void main(String[] args) {
        Developer developer1 = new Developer("Alex",4000);

        developer1.work();
        developer1.code();
    }
}
