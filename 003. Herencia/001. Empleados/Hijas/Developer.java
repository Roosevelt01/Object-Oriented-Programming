package OOP.Herencia.Empleados.Hijas;

import OOP.Herencia.Empleados.Employee;

public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    public void code(){
        System.out.println("Developer is coding");
    }
}
