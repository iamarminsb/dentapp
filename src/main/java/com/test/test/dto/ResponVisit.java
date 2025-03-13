package com.test.test.dto;

import lombok.Data;

@Data
public class ResponVisit {
    private String username;
    private String statusText;

    public ResponVisit(String username ,String statusText) {
        this.username = username;
        this.statusText=statusText;
    }
}
