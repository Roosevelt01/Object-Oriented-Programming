package OOP.Abstractas.SistemaEmpleados;

public class Manager extends Employee{

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("Manager is leading the team");
    }
}
