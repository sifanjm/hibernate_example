package com.cst.model.onetoone.uni;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class PersonDetail {
    @Id
    @GeneratedValue
    private int id;
    private String address;
}
