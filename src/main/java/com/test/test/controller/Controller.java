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


    public Controller(SingUp singUp, Visitservice visitservice) {
        this.singUp = singUp;
        this.visitservice = visitservice;
    }

    @GetMapping("/hello")
    public String hello(){
        return "helloooo";
    }
    @PostMapping("/singup")
    public SingUpDto singup(@RequestBody SingUpDto singUpDto){
        User user=new User();
        singUp.singUpUser(singUpDto);
        return singUpDto;


    }

    @PostMapping("/visit")
    public VisitDto visit (@RequestBody VisitDto visitDto){
        return visitservice.savevisit(visitDto);

    }
}
