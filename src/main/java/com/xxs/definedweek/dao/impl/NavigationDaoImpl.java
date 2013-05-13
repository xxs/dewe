package com.xxs.definedweek.dao.impl;

import java.util.List;

import com.xxs.definedweek.bean.Pager;
import com.xxs.definedweek.dao.NavigationDao;
import com.xxs.definedweek.entity.Navigation;
import com.xxs.definedweek.entity.Navigation.NavigationPosition;

import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

/**
 * Dao实现类 - 导航

 * KEY: DEFINEDWEEK873CAD06D89CFF2EE966FE1FAC8850B3

 */

@Repository("navigationDaoImpl")
public class NavigationDaoImpl extends BaseDaoImpl<Navigation, String> implements NavigationDao {
	
	@SuppressWarnings("unchecked")
	public List<Navigation> getNavigationList(NavigationPosition navigationPosition, Integer maxResults) {
		if (navigationPosition != null) {
			String hql = "from Navigation as navigation where navigation.navigationPosition = :navigationPosition and navigation.isVisible = :isVisible order by navigation.orderList asc";
			if (maxResults != null) {
				return getSession().createQuery(hql).setParameter("navigationPosition", navigationPosition).setParameter("isVisible", true).setMaxResults(maxResults).list();
			} else {
				return getSession().createQuery(hql).setParameter("navigationPosition", navigationPosition).setParameter("isVisible", true).list();
			}
		} else {
			String hql = "from Navigation as navigation where navigation.isVisible = :isVisible order by navigation.orderList asc";
			if (maxResults != null) {
				return getSession().createQuery(hql).setParameter("isVisible", true).setMaxResults(maxResults).list();
			} else {
				return getSession().createQuery(hql).setParameter("isVisible", true).list();
			}
		}
	}
	
	// 根据navigationPosition排序
	@Override
	public Pager findPager(Pager pager) {
		return super.findPager(pager, Order.asc("navigationPosition"));
	}

}