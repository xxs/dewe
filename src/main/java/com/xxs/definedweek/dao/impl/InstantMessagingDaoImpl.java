package com.xxs.definedweek.dao.impl;

import java.util.List;

import com.xxs.definedweek.dao.InstantMessagingDao;
import com.xxs.definedweek.entity.InstantMessaging;
import com.xxs.definedweek.entity.InstantMessaging.InstantMessagingType;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

/**
 * Dao实现类 - 在线客服

 * KEY: DEFINEDWEEK64B5A05594CB1C3B74C8A9B4F94F5991

 */

@Repository("instantMessagingDaoImpl")
public class InstantMessagingDaoImpl extends BaseDaoImpl<InstantMessaging, String> implements InstantMessagingDao {
	
	@SuppressWarnings("unchecked")
	public List<InstantMessaging> getInstantMessagingList(InstantMessagingType instantMessagingType, Integer maxResults) {
		Query query = null;
		if (instantMessagingType != null) {
			String hql = "from InstantMessaging as instantMessaging where instantMessaging.instantMessagingType = :instantMessagingType order by instantMessaging.orderList asc";
			query = getSession().createQuery(hql);
			query.setParameter("instantMessagingType", instantMessagingType);
		} else {
			String hql = "from InstantMessaging as instantMessaging order by instantMessaging.orderList asc";
			query = getSession().createQuery(hql);
		}
		if (maxResults != null) {
			query.setMaxResults(maxResults);
		}
		return query.list();
	}

}