package com.staff.services;

import java.util.List;

import com.view.dto.StaffAllSelectDTO;
import com.view.dto.StaffBasicInfoDTO;

public interface StaffServices {
	public StaffBasicInfoDTO getStaffBasicInfo(String sid);
	public boolean updateStaffBasicInfo(StaffBasicInfoDTO staffBasicInfoDTO);
	public List<StaffAllSelectDTO> getStaffAllSelectByName(String sname, int start, int limit);
	public int getStaffAllInfoPageNumber(String sname);
}
