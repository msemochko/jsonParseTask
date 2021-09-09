package com.edu.learning.models;

import java.util.List;

public class Root {
    private List<ReleaseGroups> releaseGroups;
    private List<Projects> projects;

    public Root(List<ReleaseGroups> releaseGroups, List<Projects> projects) {
        this.releaseGroups = releaseGroups;
        this.projects = projects;
    }

    public List<ReleaseGroups> getReleaseGroups() {
        return releaseGroups;
    }

    public List<Projects> getProjects() {
        return projects;
    }

    @Override
    public String toString() {
        return "Root{" +
                "releaseGroups=" + releaseGroups +
                ", projects=" + projects +
                '}';
    }
}
