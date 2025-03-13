package com.test.test.controller;

import com.test.test.dto.DocDto;
import com.test.test.dto.ResponVisit;
import com.test.test.dto.TreatmentDto;
import com.test.test.dto.VisitDto;
import com.test.test.service.DockterService;
import com.test.test.service.Visitservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ControllerDocter {
    @Autowired
    private final Visitservice visitservice;
    @Autowired
    private final DockterService dockterService;

    public ControllerDocter(Visitservice visitservice, DockterService dockterService) {
        this.visitservice = visitservice;
        this.dockterService = dockterService;
    }

    @GetMapping("/docter")
    public List<ResponVisit> entityVisits () {
        return visitservice.returnAllVisitChecked();
    }



    @GetMapping("/docter/{visitid}")
    public VisitDto userVisti(@PathVariable int visitid){
        return visitservice.userVisitById(visitid);
    }



    @PostMapping("/docter/{visitid}/treatment")
    public List<TreatmentDto> treatment(@PathVariable int visitid,@RequestBody DocDto docDto){
        return dockterService.returnTeethStatus(visitid);

    }

}
