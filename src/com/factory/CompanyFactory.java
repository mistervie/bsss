package com.factory;

import com.company.entity.Company;
import com.view.dto.CompanyCsnCnameDTO;

public interface CompanyFactory {
	public CompanyCsnCnameDTO companyToCompanyCsnCnameDTO(Company company);
}
