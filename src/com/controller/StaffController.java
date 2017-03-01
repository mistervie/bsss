package com.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.staff.services.StaffServices;
import com.view.dto.StaffAllSelectDTO;
import com.view.dto.StaffBasicInfoDTO;

@Controller
public class StaffController {
	
	@Autowired
	@Qualifier("staffServices")
	private StaffServices staffServices;
	
	
	@RequestMapping("/getStaffBasicInfo/{sidinput}")
	public @ResponseBody StaffBasicInfoDTO getStaffBasicInfo(@PathVariable String sidinput){
		StaffBasicInfoDTO sbid = staffServices.getStaffBasicInfo(sidinput);
		return sbid;
	}
	
	@RequestMapping("/getStaffAllSelect/{sname}/{start}/{pageSize}")
	public @ResponseBody List<StaffAllSelectDTO> getStaffAllSelect(@PathVariable String sname, @PathVariable int start, @PathVariable int pageSize){
		List<StaffAllSelectDTO> staffAllSelectDTOList = staffServices.getStaffAllSelectByName(sname, start, pageSize);
		for(int i=0;i<staffAllSelectDTOList.size();i++){
			System.out.println(staffAllSelectDTOList.get(i));
		}
		return staffAllSelectDTOList;
	}
	
	@RequestMapping("/getStaffAllSelectNumber/{sname}")
	public @ResponseBody String getStaffAllSelectLastPageNumber(@PathVariable String sname){
		String countNumber = String.valueOf(staffServices.getStaffAllInfoPageNumber(sname));
		return "{\"result\":\""+countNumber+"\"}";
	}
	
	@RequestMapping(value="/updateStaffBasicInfo")
	public @ResponseBody String updateStaffBasicInfo(StaffBasicInfoDTO staffBasicInfoDTO) throws JsonParseException, JsonMappingException, IOException{
		
		System.out.println(staffBasicInfoDTO);
		boolean updateResult = staffServices.updateStaffBasicInfo(staffBasicInfoDTO);
		if(updateResult){
			return "{\"result\":\"ok\"}";
		}else{
			return "{\"result\":\"error\"}";
		}
	}
}
