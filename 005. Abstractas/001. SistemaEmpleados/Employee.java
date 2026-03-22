package OOP.Abstractas.SistemaEmpleados;

public abstract class Employee {
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

    public abstract void work();
}
