package com.springmvc.dao;

import java.util.List;

import com.springmvc.model.PhoneInfo;

public interface IPhoneInfoDao {
	
	public List<PhoneInfo> getPhones();
	
	public List<PhoneInfo> getPhonesByPtype(String ptype);
	
	public int addPhone(PhoneInfo phoneInfo);
	
	public int updatePhone(PhoneInfo phoneInfo);
	
	public int deletePhone(int pid);
	
	public PhoneInfo getPhoneByPid(int pid);
	
}
