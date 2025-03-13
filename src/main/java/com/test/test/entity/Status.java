package com.test.test.entity;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Status {
    CHECK_DOCUMENTS("برسی مدارک"),
    DOCUMENT_DEFECTS("نقص مدارک"),
    TREATMENT("طرح درمان"),
    DESIGN_REVIEW("برسی طرح"),
    TURNS("نوبتدهی");
    private final String value;

    Status(String value) {
        this.value = value;
    }
    @JsonValue
    public String getValue(){
        return value;
    }
}
