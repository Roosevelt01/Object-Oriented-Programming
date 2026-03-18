package OOP.Encapsulacion.Student;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("Alex", 15);

        System.out.println("Nombre del estudiante: "+ std1.getName());
        System.out.println("Nota del estudiante: "+ std1.getGrade());

        std1.setGrade(8.5);

        System.out.println("Nueva nota del estudiante: "+std1.getGrade());
    }
}
