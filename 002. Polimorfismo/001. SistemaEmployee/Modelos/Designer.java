package OOP.Polimorfismo.SistemaEmployee.Modelos;

public class Designer extends Employee {

    public Designer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("Designer is creating user interfaces");
    }
}