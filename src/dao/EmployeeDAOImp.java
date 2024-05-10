package dao;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImp implements EmployeeDAO{
    List<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee e) {
        employees.add(e);
    }

    @Override
    public List<Employee> listAllEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployeeById(int empid) throws EmployeeNotFoundException {
        Employee employeeFound = null;

        for (Employee e : employees){
            if(empid == e.getEmpid()){
                employeeFound = e;
            }
        }

        if (employeeFound != null){
            return employeeFound;
        } else {
            throw new EmployeeNotFoundException("The Employee you are searching has left the company/Not Found");
        }
    }
}
