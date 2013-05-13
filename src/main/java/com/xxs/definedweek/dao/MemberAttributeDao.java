package com.xxs.definedweek.dao;

import java.util.List;

import com.xxs.definedweek.entity.MemberAttribute;

/**
 * Dao接口 - 会员属性

 * KEY: DEFINEDWEEK7A5E44F9B13AA8536A1A807D94A5B481

 */

public interface MemberAttributeDao extends BaseDao<MemberAttribute, String> {
	
	/**
	 * 获取未使用的会员注册项值对象属性序号,若无可用序号则返回null.
	 * 
	 * @return 会员注册项值对象属性序号
	 */
	public Integer getUnusedPropertyIndex();

	/**
	 * 获取会员注册项集合（只包含已启用对象）
	 * 
	 * @return 会员注册项集合
	 */
	public List<MemberAttribute> getMemberAttributeList();

}