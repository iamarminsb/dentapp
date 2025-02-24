package com.test.test.repository;

import com.test.test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<User,Integer> {
}
