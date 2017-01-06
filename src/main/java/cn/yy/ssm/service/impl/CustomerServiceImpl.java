package cn.yy.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.yy.ssm.mapper.CustomerMapper;
import cn.yy.ssm.po.Customer;
import cn.yy.ssm.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{
	@Autowired
private CustomerMapper customerMaper;
	public Customer findCustmer(String lastName) {
		
		return customerMaper.findCustmer(lastName);
	}

}
