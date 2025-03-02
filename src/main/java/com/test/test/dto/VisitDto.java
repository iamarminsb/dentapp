package com.test.test.dto;

import lombok.Data;

@Data
public class VisitDto {
    private String username;
    private String daromasrafi;
    private String sabeghe;
    private String elat;

    public VisitDto(String username,String elat, String sabeghe, String daromasrafi) {
        this.username=username;
        this.elat = elat;
        this.sabeghe = sabeghe;
        this.daromasrafi = daromasrafi;
    }

    public VisitDto(String username) {
        this.username=username;
    }

    public VisitDto() {
    }
}
