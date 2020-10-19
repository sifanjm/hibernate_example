package com.cst.model.onetoone.uni;

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
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true, optional = false,targetEntity = PersonDetail.class)
    @JoinColumn(name = "personDetail_id", unique = true, nullable = false, updatable = false) // fk is personDetail_id
    private PersonDetail personDetail;
}
