package com.cst.model.onetomany.bidirectional;

import lombok.Data;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Department {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToMany(cascade= CascadeType.ALL,targetEntity = Labour.class,orphanRemoval = true,mappedBy = "department",fetch = FetchType.EAGER)
    private List<Labour> labourList = new ArrayList<>();;

    public void addLabour(Labour labour) {
        labourList.add(labour);
        labour.setDepartment(this);
    }

    public void removeLabour(Labour labour) {
        labourList.remove(labour);
        labour.setDepartment(null);
    }
}
