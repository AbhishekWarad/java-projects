package dao;

public class Client {

    public static void main(String[] args) {
        EmployeeDAOFactory objref = new EmployeeDAOFactory();
        EmployeeDAO dao = objref.createInstance();


    }
}
