package com.xxs.definedweek.dao.impl;

import java.util.List;

import com.xxs.definedweek.dao.ReshipDao;
import com.xxs.definedweek.entity.Reship;

import org.springframework.stereotype.Repository;

/**
 * Dao实现类 - 退货

 * KEY: DEFINEDWEEK6624D83301C073E40676B792A192D5EE

 */

@Repository("reshipDaoImpl")
public class ReshipDaoImpl extends BaseDaoImpl<Reship, String> implements ReshipDao {
	
	@SuppressWarnings("unchecked")
	public String getLastReshipSn() {
		String hql = "from Reship as reship order by reship.createDate desc";
		List<Reship> reshipList =  getSession().createQuery(hql).setFirstResult(0).setMaxResults(1).list();
		if (reshipList != null && reshipList.size() > 0) {
			return reshipList.get(0).getReshipSn();
		} else {
			return null;
		}
	}

}