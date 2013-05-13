package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.dao.AdminDao;
import com.xxs.definedweek.entity.Admin;
import com.xxs.definedweek.service.AdminService;

import org.springframework.security.Authentication;
import org.springframework.security.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service实现类 - 管理员

 * KEY: DEFINEDWEEKEEB47174264A6259B9A1BA5D141B72C0

 */

@Service("adminServiceImpl")
public class AdminServiceImpl extends BaseServiceImpl<Admin, String> implements AdminService {

	@Resource(name = "adminDaoImpl")
	private AdminDao adminDao;
	
	@Resource(name = "adminDaoImpl")
	public void setBaseDao(AdminDao adminDao) {
		super.setBaseDao(adminDao);
	}
	
	public Admin getLoginAdmin() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null) {
			return null;
		}
		Object principal = authentication.getPrincipal();
		if (principal == null || !(principal instanceof Admin)) {
			return null;
		} else {
			return (Admin) principal;
		}
	}
	
	@Transactional(readOnly = true)
	public Admin loadLoginAdmin() {
		Admin admin = getLoginAdmin();
		if (admin == null) {
			return null;
		} else {
			return adminDao.load(admin.getId());
		}
	}
	
	@Transactional(readOnly = true)
	public boolean isExistByUsername(String username) {
		return adminDao.isExistByUsername(username);
	}
	
	@Transactional(readOnly = true)
	public Admin getAdminByUsername(String username) {
		return adminDao.getAdminByUsername(username);
	}

}