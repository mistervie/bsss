package com.staff.dao;

import java.util.List;

import com.staff.entity.Staff;
import com.staff.entity.Staffpayment;

public interface StaffDAO {
	public Staff getStaffBasicInfo(String sid);
	
	public List<Staff> getStaffsByName(String sname, int start, int limit);
	
	public int getStaffsCountByName(String sname);
	
	public int updateStaffBasicInfo(Staff staff);
	
}
