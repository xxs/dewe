package com.xxs.definedweek.dao.impl;

import com.xxs.definedweek.bean.Pager;
import com.xxs.definedweek.dao.GoodsNotifyDao;
import com.xxs.definedweek.entity.GoodsNotify;
import com.xxs.definedweek.entity.Member;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 * Dao实现类 - 到货通知

 * KEY: DEFINEDWEEKAC8DDA6F41F51B7BA7B541180E9FE7F7

 */

@Repository("goodsNotifyDaoImpl")
public class GoodsNotifyDaoImpl extends BaseDaoImpl<GoodsNotify, String> implements GoodsNotifyDao {
	
	public Pager findPager(Member member, Pager pager) {
		return super.findPager(pager, Restrictions.eq("member", member));
	}
	
	public Long getUnprocessedGoodsNotifyCount() {
		String hql = "select count(*) from GoodsNotify as goodsNotify where goodsNotify.isSent = :isSent";
		return (Long) getSession().createQuery(hql).setParameter("isSent", false).uniqueResult();
	}

}