package com.test.test.service;

import com.test.test.dto.DefectDto;
import com.test.test.dto.ResponVisit;
import com.test.test.dto.SingUpDto;
import com.test.test.dto.VisitDto;
import com.test.test.entity.EntityDefect;
import com.test.test.entity.EntityVisit;
import com.test.test.entity.User;
import com.test.test.repository.DefectRepository;
import com.test.test.repository.Repository;
import com.test.test.repository.VisitRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Visitservice {
    @Autowired
    private final Repository repository;
    @Autowired
    private final VisitRepository visitRepository;
    @Autowired
    private final DefectRepository defectRepository;




    public Visitservice(Repository repository, VisitRepository visitRepository, DefectRepository defectRepository) {
        this.repository = repository;

        this.visitRepository = visitRepository;

        this.defectRepository = defectRepository;
    }

    @Transactional
    public VisitDto savevisit(VisitDto visitDto){
        EntityVisit entityVisit=new EntityVisit();
        User user=repository.findByUsername(visitDto.getUsername());
        entityVisit.setDaromasrafi(visitDto.getDaromasrafi());
        entityVisit.setSabeghe(visitDto.getSabeghe());
        entityVisit.setElat(visitDto.getElat());
        entityVisit.setUser(user);
        user.add(entityVisit);
        visitRepository.save(entityVisit);
        return visitDto;

    }
    public List<ResponVisit> returnAllVisit(){
        List<EntityVisit> entityVisits= visitRepository.findAll();
        List<ResponVisit> responVisits=entityVisits.stream().map(entityVisit -> new ResponVisit(entityVisit.getUser().getUsername())).toList();
        return responVisits;
    }

    public VisitDto userVisitById(int id){
        EntityVisit entityVisit=visitRepository.findById(id);
        VisitDto visitDto=new VisitDto(entityVisit.getUser().getUsername(),entityVisit.getElat(),entityVisit.getSabeghe(),entityVisit.getDaromasrafi());
        return visitDto;

    }

    @Transactional
    public DefectDto defect(int id,DefectDto defectDto){
        EntityDefect entityDefect=new EntityDefect();
        EntityVisit entityVisit=visitRepository.findById(id);
        entityDefect.setText(defectDto.getText());
        entityDefect.setEntityVisit(entityVisit);
        defectRepository.save(entityDefect);
        return defectDto;

    }






}
















//List<VisitDto> visitDtos=entityVisits.stream().map(entityVisit -> new VisitDto(entityVisit.getUser().getUsername(),entityVisit.getElat(),entityVisit.getSabeghe(),entityVisit.getDaromasrafi())).toList();