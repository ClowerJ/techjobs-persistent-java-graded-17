package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.*;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Description is required")
    @Size(min = 6, max=100, message= "Name must be between 6 and 100 characters")
    private String description;

    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();


    public Skill() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

}