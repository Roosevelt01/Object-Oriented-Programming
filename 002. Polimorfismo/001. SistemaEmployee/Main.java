package OOP.Polimorfismo.SistemaEmployee;

import OOP.Polimorfismo.SistemaEmployee.Modelos.Designer;
import OOP.Polimorfismo.SistemaEmployee.Modelos.Developer;
import OOP.Polimorfismo.SistemaEmployee.Modelos.Employee;
import OOP.Polimorfismo.SistemaEmployee.Modelos.Manager;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Developer("Jeison", 450),
                new Designer("Alex", 600),
                new Manager("Duhaa",1000)
        };

        for(Employee employee: employees){
            employee.showInfo();
            employee.work();
            System.out.println();
        }
    }
}