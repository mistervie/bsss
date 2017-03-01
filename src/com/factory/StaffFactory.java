package com.factory;

import java.util.List;

import com.staff.entity.Staff;
import com.staff.entity.Staffpayment;
import com.view.dto.StaffAllSelectDTO;
import com.view.dto.StaffBasicInfoDTO;

public interface StaffFactory {
	public StaffBasicInfoDTO staffToStaffBasicInfo(Staff staff);
	public Staff staffBasicInfoToStaff(StaffBasicInfoDTO staffBasicInfoDTO);
	public List<StaffAllSelectDTO> staffAndStaffPaymentToStaffAllSelectDTO(List<Staff> staffList);
}
