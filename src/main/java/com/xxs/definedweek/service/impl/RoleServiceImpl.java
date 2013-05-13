package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.dao.RoleDao;
import com.xxs.definedweek.entity.Role;
import com.xxs.definedweek.service.RoleService;

import org.springframework.stereotype.Service;

/**
 * Service实现类 - 角色

 * KEY: DEFINEDWEEK5780B32776CB0A6FF3A3530C4BC96D54

 */

@Service("roleServiceImpl")
public class RoleServiceImpl extends BaseServiceImpl<Role, String> implements RoleService {
	
	@Resource(name = "roleDaoImpl")
	RoleDao roleDao;

	@Resource(name = "roleDaoImpl")
	public void setBaseDao(RoleDao roleDao) {
		super.setBaseDao(roleDao);
	}

}