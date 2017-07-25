package com.springmvc.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.springmvc.dao.IUserInfoDao;
import com.springmvc.model.UserInfo;

@Repository
public class UserInfoDaoImpl extends SqlSessionDaoSupport implements
		IUserInfoDao {

	@Override
	public List<UserInfo> getUsers() {
		List<UserInfo>  users =null;
		IUserInfoDao userInfoDao=null;
		SqlSession session = null;
		try {
			 session = this.getSqlSession();
			userInfoDao = session.getMapper(IUserInfoDao.class);
			users = userInfoDao.getUsers();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return users;
	}

	public List<UserInfo> getUserByName(String uusername){
		List<UserInfo> userList=new ArrayList<UserInfo>();
		IUserInfoDao userInfoDao=null;
		SqlSession session=null;
		try {
			session=this.getSqlSession();
			userInfoDao=session.getMapper(IUserInfoDao.class);
			userList=userInfoDao.getUserByName(uusername);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;
	}
	public List<UserInfo> login(Map<String, String> map){
		List<UserInfo> userList=new ArrayList<UserInfo>();
		IUserInfoDao userInfoDao=null;
		SqlSession session=null;
		try {
			session=this.getSqlSession();
			userInfoDao=session.getMapper(IUserInfoDao.class);
			userList=userInfoDao.login(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;
	}
	public int addUser(UserInfo user){
		int num=0;
		IUserInfoDao userInfoDao=null;
		SqlSession session=null;
		try {
			session=this.getSqlSession();
			userInfoDao=session.getMapper(IUserInfoDao.class);
			num=userInfoDao.addUser(user);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}
	public int updateUser(UserInfo user){
		int num=0;
		IUserInfoDao userInfoDao=null;
		SqlSession session=null;
		try {
			session=this.getSqlSession();
			userInfoDao=session.getMapper(IUserInfoDao.class);
			num=userInfoDao.updateUser(user);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}
	public int deleteUser(UserInfo user){
		int num=0;
		IUserInfoDao userInfoDao=null;
		SqlSession session=null;
		try {
			session=this.getSqlSession();
			userInfoDao=session.getMapper(IUserInfoDao.class);
			num=userInfoDao.deleteUser(user);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			userInfoDao=null;
		}
		return num;
	}

}
