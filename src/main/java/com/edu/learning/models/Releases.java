package com.edu.learning.models;

import java.util.List;

public class Releases{
    private String name;
    private String length;
    private String startDateOffset;
    private List<Sprints> sprints;

    public Releases(String name, String length, String startDateOffset, List<Sprints> sprints) {
        this.name = name;
        this.length = length;
        this.startDateOffset = startDateOffset;
        this.sprints = sprints;
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

    public List<Sprints> getSprints() {
        return sprints;
    }

    public void setSprints(List<Sprints> sprints) {
        this.sprints = sprints;
    }

    @Override
    public String toString() {
        return "Releases{" +
                "name='" + name + '\'' +
                ", length='" + length + '\'' +
                ", startDateOffset='" + startDateOffset + '\'' +
                ", sprints=" + sprints +
                '}';
    }
}
