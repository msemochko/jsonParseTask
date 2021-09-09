package com.edu.learning.models;

public class ReportFiles{
    private String fileLocation;
    private int startDateOffset;

    public ReportFiles(String reportFileLocation, int reportFileStartDateOffset) {
        this.fileLocation = reportFileLocation;
        this.startDateOffset = reportFileStartDateOffset;
    }

    public String getReportFileLocation() {
        return fileLocation;
    }

    public void setReportFileLocation(String reportFileLocation) {
        this.fileLocation = reportFileLocation;
    }

    public int getReportFileStartDateOffset() {
        return startDateOffset;
    }

    public void setReportFileStartDateOffset(int reportFileStartDateOffset) {
        this.startDateOffset = reportFileStartDateOffset;
    }

    @Override
    public String toString() {
        return "ReportFiles{" +
                "reportFileLocation='" + fileLocation + '\'' +
                ", reportFileStartDateOffset=" + startDateOffset +
                '}';
    }
}
