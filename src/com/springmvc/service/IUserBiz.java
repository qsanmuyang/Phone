package com.springmvc.service;

import java.util.List;
import java.util.Map;

import com.springmvc.model.UserInfo;

public interface IUserBiz {

	public boolean login(Map<String, String> map);
	public int addUser(UserInfo user);
	public boolean findUser(String uusername);
	public List<UserInfo> getUserInfos();
}
