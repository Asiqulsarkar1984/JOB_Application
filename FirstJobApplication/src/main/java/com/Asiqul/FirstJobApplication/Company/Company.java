package com.Asiqul.FirstJobApplication.Company;


import com.Asiqul.FirstJobApplication.Job.Job;
import com.Asiqul.FirstJobApplication.Review.Review;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;


    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Job> jobs;

@OneToMany(mappedBy = "company")
    private List<Review> Reviews;




}
