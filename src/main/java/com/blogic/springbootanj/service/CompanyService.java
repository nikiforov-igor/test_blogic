package com.blogic.springbootanj.service;

import com.blogic.springbootanj.model.Company;
import com.blogic.springbootanj.model.Employee;
import com.blogic.springbootanj.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    @Autowired
    CompanyRepository companyRepository;

    public List<Company> findAll() {
        return companyRepository.findAll();
    }
    public Company addCompany(Company company){ return companyRepository.save(company); }
    public Company update(Company company){ return companyRepository.save(company); }
    public void deleteCompany(Long id){
         companyRepository.deleteById(id);
    }
}
