package com.springmvc.dao;

import java.util.List;
import java.util.Map;
import com.springmvc.model.UserInfo;

public interface IUserInfoDao {
	public List<UserInfo> getUsers();
	public List<UserInfo> getUserByName(String username);
	public List<UserInfo> login(Map<String, String> map);
	public int addUser(UserInfo user);
	public int updateUser(UserInfo user);
	public int deleteUser(UserInfo user);
	 
}
