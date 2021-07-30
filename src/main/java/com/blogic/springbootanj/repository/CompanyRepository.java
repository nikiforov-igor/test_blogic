package com.blogic.springbootanj.repository;

import com.blogic.springbootanj.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
