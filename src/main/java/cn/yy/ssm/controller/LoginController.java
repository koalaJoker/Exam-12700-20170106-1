package cn.yy.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.yy.ssm.po.Customer;
import cn.yy.ssm.service.CustomerService;

@Controller
public class LoginController {
	@Autowired
	private CustomerService customerService;

		@RequestMapping("/login")
		@ResponseBody
		public String  queryItems(@RequestParam(name = "username", required = false, defaultValue = "") String username) throws Exception{
			Customer customer= customerService.findCustmer(username);
			//System.out.println(username);System.out.println(customer);
			
			if(customer!=null){
				
				return "film.html";
			}else{
				return "0";
			}
			
			
	}
}
