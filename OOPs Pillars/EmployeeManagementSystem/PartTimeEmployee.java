class PartTimeEmployee  extends Employee implements Department{
    private int hoursWorked;
    private String department;
    private double hourlyRate;

    public PartTimeEmployee (int employeeId, String name, double hourlyrate, int hoursworked){
       super(employeeId,name,0);
       this.hourlyRate=hourlyrate;
       this.hoursWorked=hoursworked;
    }

    @Override
    public double calculateSalary(){
        return hourlyRate*hoursWorked;
    }

    @Override
    public void assignDepartment(String departmentName){
        this.department=departmentName;
    }

    @Override
    public String getDepartmentDetails(){
        return "Department"+department;
    }
}
