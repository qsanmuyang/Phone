package com.springmvc.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.IUserInfoDao;
import com.springmvc.model.UserInfo;
import com.springmvc.service.IUserBiz;
@Service
public class UserInfoService implements IUserBiz {

	@Autowired
	private IUserInfoDao userInfoDao; 
	
	public IUserInfoDao getUserInfoDao() {
		return userInfoDao;
	}

	public void setUserInfoDao(IUserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

	@Override
	public boolean login(Map<String, String> map) {
		boolean flag=false;
		List<UserInfo> userList=userInfoDao.login(map);
		if(!userList.isEmpty()){
			flag=true;
		}
		return flag;
	}

	@Override
	public int addUser(UserInfo user) {
		return userInfoDao.addUser(user);
	}

	@Override
	public boolean findUser(String uusername) {
		boolean flag=false;
		if(!userInfoDao.getUserByName(uusername).isEmpty()){
			flag=true;
		}
		return flag;
	}

	@Override
	public List<UserInfo> getUserInfos() {
		return userInfoDao.getUsers();
	}

}
