package com.factory;

import java.util.List;

import com.staff.entity.Staffpayment;
import com.view.dto.StaffEveryYearPaymentInfoDTO;

public interface StaffpaymentFactory {
	public List<StaffEveryYearPaymentInfoDTO> staffpaymentToStaffEveryYearPaymentInfoDTO(List<Staffpayment> staffpaymentList);
}
