package OOP.Abstractas.SistemaEmpleados;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new Developer("Alejandro", 4500),
            new Manager("Duhaa", 6000),
            new Designer("Arleth", 10000)
        };

        for(Employee employee: employees){
            employee.showInfo();
            employee.work();
            System.out.println();
        }
    }
}
