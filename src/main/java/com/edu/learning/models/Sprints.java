package com.edu.learning.models;

public class Sprints{
    private String name;
    private String length;
    private String startDateOffset;

    public Sprints(String name, String length, String startDateOffset) {
        this.name = name;
        this.length = length;
        this.startDateOffset = startDateOffset;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getStartDateOffset() {
        return startDateOffset;
    }

    public void setStartDateOffset(String startDateOffset) {
        this.startDateOffset = startDateOffset;
    }
}
