package com.company.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.company.dao.CompanyDAO;
import com.company.entity.Company;
import com.company.services.CompanyServices;
import com.factory.CompanyFactory;
import com.view.dto.CompanyCsnCnameDTO;

@Service("companyServices")
public class CompanyServicesImpl implements CompanyServices{

	@Autowired
	@Qualifier("companyCsnCnameDTO")
	private CompanyCsnCnameDTO companyCsnCnameDTO;
	
	@Autowired
	@Qualifier("companyDAO")
	private CompanyDAO companyDAO;
	
	@Autowired
	@Qualifier("companyFactory")
	private CompanyFactory companyFactory;
	
	@Override
	public CompanyCsnCnameDTO getCompanyCsnCnameDTO(String cid) {
		// TODO Auto-generated method stub
		Company company = companyDAO.getCompanyCsnCname(cid);
		if(company != null){
			companyCsnCnameDTO = companyFactory.companyToCompanyCsnCnameDTO(company);
		}else{
			companyCsnCnameDTO.setCid(null);
		}
		return companyCsnCnameDTO;
		
	}

}
