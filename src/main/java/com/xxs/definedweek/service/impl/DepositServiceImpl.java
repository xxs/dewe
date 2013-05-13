package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.bean.Pager;
import com.xxs.definedweek.dao.DepositDao;
import com.xxs.definedweek.entity.Deposit;
import com.xxs.definedweek.entity.Member;
import com.xxs.definedweek.service.DepositService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service实现类 - 预存款记录

 * KEY: DEFINEDWEEK622F01BF112F3C630E9962A378F07787

 */

@Service("depositServiceImpl")
public class DepositServiceImpl extends BaseServiceImpl<Deposit, String> implements DepositService {

	@Resource(name = "depositDaoImpl")
	private DepositDao depositDao;
	
	@Resource(name = "depositDaoImpl")
	public void setBaseDao(DepositDao depositDao) {
		super.setBaseDao(depositDao);
	}
	
	@Transactional(readOnly = true)
	public Pager getDepositPager(Member member, Pager pager) {
		return depositDao.getDepositPager(member, pager);
	}

}