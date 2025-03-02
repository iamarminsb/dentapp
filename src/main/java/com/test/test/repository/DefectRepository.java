package com.test.test.repository;

import com.test.test.entity.EntityDefect;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefectRepository extends JpaRepository<EntityDefect,Integer> {
}
