package com.blogic.springbootanj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company implements Serializable {
    @Id
    @SequenceGenerator(name="company_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String companyname;
    private String physicaladdress;
    private String legaladress;
    private String director;


}