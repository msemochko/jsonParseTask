package com.edu.learning.models;

import java.util.List;

public class Projects {
    private String name;
    private String releaseGroup;
    private List<ReportFiles> reportFiles;
    private List<ChildProjects> childProjects;
    private List<RootCauses> rootCauses;
    private List<Epics> epics;

    public Projects(String projectName, String projectReleaseGroup, List<ReportFiles> reportFiles, List<ChildProjects> childProjects, List<RootCauses> rootCauses, List<Epics> epics) {
        this.name = projectName;
        this.releaseGroup = projectReleaseGroup;
        this.reportFiles = reportFiles;
        this.childProjects = childProjects;
        this.rootCauses = rootCauses;
        this.epics = epics;
    }

    public String getProjectName() {
        return name;
    }

    public void setProjectName(String projectName) {
        this.name = projectName;
    }

    public String getProjectReleaseGroup() {
        return releaseGroup;
    }

    public void setProjectReleaseGroup(String projectReleaseGroup) {
        this.releaseGroup = projectReleaseGroup;
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

    public List<RootCauses> getRootCauses() {
        return rootCauses;
    }

    public void setRootCauses(List<RootCauses> rootCauses) {
        this.rootCauses = rootCauses;
    }

    public List<Epics> getEpics() {
        return epics;
    }

    public void setEpics(List<Epics> epics) {
        this.epics = epics;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "projectName='" + name + '\'' +
                ", projectReleaseGroup='" + releaseGroup + '\'' +
                '}';
    }
}
