package com.blogic.springbootanj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tasks implements Serializable {
    @Id
    @SequenceGenerator(name="tasks_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String task;
    private Employee taskauthor;
//    @ManyToOne
    private Employee responsibleman;
    private String executiondate;
    private String controlattribute;
    private String executionattribute;
    private String textoftask;


}
