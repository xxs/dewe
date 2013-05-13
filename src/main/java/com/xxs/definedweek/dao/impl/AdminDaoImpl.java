package com.xxs.definedweek.dao.impl;

import com.xxs.definedweek.dao.AdminDao;
import com.xxs.definedweek.entity.Admin;

import org.springframework.stereotype.Repository;

/**
 * Dao实现类 - 管理员

 * KEY: DEFINEDWEEK2A5505E6E90FBFF03FB4B33E05AE2E5C

 */

@Repository("adminDaoImpl")
public class AdminDaoImpl extends BaseDaoImpl<Admin, String> implements AdminDao {
	
	public boolean isExistByUsername(String username) {
		String hql = "from Admin as admin where lower(admin.username) = lower(:username)";
		Admin admin = (Admin) getSession().createQuery(hql).setParameter("username", username).uniqueResult();
		if (admin != null) {
			return true;
		} else {
			return false;
		}
	}
	
	@SuppressWarnings("unchecked")
	public Admin getAdminByUsername(String username) {
		String hql = "from Admin as admin where lower(admin.username) = lower(:username)";
		return (Admin) getSession().createQuery(hql).setParameter("username", username).uniqueResult();
	}

}