package dao;

public class EmployeeDAOFactory {
    public EmployeeDAO createInstance(){
        return new EmployeeDAOImp();
    }
}
