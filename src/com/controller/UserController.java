package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.user.entity.User;
import com.user.services.UserServices;

@Controller
public class UserController{
	
	@Autowired
	private UserServices userServices;
	

	
	@RequestMapping(/*value=*/"/login"/*, method=RequestMethod.POST*/)
	public String handleRequest(@ModelAttribute("user") User user,Model model) throws Exception {
		String uname = userServices.checkUser(user);
		System.out.println(uname);
		if(uname != null && !"".equals(uname)){
			model.addAttribute("msg", uname);
			return "main/admin";
		}else{
			model.addAttribute("msg", "用户名或密码错误");
			return "index";
		}
		
	}
	
	@RequestMapping("/basicInfoMaintenance")
	public String basicInfoMaintenance() {
		return "main/basicInfoMaintenance";
	}
	
	@RequestMapping("operatorManagement")
	public String operatorManagement(){
		return "main/operatorManagement";
	}
	
	@RequestMapping("updateLoginPassword")
	public String updateLoginPassword(){
		return "main/updateLoginPassword";
	}
	@RequestMapping("staffallselect")
	public String staffallselect(){
		return "main/staffallselect";
	}
	
	@RequestMapping("infochange")
	public String infochange(){
		return "main/infochange";
	}
	
	@RequestMapping("paymentinfo")
	public String paymentinfo(){
		return "main/paymentinfo";
	}
	
	@RequestMapping("/exit")
	public String exitSys(){
		return "index";
	}

}
