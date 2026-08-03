package com.Asiqul.FirstJobApplication.Review;


import com.Asiqul.FirstJobApplication.Company.Company;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private  String title;
    private String description;
    private double rating;
@ManyToOne
@JsonIgnore
    private Company company;

}
