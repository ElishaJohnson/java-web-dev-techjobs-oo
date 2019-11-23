package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String blank = "Data not available";
        boolean idOnly = true;
        String name;
        String employer;
        String location;
        String positionType;
        String coreCompetency;
        if (this.name != null && !this.name.isBlank()) {
            name = this.name;
            idOnly = false;
        } else {
            name = blank;
        }
        if (this.employer != null && !this.employer.getValue().isBlank()) {
            employer = this.employer.toString();
            idOnly = false;
        } else {
            employer = blank;
        }
        if (this.location != null && !this.location.getValue().isBlank()) {
            location = this.location.toString();
            idOnly = false;
        } else {
            location = blank;
        }
        if (this.positionType != null && !this.positionType.getValue().isBlank()) {
            positionType = this.positionType.toString();
            idOnly = false;
        } else {
            positionType = blank;
        }
        if (this.coreCompetency != null && !this.coreCompetency.getValue().isBlank()) {
            coreCompetency = this.coreCompetency.toString();
            idOnly = false;
        } else {
            coreCompetency = blank;
        }
        if (idOnly) {
            return "\nID: " + id + "\nOOPS! This job does not seem to exist.\n\n";
        } else {
            return ("\nID: " + id + "\nName: " + name + "\nEmployer: " + employer + "\nLocation: " + location + "\nPosition Type: " + positionType + "\nCore Competency: " + coreCompetency + "\n\n");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

}
