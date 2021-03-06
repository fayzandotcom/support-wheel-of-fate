package com.support.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Engineer {

    @Id
    private int id;
    
    private String name;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="engineer_schedule", joinColumns=@JoinColumn(name="engineer_id", referencedColumnName="id"), 
        inverseJoinColumns = @JoinColumn(name = "schedule_id", referencedColumnName="id"))
    private List<Schedule> schedules;

    @Override
    public String toString() {
        return "Engineer [id=" + id + ", name=" + name + "]";
    }
    
}
