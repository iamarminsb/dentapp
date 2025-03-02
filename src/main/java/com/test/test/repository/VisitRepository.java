package com.test.test.repository;

import com.test.test.entity.EntityVisit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VisitRepository extends JpaRepository<EntityVisit,Integer> {

    EntityVisit findById(int integer);
}
