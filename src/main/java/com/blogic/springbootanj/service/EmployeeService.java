package com.blogic.springbootanj.service;

import com.blogic.springbootanj.model.Company;
import com.blogic.springbootanj.model.Employee;
import com.blogic.springbootanj.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeerepository;

    public Employee addEmployee(Employee employee) {
        return employeerepository.save(employee);
    }
    public List<Employee> findAll() {
        return employeerepository.findAll();
    }
    public Employee getEmployeeById(Long id){return employeerepository.findById(id).get();}
    public Employee update(Employee employee){ return employeerepository.save(employee);}
    public void deleteEmployee(Long id){ employeerepository.deleteById(id); }
}
