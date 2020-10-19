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
public class EmployeeDetail {

    @Id
    @GeneratedValue
    private int id;
    private String address;
    @OneToOne(fetch = FetchType.LAZY) // load only employeeDetail
    @JoinColumn(name = "emp_id")
    private Employee employee;

}
