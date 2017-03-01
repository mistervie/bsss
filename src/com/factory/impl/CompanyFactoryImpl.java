package com.factory.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.entity.Company;
import com.factory.CompanyFactory;
import com.view.dto.CompanyCsnCnameDTO;

@Repository("companyFactory")
public class CompanyFactoryImpl implements CompanyFactory{

	
	@Autowired
	@Qualifier("company")
	private Company company;
	
	@Autowired
	@Qualifier("companyCsnCnameDTO")
	private CompanyCsnCnameDTO companyCsnCnameDTO;
	
	@Override
	public CompanyCsnCnameDTO companyToCompanyCsnCnameDTO(Company company) {
		// TODO Auto-generated method stub
		companyCsnCnameDTO.setCid(company.getCid());
		companyCsnCnameDTO.setCsn(company.getCsn());
		companyCsnCnameDTO.setCname(company.getCname());
		return companyCsnCnameDTO;
	}

}
