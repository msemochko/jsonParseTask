package com.edu.learning.models;

import java.util.List;

public class ChildProjects {
    private String name;
    private String releaseGroup;
    private List<ReportFiles> reportFiles;
    private List<ChildProjects> childProjects;

    public ChildProjects(String name, String releaseGroup, List<ReportFiles> reportFiles, List<ChildProjects> childProjects) {
        this.name = name;
        this.releaseGroup = releaseGroup;
        this.reportFiles = reportFiles;
        this.childProjects = childProjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseGroup() {
        return releaseGroup;
    }

    public void setReleaseGroup(String releaseGroup) {
        this.releaseGroup = releaseGroup;
    }

    public List<ReportFiles> getReportFiles() {
        return reportFiles;
    }

    public void setReportFiles(List<ReportFiles> reportFiles) {
        this.reportFiles = reportFiles;
    }

    public List<ChildProjects> getChildProjects() {
        return childProjects;
    }

    public void setChildProjects(List<ChildProjects> childProjects) {
        this.childProjects = childProjects;
    }

    @Override
    public String toString() {
        return "ChildProjects{" +
                "name='" + name + '\'' +
                ", releaseGroup='" + releaseGroup + '\'' +
                ", reportFiles=" + reportFiles +
                ", childProjects=" + childProjects +
                '}';
    }
}
