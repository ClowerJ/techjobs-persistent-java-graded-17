package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.*;

@Entity // mapped to table
public class Employer extends AbstractEntity {

    @NotBlank  //validation not empty string
    @Size(min = 1)
    private String location;

    @OneToMany
    @JoinColumn(name="employer_id")

    //adding location field
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private List<Job> jobs = new ArrayList<>();


    //allows Employer public accessor
    public Employer() {
    }


}