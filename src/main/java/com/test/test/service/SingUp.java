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



    public SingUp(Repository repository) {
        this.repository = repository;
    }


    @Transactional
    public void singUpUser(SingUpDto singUpDto) {
        User user=new User();
        user.setUsername(singUpDto.getUsername());
        user.setPassword(singUpDto.getPassword());
        repository.save(user);
    }
}
