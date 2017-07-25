package com.springmvc.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.springmvc.dao.IPhoneInfoDao;
import com.springmvc.model.PhoneInfo;

@Repository
public class PhoneInfoDaoImpl extends SqlSessionDaoSupport implements IPhoneInfoDao {

	@Override
	public List<PhoneInfo> getPhones() {
		List<PhoneInfo> phoneList = new ArrayList<PhoneInfo>();
		IPhoneInfoDao infoDao=null;
		SqlSession session=null;
		try {
			session=this.getSqlSession();
			infoDao=session.getMapper(IPhoneInfoDao.class);
			phoneList=infoDao.getPhones();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return phoneList;
	}

	@Override
	public int addPhone(PhoneInfo phoneInfo) {
		int num=0;
		IPhoneInfoDao infoDao=null;
		SqlSession session=null;
		try {
			session=this.getSqlSession();
			infoDao=session.getMapper(IPhoneInfoDao.class);
			num=infoDao.addPhone(phoneInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int updatePhone(PhoneInfo phoneInfo) {
		int num=0;
		IPhoneInfoDao infoDao=null;
		SqlSession session=null;
		try {
			session=this.getSqlSession();
			infoDao=session.getMapper(IPhoneInfoDao.class);
			num=infoDao.updatePhone(phoneInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int deletePhone(int pid) {
		int num=0;
		IPhoneInfoDao infoDao=null;
		SqlSession session=null;
		try {
			session=this.getSqlSession();
			infoDao=session.getMapper(IPhoneInfoDao.class);
			num=infoDao.deletePhone(pid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public List<PhoneInfo> getPhonesByPtype(String ptype) {
		List<PhoneInfo> phoneList = new ArrayList<PhoneInfo>();
		IPhoneInfoDao infoDao=null;
		SqlSession session=null;
		try {
			session=this.getSqlSession();
			infoDao=session.getMapper(IPhoneInfoDao.class);
			phoneList=infoDao.getPhonesByPtype(ptype);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return phoneList;
	}

	@Override
	public PhoneInfo getPhoneByPid(int pid) {
		PhoneInfo pInfo = new PhoneInfo();
		IPhoneInfoDao infoDao=null;
		SqlSession session=null;
		try {
			session=this.getSqlSession();
			infoDao=session.getMapper(IPhoneInfoDao.class);
			pInfo=infoDao.getPhoneByPid(pid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pInfo;
	}


}
