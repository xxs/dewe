package com.xxs.definedweek.dao;

import com.xxs.definedweek.bean.Pager;
import com.xxs.definedweek.entity.GoodsNotify;
import com.xxs.definedweek.entity.Member;

/**
 * Dao接口 - 到货通知

 * KEY: DEFINEDWEEK7DE6DBC156621DE89E663E0E451C2E85

 */

public interface GoodsNotifyDao extends BaseDao<GoodsNotify, String> {
	
	/**
	 * 根据Member、Pager获取到货通知分页对象
	 * 
	 * @param member
	 *            Member对象
	 *            
	 * @return 到货通知分页对象
	 */
	public Pager findPager(Member member, Pager pager);
	
	/**
	 * 获取未处理缺货登记数
	 *            
	 * @return 未处理缺货登记数
	 */
	public Long getUnprocessedGoodsNotifyCount();
	
}