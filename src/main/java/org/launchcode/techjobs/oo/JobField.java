package org.launchcode.techjobs.oo;
import java.util.Objects;

public abstract class JobField {

    public int id;
    public static int nextId = 1;
    public String value;

    //Constructors
    public JobField() {
        id = nextId;
        nextId++;
    }
    public JobField(String value) {
        this();
        this.value = value;
    }


    //Methods

    @Override
    public String toString() { return value; }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    //Getters/setters
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
