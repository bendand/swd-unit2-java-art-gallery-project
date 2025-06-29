package org.launchcode.art_gallery_spring_java_back_end.models;

// TODO: Fill out this entity class so it has the properties id and title
//  Use the Artwork class as a guide and make sure it has everything required for Hibernate to create a table
//  Override toString() so that it returns the title

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name="title") // this is optional
    private String title;


    // A default constructor is required for database
    public Category() {};

    public Category(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return title;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
