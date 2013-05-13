package com.xxs.definedweek.service;

import java.util.List;

import com.xxs.definedweek.entity.InstantMessaging;
import com.xxs.definedweek.entity.InstantMessaging.InstantMessagingType;

/**
 * Service接口 - 在线客服

 * KEY: DEFINEDWEEKB99DB2E7E2EF324F36B462FD6C183267

 */

public interface InstantMessagingService extends BaseService<InstantMessaging, String> {
	
	/**
	 * 根据在线客服类型、最大结果数获取在线客服集合
	 *            
	 * @param instantMessagingType
	 *            在线客服类型,null表示无限制
	 * 
	 * @param maxResults
	 *            最大结果数,null表示无限制
	 * 
	 * @return 在线客服集合
	 */
	public List<InstantMessaging> getInstantMessagingList(InstantMessagingType instantMessagingType, Integer maxResults);

}