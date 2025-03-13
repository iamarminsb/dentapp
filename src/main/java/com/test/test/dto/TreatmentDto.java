package com.test.test.dto;

import lombok.Data;

@Data
public class TreatmentDto {
    private String text;


    public TreatmentDto(String text) {
        this.text = text;
    }

    public TreatmentDto() {
    }
}

