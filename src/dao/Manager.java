package dao;

public class Manager extends Employee{
    private String departmentName;

//    constructor
    public Manager(int id ,String name , String ssn, double salary , String depname){
        super(id, name, ssn, salary);
        this.departmentName = depname;
    }

//    getter method
    protected String getEmployeeDetails(){
        return super.getEmployeeDetails() + " " + departmentName;
    }

    public String getDepartmentName(){
        return departmentName;
    }


}
