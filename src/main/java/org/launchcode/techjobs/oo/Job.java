package org.launchcode.techjobs.oo;


import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
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

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    @Override
    public String toString() {
        String noValue = "Data not available";

        String n = name;
        if (n == null) n = noValue;

        String e = this.employer.getValue();
        if ((e == null) | (e.length() == 0)) e = noValue;

        String l = this.location.getValue();
        if ((l == null) | (l.length() == 0)) l = noValue;

        String p = this.positionType.getValue();
        if((p == null) | (p.length() == 0)) p = noValue;

        String c = this.coreCompetency.getValue();
        if((c == null) | (c.length() == 0)) c = noValue;

        return System.lineSeparator() + "ID: " + this.id +System.lineSeparator()+ "Name: " + n +System.lineSeparator()+ "Employer: " + e +System.lineSeparator()+ "Location: " + l +System.lineSeparator()+ "Position Type: " + p +System.lineSeparator()+ "Core Competency: " + c +System.lineSeparator();
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

    public int getId() {
        return id;
    }
}
