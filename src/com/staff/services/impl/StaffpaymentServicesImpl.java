package com.staff.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.factory.StaffpaymentFactory;
import com.staff.dao.StaffpaymentDAO;
import com.staff.entity.Staffpayment;
import com.staff.services.StaffpaymentServices;
import com.view.dto.StaffEveryYearPaymentInfoDTO;

@Service("staffpaymentServices")
public class StaffpaymentServicesImpl implements StaffpaymentServices {

	
	@Autowired
	@Qualifier("staffpaymentDAO")
	private StaffpaymentDAO staffpaymentDAO;
	
	@Autowired
	@Qualifier("staffpaymentFactory")
	private StaffpaymentFactory staffpaymentFactory;
	
	
	@Override
	public List<StaffEveryYearPaymentInfoDTO> getStaffPayment(String sid) {
		// TODO Auto-generated method stub
		List<Staffpayment> staffpaymentList = staffpaymentDAO.getStaffpaymentBySid(sid);
		List<StaffEveryYearPaymentInfoDTO> staffpaymentDTOList = new ArrayList<StaffEveryYearPaymentInfoDTO>();
		if(staffpaymentList != null){
			staffpaymentDTOList = staffpaymentFactory.staffpaymentToStaffEveryYearPaymentInfoDTO(staffpaymentList);
		}
		return staffpaymentDTOList;
	}

}
