package com.Asiqul.FirstJobApplication.Job;

import java.util.List;

public interface JobService {


    boolean deleteJobById(Long id);


    List<Job> findAll();

   void createJob(Job job);

    Job getJobById(Long id);

    boolean updateJobById(Long id ,Job updatedJob);
}
