package com.test.test.dto;

import lombok.Data;

@Data
public class ResponVisit {
    private String username;

    public ResponVisit(String username) {
        this.username = username;
    }
}
