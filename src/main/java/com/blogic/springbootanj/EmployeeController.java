package com.blogic.springbootanj;

import com.blogic.springbootanj.model.Employee;
import com.blogic.springbootanj.model.Tasks;
import com.blogic.springbootanj.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeservice;

    @GetMapping("/all")
    public List<Employee> getAll(){
     List<Employee> employees=employeeservice.findAll();
          return employees;
    }
    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeservice.addEmployee(employee);
    }

    @PutMapping("/updateemployee/{id}")
    public Employee updateemployee(@PathVariable(value = "id") Long id,@RequestBody Employee employee){
        Employee e=employeeservice.getEmployeeById(id);
        e.setFirstName(employee.getFirstName());
        e.setLastName(employee.getLastName());
        e.setMiddleName(employee.getMiddleName());
        e.setPost((employee.getPost()));

        return employeeservice.update(e);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id") Long id){
        employeeservice.deleteEmployee(id);
    }

}
