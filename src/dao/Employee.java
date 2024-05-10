package dao;

public class Employee {
    private int empid;
    private String name;
    private String ssn;
    private double salary;

//    Constructor
    public Employee(){
        super();
    }

    public Employee(int id, String name , String ssn , double salary){
        super();
        this.empid = id;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;

    }

//    getter methods
    protected String getEmployeeDetails(){
        return " "+empid+" "+name + " "+ssn+" "+salary;
    }

    public int getEmpid() {
        return empid;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

}
