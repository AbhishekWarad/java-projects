package dao;

public class EmployeeNotFoundException extends Exception{

    public EmployeeNotFoundException(){
        super();
    }

    public EmployeeNotFoundException(String str){
        super(str);
    }

    public String getExceptionMessage(){
        return "The Employee you are searching " + "has left the company/Not Found";
    }
}
