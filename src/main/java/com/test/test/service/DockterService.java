package com.test.test.service;

import com.test.test.dto.TreatmentDto;
import com.test.test.entity.EntityVisit;
import com.test.test.entity.Teeth;
import com.test.test.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DockterService {

    @Autowired
    VisitRepository visitRepository;

    public DockterService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }





    public List<TreatmentDto> returnTeethStatus(int id){
        EntityVisit entityVisit=visitRepository.findById(id);
        List<Teeth> teeth=new ArrayList<>();
        teeth.add(Teeth.implant);
        teeth.add(Teeth.to_fill);
        teeth.add(Teeth.nervousness);
        List<TreatmentDto> treatmentDtos =teeth.stream().map(teeth1 -> new TreatmentDto(teeth1.getValue())).toList();


        return treatmentDtos;
    }
}
//teeth.stream().map(teeth1 -> teeth1.getValue()).toList()






//Treatment treatment=new Treatment();
      // treatment.setText(Teeth.to_fill.getValue(),Teeth.implant.getValue(),Teeth.nervousness.getValue());


// EntityVisit entityVisit=new EntityVisit();
//List<Teeth> teeth=new ArrayList<>();
//teeth.add(Teeth.implant);
//teeth.add(Teeth.to_fill);
//teeth.add(Teeth.to_fill);

//List<Treatment>treatments=teeth.stream().map(teeth1 -> new Treatment(teeth1.getValue())).toList();