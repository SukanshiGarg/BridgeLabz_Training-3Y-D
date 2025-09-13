abstract class Employee{
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary){
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public String getName(){
        return name;
    }

    public double getBaseSlary(){
        return baseSalary;
    }

    public void setBaseSlary(double baseSalary){
        if(baseSalary>0){
            this.baseSalary=baseSalary;
        }
        else{
            System.out.println("Base salary must be positive !");
        }
    }

    public abstract double calculateSalary();

    public void displayDetails(){
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    } 
}