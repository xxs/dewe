package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.dao.RefundDao;
import com.xxs.definedweek.entity.Refund;
import com.xxs.definedweek.service.RefundService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service实现类 - 退款

 * KEY: DEFINEDWEEK33368CD07557B60629179EF8EDB49808

 */

@Service("refundServiceImpl")
public class RefundServiceImpl extends BaseServiceImpl<Refund, String> implements RefundService {
	
	@Resource(name = "refundDaoImpl")
	private RefundDao refundDao;

	@Resource(name = "refundDaoImpl")
	public void setBaseDao(RefundDao refundDao) {
		super.setBaseDao(refundDao);
	}
	
	@Transactional(readOnly = true)
	public String getLastRefundSn() {
		return refundDao.getLastRefundSn();
	}
	
	@Transactional(readOnly = true)
	public Refund getRefundByRefundSn(String refundSn) {
		return refundDao.getRefundByRefundSn(refundSn);
	}

}