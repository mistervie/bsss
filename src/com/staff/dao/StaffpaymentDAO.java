package com.staff.dao;

import java.util.List;

import com.staff.entity.Staffpayment;

public interface StaffpaymentDAO {
	public List<Staffpayment> getStaffpaymentBySid(String sid);
}
