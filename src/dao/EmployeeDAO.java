package dao;

import java.util.List;

public interface EmployeeDAO {
    public void addEmployee(Employee e);
    public List<Employee> listAllEmployees();
    public Employee getEmployeeById(int empid);
}
