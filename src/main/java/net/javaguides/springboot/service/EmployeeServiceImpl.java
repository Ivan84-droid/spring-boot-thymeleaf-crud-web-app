package net.javaguides.springboot.service;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }
    @Override
    public Employee getEmployeeById(long id) {


        Optional<Employee> optional = employeeRepository.findById(id);
        Employee empolyee= null;
        if (optional.isPresent()){
            empolyee= optional.get();
        }else {
            throw new RuntimeException("Employee not found for id ::"+id);
        }
        return empolyee;
    }
    @Override
    public void deleteEmployeeById(long id) {
        this.employeeRepository.deleteById(id);

    }
}
