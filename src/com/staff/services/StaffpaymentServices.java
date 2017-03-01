package com.staff.services;

import java.util.List;

import com.view.dto.StaffEveryYearPaymentInfoDTO;

public interface StaffpaymentServices {
	public List<StaffEveryYearPaymentInfoDTO> getStaffPayment(String sid);
}
