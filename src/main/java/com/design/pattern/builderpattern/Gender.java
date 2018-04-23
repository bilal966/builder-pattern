package com.design.pattern.builderpattern;

public enum Gender {

    MALE("Male"),
    FEMALE("Female");

    private final String value;

    Gender(String v){
        this.value = v;
    }

    public String getValue() {
        return value;
    }
}
