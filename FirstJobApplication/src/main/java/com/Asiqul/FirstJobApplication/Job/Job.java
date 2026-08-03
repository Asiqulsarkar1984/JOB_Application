package com.Asiqul.FirstJobApplication.Job;

import com.Asiqul.FirstJobApplication.Company.Company;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name= "job_table")
public class Job {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String minSalary;
    private  String maxSalary;
    private String location;

    @ManyToOne
    private Company company;
}


