package OOP.Encapsulacion.Student;

public class Student {
   private String name;
   private double grade;

   public Student(String name, double grade) {
      this.name = name;
      this.setGrade(grade);
   }+

   public String getName() {
      return name;
   }

   public double getGrade() {
      return grade;
   }

   public void setGrade(double grade) {
      if(grade >= 0 && grade<= 10){
         this.grade = grade;
      }else{
         this.grade =0;
         System.out.println("Nota no válida, se asignó por defecto");
      }

   }
}