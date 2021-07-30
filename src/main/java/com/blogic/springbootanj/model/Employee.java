package com.blogic.springbootanj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {
    @Id
    @SequenceGenerator(name="employee_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    private String middleName;
    private String lastName;
    private String post;
    @OneToMany(targetEntity = Tasks.class,cascade = CascadeType.ALL)
    private List<Tasks> tasks;

}
