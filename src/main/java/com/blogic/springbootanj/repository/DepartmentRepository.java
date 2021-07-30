package com.blogic.springbootanj.repository;

import com.blogic.springbootanj.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
