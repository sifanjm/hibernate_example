package com.cst.model.onetoone.bi;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, optional = false,targetEntity = EmployeeDetail.class,mappedBy = "employee")
    private EmployeeDetail employeeDetail;

}
