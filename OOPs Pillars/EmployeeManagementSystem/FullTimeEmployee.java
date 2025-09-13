 class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary){
        super(employeeId,name,baseSalary);
    }

    @Override
    public double calculateSalary(){
        return getBaseSlary();
    }

    @Override 
    public void assignDepartment(String departmentName){
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails(){
        return "Department: "+department;
    }
}
