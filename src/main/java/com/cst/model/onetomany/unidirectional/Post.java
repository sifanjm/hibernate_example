package com.cst.model.onetomany.unidirectional;

import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Post {

    @Id
    @GeneratedValue
    private int id;
    private String title;

    @OneToMany(cascade= CascadeType.ALL,targetEntity = Comment.class,orphanRemoval = true,fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id") // Additional mapping table won't be created instead of fk will be created in comment table
    private List<Comment> comment;
}
