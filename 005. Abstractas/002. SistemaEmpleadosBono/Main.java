package OOP.Abstractas.SistemaEmpleadosBono;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Developer("",-500),
                new Developer("Duhaa",8000),
                new Designer("Alejandro", 6000),
                new Manager("Arleth", 10000),
        };

        for (Employee employee:employees){
            employee.showInfo();
            employee.work();
            System.out.println();
        }
    }
}