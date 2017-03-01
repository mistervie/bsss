package com.staff.services.impl;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import com.factory.StaffFactory;
import com.staff.dao.StaffDAO;
import com.staff.entity.Staff;
import com.staff.entity.Staffpayment;
import com.staff.services.StaffServices;
import com.view.dto.StaffAllSelectDTO;
import com.view.dto.StaffBasicInfoDTO;

@Service("staffServices")
public class StaffServicesImpl implements StaffServices{
	
	@Autowired
	@Qualifier("staffDAO")
	private StaffDAO staffDAO;

	@Autowired
	@Qualifier("staffBasicInfoDTO")
	private StaffBasicInfoDTO staffBasicInfoDTO;

	@Autowired
	@Qualifier("staff")
	private Staff staff;
	
	
	@Autowired
	@Qualifier("staffFactory")
	private StaffFactory staffFactory;
	
	//获取在职职工基本信息
	@Override
	public StaffBasicInfoDTO getStaffBasicInfo(String sid) {
		// TODO Auto-generated method stub
		Staff staff = staffDAO.getStaffBasicInfo(sid);
		if(staff != null){
			staffBasicInfoDTO = staffFactory.staffToStaffBasicInfo(staff);
		}else{
			staffBasicInfoDTO.setSid(null);
		}
		return staffBasicInfoDTO;
	}

	//更新在职职工基本信息
	@Override
	public boolean updateStaffBasicInfo(StaffBasicInfoDTO staffBasicInfoDTO) {
		// TODO Auto-generated method stub
		if(staffBasicInfoDTO != null){
			staff = staffFactory.staffBasicInfoToStaff(staffBasicInfoDTO);
		}
		int res = staffDAO.updateStaffBasicInfo(staff);
		if(res > 0 ){
			return true;
		}else{
			return false;
		}
	}

	//根据姓名获取在职职工基本信息
	@Override
	public List<StaffAllSelectDTO> getStaffAllSelectByName(String sname, int start, int limit) {
		// TODO Auto-generated method stub
		List<Staff> staffList = staffDAO.getStaffsByName(sname, start, limit);
		List<StaffAllSelectDTO> staffAllSelectDTOList = staffFactory.staffAndStaffPaymentToStaffAllSelectDTO(staffList);
		return staffAllSelectDTOList;
	}

	//根据姓名获取在职职工基本信息最后一页页码
	@Override
	public int getStaffAllInfoPageNumber(String sname) {
		return staffDAO.getStaffsCountByName(sname);
	}

}
