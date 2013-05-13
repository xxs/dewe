package com.xxs.definedweek.dao;

import com.xxs.definedweek.bean.Pager;
import com.xxs.definedweek.entity.LeaveMessage;

/**
 * Dao接口 - 在线留言

 * KEY: DEFINEDWEEK3A0B882ABE9AC561AB89D38D5F32E2BA

 */

public interface LeaveMessageDao extends BaseDao<LeaveMessage, String> {
	
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