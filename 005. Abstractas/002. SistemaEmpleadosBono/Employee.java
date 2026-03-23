package OOP.Abstractas.SistemaEmpleadosBono;

public abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = validatedText(name,"Unknown");
        this.baseSalary = baseSalary < 0? 0 : baseSalary;
    }

    public String validatedText(String text, String defaultValue){
        if(text == null || text.trim().isEmpty()){
            return defaultValue;
        }

        return text;
    }

    public void showInfo(){
        System.out.println("Name: "+name);
        System.out.println("Base Salary: "+baseSalary);
        System.out.println("calculated bonus: "+calculateBonus());
    }

    public boolean validateSalary(){
        return this.baseSalary >=0;
    }

    public abstract void work();

    public abstract double calculateBonus();

}
