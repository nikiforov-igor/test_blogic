package com.blogic.springbootanj.service;

import com.blogic.springbootanj.model.Company;
import com.blogic.springbootanj.model.Department;
import com.blogic.springbootanj.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> findAll() {
        return departmentRepository.findAll();
    }
    public Department addDepartment(Department department){ return departmentRepository.save(department); }
    public Department update(Department department){ return departmentRepository.save(department); }
    public void deleteDepartment(Long id){
        departmentRepository.deleteById(id);
    }


}
