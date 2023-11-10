package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Skill extends AbstractEntity {

    // new field for description
    private String description;

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

//public accessors for new description field
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //no arg constructor
    public Skill() {
    }

//    public List<Job> getJobs() {
//        return jobs;
//    }
//
//    public void setJobs(List<Job> jobs) {
//        this.jobs = jobs;
//    }

}
