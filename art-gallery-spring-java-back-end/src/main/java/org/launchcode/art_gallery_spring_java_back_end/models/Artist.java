package org.launchcode.art_gallery_spring_java_back_end.models;

// TODO: Fill out this entity class so it has the properties id, firstName, lastName, and location
//  Use the Artwork class as a guide and make sure it has everything required for Hibernate to create a table
//  Override toString() so that it returns the concatenated full name

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name="firstName") // this is also optional
    private String firstName;

    @Column(name="lastName") // this is also optional
    private String lastName;

    @Column(name="location") // this is also optional
    private String location;


    // A default constructor is required for database
    public Artist() {};

    public Artist(String firstName, String lastName, String location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() { return lastName; }

    public void setLastName(String firstName) {
        this.lastName = lastName;
    }

    public String getLocation() { return location; }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - " + location;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
