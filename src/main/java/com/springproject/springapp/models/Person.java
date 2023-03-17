package com.springproject.springapp.models;

import javax.validation.constraints.*;

public class Person {

    private int id;

    @NotEmpty(message = "Name must not be empty")
    @Size(min = 2, max = 100, message = "Name must be 2 to 100 characters long")
    private String name;

    @Min(value = 1900, message = "Year of birth must be greater than 1900")
    private int dateOfBirth;

    public Person() {

    }

    public Person(String name, int dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
