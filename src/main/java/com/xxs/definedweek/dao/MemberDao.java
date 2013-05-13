package com.xxs.definedweek.dao;

import com.xxs.definedweek.entity.Member;

/**
 * Dao接口 - 会员

 * KEY: DEFINEDWEEK7DE6DBC156621DE89E663E0E451C2E85

 */

public interface MemberDao extends BaseDao<Member, String> {
	
	/**
	 * 根据用户名判断此用户是否存在（不区分大小写）
	 * 
	 */
	public boolean isExistByUsername(String username);
	
	/**
	 * 根据用户名获取会员对象,若会员不存在,则返回null（不区分大小写）
	 * 
	 */
	public Member getMemberByUsername(String username);
	
}