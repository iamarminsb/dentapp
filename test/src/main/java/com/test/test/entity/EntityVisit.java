package com.test.test.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
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
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
