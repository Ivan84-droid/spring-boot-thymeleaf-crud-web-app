package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Empolyee;

import java.util.List;

public interface EmployeeService {
    List<Empolyee> getAllEmployees();
    void saveEmployee(Empolyee employee);

    Empolyee getEmployeeById(long id);
    void deleteEmployeeById (long id);


}
