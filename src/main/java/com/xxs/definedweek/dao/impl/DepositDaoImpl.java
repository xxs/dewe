package com.xxs.definedweek.dao.impl;

import com.xxs.definedweek.bean.Pager;
import com.xxs.definedweek.dao.DepositDao;
import com.xxs.definedweek.entity.Deposit;
import com.xxs.definedweek.entity.Member;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 * Dao实现类 - 预存款记录

 * KEY: DEFINEDWEEKC18C08E26DB83F5F881422AB66E5DC75

 */

@Repository("depositDaoImpl")
public class DepositDaoImpl extends BaseDaoImpl<Deposit, String> implements DepositDao {

	public Pager getDepositPager(Member member, Pager pager) {
		return super.findPager(pager, Restrictions.eq("member", member));
	}
	
}