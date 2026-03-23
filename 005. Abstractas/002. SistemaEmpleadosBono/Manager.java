package OOP.Abstractas.SistemaEmpleadosBono;

public class Manager extends Employee{
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public void work() {
        System.out.println("Manager is leading the team");
    }

    @Override
    public double calculateBonus() {
        return baseSalary*0.30;
    }
}