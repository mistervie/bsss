package com.factory.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.factory.StaffpaymentFactory;
import com.staff.entity.Staffpayment;
import com.utils.Utils;
import com.view.dto.StaffEveryYearPaymentInfoDTO;


@Repository("staffpaymentFactory")
public class StaffpaymentFactoryImpl implements StaffpaymentFactory {
	
	private Utils utils = new Utils();

	@Override
	public List<StaffEveryYearPaymentInfoDTO> staffpaymentToStaffEveryYearPaymentInfoDTO(List<Staffpayment> staffpaymentList) {
		// TODO Auto-generated method stub
		List<StaffEveryYearPaymentInfoDTO> staffpaymentDTOList = new ArrayList<StaffEveryYearPaymentInfoDTO>();
		
		String yeartemp = staffpaymentList.get(0).getPym().substring(0, 3);
		for(int i=0;i<staffpaymentList.size();i++){
			StaffEveryYearPaymentInfoDTO seypi = new StaffEveryYearPaymentInfoDTO();
			Staffpayment sp = staffpaymentList.get(i);
			String pym = sp.getPym();
			String year = pym.substring(0, 3);
			seypi.setYear(year);
			String month = pym.substring(4, 5);
			if(yeartemp == year && yeartemp.equals(year)){
				switch (month) {
				case "01":
					seypi.setJan(String.valueOf(sp.getPbase()));
					break;
				case "02":
					seypi.setFeb(String.valueOf(sp.getPbase()));
					break;
				case "03":
					seypi.setMar(String.valueOf(sp.getPbase()));
					break;
				case "04":
					seypi.setApr(String.valueOf(sp.getPbase()));
					break;
				case "05":
					seypi.setMay(String.valueOf(sp.getPbase()));
					break;
				case "06":
					seypi.setJu(String.valueOf(sp.getPbase()));
					break;
				case "07":
					seypi.setJul(String.valueOf(sp.getPbase()));
					break;
				case "08":
					seypi.setAug(String.valueOf(sp.getPbase()));
					break;
				case "09":
					seypi.setSep(String.valueOf(sp.getPbase()));
					break;
				case "10":
					seypi.setOct(String.valueOf(sp.getPbase()));
					break;
				case "11":
					seypi.setNov(String.valueOf(sp.getPbase()));
					break;
				case "12":
					seypi.setDec(String.valueOf(sp.getPbase()));
					break;
				default:
					break;
				}
				continue;
			}else{
				seypi.setYear(year);
				switch (month) {
				case "01":
					seypi.setJan(String.valueOf(sp.getPbase()));
					break;
				case "02":
					seypi.setFeb(String.valueOf(sp.getPbase()));
					break;
				case "03":
					seypi.setMar(String.valueOf(sp.getPbase()));
					break;
				case "04":
					seypi.setApr(String.valueOf(sp.getPbase()));
					break;
				case "05":
					seypi.setMay(String.valueOf(sp.getPbase()));
					break;
				case "06":
					seypi.setJu(String.valueOf(sp.getPbase()));
					break;
				case "07":
					seypi.setJul(String.valueOf(sp.getPbase()));
					break;
				case "08":
					seypi.setAug(String.valueOf(sp.getPbase()));
					break;
				case "09":
					seypi.setSep(String.valueOf(sp.getPbase()));
					break;
				case "10":
					seypi.setOct(String.valueOf(sp.getPbase()));
					break;
				case "11":
					seypi.setNov(String.valueOf(sp.getPbase()));
					break;
				case "12":
					seypi.setDec(String.valueOf(sp.getPbase()));
					break;
				default:
					break;
				}
			}
			
		}
		return staffpaymentDTOList;
	}

}
