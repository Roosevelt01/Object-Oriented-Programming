package OOP.Polimorfismo.SistemaEmployee.Modelos;

public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void showInfo(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }

    public void work(){
        System.out.println("Employee is working");
    }
}
