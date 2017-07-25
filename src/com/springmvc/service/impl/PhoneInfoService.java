package com.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.IPhoneInfoDao;
import com.springmvc.model.PhoneInfo;
import com.springmvc.service.IPhoneBiz;

@Service
public class PhoneInfoService implements IPhoneBiz {
	
	@Autowired
	private IPhoneInfoDao infoDao;
	
	
	public IPhoneInfoDao getInfoDao() {
		return infoDao;
	}

	public void setInfoDao(IPhoneInfoDao infoDao) {
		this.infoDao = infoDao;
	}

	@Override
	public List<PhoneInfo> getPhones() {
		
		return infoDao.getPhones();
	}

	@Override
	public int addPhone(PhoneInfo phoneInfo) {
		
		return infoDao.addPhone(phoneInfo);
	}

	@Override
	public int updatePhone(PhoneInfo phoneInfo) {
		
		return infoDao.updatePhone(phoneInfo);
	}

	@Override
	public int deletePhone(int pid) {
		
		return infoDao.deletePhone(pid);
	}

	@Override
	public List<PhoneInfo> getPhonesByPtype(String ptype) {

		return infoDao.getPhonesByPtype(ptype);
	}

	@Override
	public PhoneInfo getPhoneByPid(int pid) {

		return infoDao.getPhoneByPid(pid);
	}

}
