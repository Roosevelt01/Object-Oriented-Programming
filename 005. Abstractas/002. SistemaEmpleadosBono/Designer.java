package OOP.Abstractas.SistemaEmpleadosBono;

public class Designer extends Employee{

    public Designer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public void work() {
        System.out.println("Designer is creating interfaces");
    }

    @Override
    public double calculateBonus() {
        return baseSalary * 0.15;
    }
}