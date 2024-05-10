package dao;

public class Director extends Manager{
    private double budget;

    public Director(int id ,String name , String ssn , double salary , String depname , double budget){
        super(id, name, ssn, salary, depname);
        this.budget = budget;
    }

    protected String getEmployeeDetails(){
        return super.getEmployeeDetails() + " "  + budget;
    }
}
