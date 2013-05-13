package com.xxs.definedweek.service;

import com.xxs.definedweek.bean.Pager;
import com.xxs.definedweek.entity.LeaveMessage;

/**
 * Service接口 - 在线留言

 * KEY: DEFINEDWEEK0173E6044D90E14E7C66F5208467F4F3

 */

public interface LeaveMessageService extends BaseService<LeaveMessage, String> {
	
	/**
	 * 根据Pager获取在线留言分页对象（不包含回复）
	 *            
	 * @param pager
	 *            Pager对象
	 * 
	 * @param isContainUnReply
	 *            是否包含未回复在线留言
	 *            
	 * @return 在线留言分页对象
	 */
	public Pager getLeaveMessagePager(Pager pager, boolean isContainUnReply);
	
}