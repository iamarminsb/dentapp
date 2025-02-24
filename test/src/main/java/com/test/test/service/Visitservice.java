package com.test.test.service;

import com.test.test.dto.SingUpDto;
import com.test.test.dto.VisitDto;
import com.test.test.entity.User;
import com.test.test.repository.Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Visitservice {
    @Autowired
    private final Repository repository;
    @Autowired
    private final User user;


    public Visitservice(Repository repository, User user) {
        this.repository = repository;
        this.user = user;
    }

    @Transactional
    public void savevisit(VisitDto visitDto){


    }
}
