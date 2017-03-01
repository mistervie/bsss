package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.company.services.CompanyServices;
import com.view.dto.CompanyCsnCnameDTO;

@Controller
public class CompanyController {

	@Autowired
	@Qualifier("companyServices")
	private CompanyServices companyServices;
	
	@RequestMapping("/getCompanyCsnCname/{cid}")
	public @ResponseBody CompanyCsnCnameDTO getCompanyCsnCname(@PathVariable String cid){
		CompanyCsnCnameDTO companyCsnCnameDTO = companyServices.getCompanyCsnCnameDTO(cid);
		return companyCsnCnameDTO;
	}
}
