package com.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.staff.services.StaffServices;
import com.user.services.UserServices;
import com.view.dto.StaffBasicInfoDTO;



public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/conf/applicationContext.xml");
		
		StaffServices ss = (StaffServices)ac.getBean("staffServices");
		System.out.println(ss.getStaffBasicInfo("2"));
		
	}
}
