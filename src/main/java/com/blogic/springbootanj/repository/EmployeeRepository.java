package com.blogic.springbootanj.repository;

import com.blogic.springbootanj.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
