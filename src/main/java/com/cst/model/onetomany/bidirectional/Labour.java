package com.cst.model.onetomany.bidirectional;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Labour {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @ManyToOne(targetEntity = Department.class,fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "department_id")
    private Department department;

}
