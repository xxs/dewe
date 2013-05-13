package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.dao.ReshipDao;
import com.xxs.definedweek.entity.Reship;
import com.xxs.definedweek.service.ReshipService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service实现类 - 退货

 * KEY: DEFINEDWEEK14093C23520A786815DFA8C679BCDD5F

 */

@Service("reshipServiceImpl")
public class ReshipServiceImpl extends BaseServiceImpl<Reship, String> implements ReshipService {
	
	@Resource(name = "reshipDaoImpl")
	private ReshipDao reshipDao;

	@Resource(name = "reshipDaoImpl")
	public void setBaseDao(ReshipDao reshipDao) {
		super.setBaseDao(reshipDao);
	}
	
	@Transactional(readOnly = true)
	public String getLastReshipSn() {
		return reshipDao.getLastReshipSn();
	}

}