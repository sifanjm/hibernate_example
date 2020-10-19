package com.cst.model.onetomany.unidirectional;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Comment {

    @Id
    @GeneratedValue
    private int id;
    private String review;
}
