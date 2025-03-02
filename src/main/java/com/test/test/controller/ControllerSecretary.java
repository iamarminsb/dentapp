package com.test.test.controller;

import com.test.test.dto.DefectDto;
import com.test.test.dto.ResponVisit;
import com.test.test.dto.VisitDto;
import com.test.test.entity.EntityVisit;
import com.test.test.repository.VisitRepository;
import com.test.test.service.Visitservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ControllerSecretary {
    @Autowired
    private VisitRepository visitRepository;
    @Autowired
    private Visitservice visitservice;
    public ControllerSecretary(VisitRepository visitRepository, Visitservice visitservice) {
        this.visitRepository = visitRepository;
        this.visitservice = visitservice;
    }



    @GetMapping("/secretary")
    public List<ResponVisit> entityVisits (){
       return visitservice.returnAllVisit();


    }
    @GetMapping("/secretary/{visitid}")
    public VisitDto userVisti(@PathVariable int visitid){
        return visitservice.userVisitById(visitid);
    }

    @PostMapping("/secretary/{visitid}/defect")
    public DefectDto defect(@PathVariable int visitid,@RequestBody DefectDto defectDto){
        visitservice.defect(visitid,defectDto);
        return defectDto;

    }

}
