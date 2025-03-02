package com.test.test.entity;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Component
@Table(name = "visit")
public class EntityVisit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String daromasrafi;
    private String sabeghe;
    private String elat;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(mappedBy = "entityVisit",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<EntityDefect> entityDefects;

    public void add(EntityDefect entityDefect1) throws NullPointerException {
        if (entityDefects==null){
            entityDefects=new ArrayList<>();
        }
        entityDefects.add(entityDefect1);


    }
}
