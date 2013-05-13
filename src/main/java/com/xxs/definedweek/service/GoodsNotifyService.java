package com.xxs.definedweek.service;

import com.xxs.definedweek.bean.Pager;
import com.xxs.definedweek.entity.GoodsNotify;
import com.xxs.definedweek.entity.Member;

/**
 * Service接口 - 到货通知

 * KEY: DEFINEDWEEK868582BB07E8457F3171FCCADB94B449

 */

public interface GoodsNotifyService extends BaseService<GoodsNotify, String> {

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