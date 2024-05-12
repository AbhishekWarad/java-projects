package dao;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        EmployeeDAOFactory objref = new EmployeeDAOFactory();
        EmployeeDAO dao = objref.createInstance();

        Employee e1 = new Manager(101, "Sam","11111111111" , 25000 , "Sales");
        Employee e2 = new Director(102 , "Duke" , "888888888888", 78000 , "Sales and Marketing" , 1_00_000);
        Employee e3 = new Manager(103 , "jack" , "11111111111" , 25000 , "Marketing");

        dao.addEmployee(e1);
        dao.addEmployee(e2);
        dao.addEmployee(e3);

        List<Employee> employees = dao.listAllEmployees();

        for(Employee e:employees){
            if(e instanceof Manager){
                Manager m = (Manager) e;
                System.out.println(m.getEmployeeDetails());
            } else {
                Director d = (Director)e;
                System.out.println(d.getEmployeeDetails());
            }
        }

        try{
            Employee found = dao.getEmployeeById(105);
            System.out.println(found.getEmployeeDetails() + " Found");
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getExceptionMessage());
        }
    }
}
