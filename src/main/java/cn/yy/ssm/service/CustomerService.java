package cn.yy.ssm.service;

import cn.yy.ssm.po.Customer;

public interface CustomerService {
	
	public Customer findCustmer(String lastName);
}
