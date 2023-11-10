package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.*;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Please enter location.")
    @Size(min = 2, max=50, message= "Location must be between 2 and 50 characters")
    private String location;

    @OneToMany
    @JoinColumn(name = "employer_id")
    private final List<Job> jobs = new ArrayList<>();

    public Employer() {

    }


    public String getLocation() {

        return location;
    }

    public void setLocation(String location) {

        this.location = location;
    }

    public List<Job> getJobs() {

        return jobs;
    }
}




    //allows Employer public accessor



