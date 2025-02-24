package com.test.test.service;

import com.test.test.dto.SingUpDto;
import com.test.test.entity.User;
import com.test.test.repository.Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SingUp {

    @Autowired
    private final Repository repository;
    @Autowired
    private final User user;


    public SingUp(Repository repository, User user) {
        this.repository = repository;
        this.user = user;
    }


    @Transactional
    public void singUpUser(SingUpDto singUpDto) {
        user.setUsername(singUpDto.getUsername());
        user.setPassword(singUpDto.getPassword());
        repository.save(user);
    }
}
