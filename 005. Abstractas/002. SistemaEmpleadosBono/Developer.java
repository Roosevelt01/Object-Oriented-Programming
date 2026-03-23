package OOP.Abstractas.SistemaEmpleadosBono;

public class Developer extends Employee {
    public Developer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public void work() {
        System.out.println("Developer is building software");
    }

    @Override
    public double calculateBonus() {
        return baseSalary*0.20;
    }
}