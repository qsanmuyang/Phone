package com.springmvc.service;

import java.util.List;

import com.springmvc.model.PhoneInfo;

public interface IPhoneBiz {
	
	//获得全部手机信息
	public List<PhoneInfo> getPhones();
	//添加手机信息
	public int  addPhone(PhoneInfo phoneInfo);
	//修改手机信息
	public int  updatePhone(PhoneInfo phoneInfo);
	//删除手机信息
	public int deletePhone(int pid);
	//通过ptype获得手机信息
	public List<PhoneInfo> getPhonesByPtype(String ptype);
	//通过pid获得手机信息
	public PhoneInfo getPhoneByPid(int pid);
}
