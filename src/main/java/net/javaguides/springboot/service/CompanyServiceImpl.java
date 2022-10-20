package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Company;
import net.javaguides.springboot.repository.CompanyRepozitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired CompanyRepozitory companyRepozitory;

    @Override
    public List<Company> getAllCompanies() {return companyRepozitory.findAll();}

    @Override
    public void saveCompany(Company company) {
        companyRepozitory.save(company);}
}