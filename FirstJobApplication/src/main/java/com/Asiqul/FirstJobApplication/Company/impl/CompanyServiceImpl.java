package com.Asiqul.FirstJobApplication.Company.impl;

import com.Asiqul.FirstJobApplication.Company.Company;
import com.Asiqul.FirstJobApplication.Company.CompanyRepository;
import com.Asiqul.FirstJobApplication.Company.CompanyService;
import com.Asiqul.FirstJobApplication.Job.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public boolean updateCompany(Company company, Long id) {


        Optional<Company> companyOptional= companyRepository.findById(id);




        if (companyOptional.isPresent()){
            Company companyToUpdate = companyOptional.get();

            companyToUpdate.setDescription(company.getDescription());
            companyToUpdate.setName(company.getName()); ;
            companyToUpdate.setJobs(company.getJobs());

            companyRepository.save(companyToUpdate);

            return true;
        }
        return false;
    }

    @Override
    public void createCompany(Company company) {
        companyRepository.save(company);

    }

    @Override
    public boolean deleteCompanyById(Long id) {
        try {
            companyRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }
}
