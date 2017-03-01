package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.staff.services.StaffServices;
import com.staff.services.StaffpaymentServices;

@Controller
public class StaffpaymentController {
	
	
	@Autowired
	@Qualifier("staffServices")
	private StaffServices staffServices;
	
	@Autowired
	@Qualifier("staffpaymentServices")
	private StaffpaymentServices staffpamentServices;
	
	@RequestMapping(value="/getStaffBasicInfoAndPaymentInfo/{sid}")
	public String getStaffBasicInfoAndPaymentInfo(@PathVariable String sid){
		
		
		return null;
	}
}
