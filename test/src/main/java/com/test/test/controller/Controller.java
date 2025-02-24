package com.test.test.controller;

import com.test.test.dto.SingUpDto;
import com.test.test.dto.VisitDto;
import com.test.test.entity.User;
import com.test.test.repository.Repository;
import com.test.test.service.SingUp;
import com.test.test.service.Visitservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private SingUp singUp;
    @Autowired
    private Visitservice visitservice;
    @Autowired
    private User user;

    public Controller(SingUp singUp, Visitservice visitservice, User user) {
        this.singUp = singUp;
        this.visitservice = visitservice;
        this.user = user;
    }

    @GetMapping("/hello")
    public String hello(){
        return "helloooo";
    }
    @PostMapping("/singup")
    public String visit(@RequestBody SingUpDto singUpDto){
        singUp.singUpUser(singUpDto);
        return "done";


    }

    @PostMapping("/visit")
    public User user (@RequestBody VisitDto visitDto){
        visitservice.savevisit(visitDto);
        return user;
    }
}
