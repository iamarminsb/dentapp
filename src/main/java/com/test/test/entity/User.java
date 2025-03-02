package com.test.test.entity;


import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Component
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"username"})})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<EntityVisit> entityVisits;

    public void add(EntityVisit entityVisits1) throws NullPointerException {
        if (entityVisits==null){
            entityVisits=new ArrayList<>();
        }
        entityVisits.add(entityVisits1);


    }

}
