package com.factory.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.entity.Company;
import com.factory.StaffFactory;
import com.staff.entity.Staff;
import com.staff.entity.Staffpayment;
import com.utils.Utils;
import com.view.dto.StaffAllSelectDTO;
import com.view.dto.StaffBasicInfoDTO;

@Repository("staffFactory")
public class StaffFactoryImpl implements StaffFactory{

	private Utils utils = new Utils();
	
	@Autowired
	@Qualifier("company")
	private Company company;
	
	@Autowired
	@Qualifier("staff")
	private Staff staff;
	
	@Autowired
	@Qualifier("staffBasicInfoDTO")
	private StaffBasicInfoDTO staffBasicInfoDTO;
	

	
	@Override
	public StaffBasicInfoDTO staffToStaffBasicInfo(Staff staff) {
		staffBasicInfoDTO.setSid(staff.getSid());
		staffBasicInfoDTO.setSino(staff.getSino());
		staffBasicInfoDTO.setSname(staff.getSname());
		staffBasicInfoDTO.setSsex(String.valueOf(staff.getSsex()));
		staffBasicInfoDTO.setSnation(String.valueOf(staff.getSnation()));
		staffBasicInfoDTO.setSbirth(utils.dateToString(staff.getSbirth()));
		staffBasicInfoDTO.setSdaj(utils.dateToString(staff.getSdaj()));
		staffBasicInfoDTO.setSpi(String.valueOf(staff.getSpi()));
		staffBasicInfoDTO.setSeb(String.valueOf(staff.getSeb()));
		staffBasicInfoDTO.setSstate(String.valueOf(staff.getSstate()));
		staffBasicInfoDTO.setCid(staff.getCompany().getCid());
		staffBasicInfoDTO.setCsn(staff.getCompany().getCsn());
		staffBasicInfoDTO.setCname(staff.getCompany().getCname());
		return staffBasicInfoDTO;
	}

	@Override
	public Staff staffBasicInfoToStaff(StaffBasicInfoDTO staffBasicInfoDTO) {
		// TODO Auto-generated method stub
		staff.setSid(staffBasicInfoDTO.getSid());
		staff.setSino(staffBasicInfoDTO.getSino());
		staff.setSname(staffBasicInfoDTO.getSname());
		staff.setSsex(Integer.parseInt(staffBasicInfoDTO.getSsex()));
		staff.setSnation(Integer.parseInt(staffBasicInfoDTO.getSnation()));
		try {
			staff.setSbirth(utils.stringToDate(staffBasicInfoDTO.getSbirth()));
			staff.setSdaj(utils.stringToDate(staffBasicInfoDTO.getSdaj()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		staff.setSpi(Integer.parseInt(staffBasicInfoDTO.getSpi()));
		staff.setSeb(Integer.parseInt(staffBasicInfoDTO.getSeb()));
		company.setCid(staffBasicInfoDTO.getCid());
		staff.setCompany(company);
		staff.setSstate(Integer.parseInt(staffBasicInfoDTO.getSstate()));
		System.out.println("staffFactory-"+staff);
		return staff;
	}

	@Override
	public List<StaffAllSelectDTO> staffAndStaffPaymentToStaffAllSelectDTO(List<Staff> staffList) {
		List<StaffAllSelectDTO> list = new ArrayList<StaffAllSelectDTO>();
		for(int i=0;i<staffList.size();i++){
			StaffAllSelectDTO staffAllSelectDTO = new StaffAllSelectDTO();
			staffAllSelectDTO.setSid(staffList.get(i).getSid());
			staffAllSelectDTO.setSino(staffList.get(i).getSino());
			staffAllSelectDTO.setSname(staffList.get(i).getSname());
//			staffAllSelectDTO.setSsex(String.valueOf(staffList.get(i).getSsex()));
//			staffAllSelectDTO.setSnation(String.valueOf(staffList.get(i).getSnation()));
			
			staffAllSelectDTO.setSsex("男");
			staffAllSelectDTO.setSnation("汉");
			
			
			staffAllSelectDTO.setSbirth(utils.dateToString(staffList.get(i).getSbirth()));
			staffAllSelectDTO.setSdaj(utils.dateToString(staffList.get(i).getSdaj()));
			staffAllSelectDTO.setPbase(String.valueOf(staffList.get(i).getSpbase()));
//			staffAllSelectDTO.setSstate(String.valueOf(staffList.get(i).getSstate()));
			
			staffAllSelectDTO.setSstate("在职");
			
			staffAllSelectDTO.setCid(staffList.get(i).getCompany().getCid());
			staffAllSelectDTO.setCsn(staffList.get(i).getCompany().getCsn());
			list.add(staffAllSelectDTO);
		}
		return list;
	}

}
