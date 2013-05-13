package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.dao.PaymentDao;
import com.xxs.definedweek.entity.Payment;
import com.xxs.definedweek.service.PaymentService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service实现类 - 支付

 * KEY: DEFINEDWEEK84F252BF71A4D877C0285E8086FBE56D

 */

@Service("paymentServiceImpl")
public class PaymentServiceImpl extends BaseServiceImpl<Payment, String> implements PaymentService {
	
	@Resource(name = "paymentDaoImpl")
	private PaymentDao paymentDao;

	@Resource(name = "paymentDaoImpl")
	public void setBaseDao(PaymentDao paymentDao) {
		super.setBaseDao(paymentDao);
	}
	
	@Transactional(readOnly = true)
	public String getLastPaymentSn() {
		return paymentDao.getLastPaymentSn();
	}
	
	@Transactional(readOnly = true)
	public Payment getPaymentByPaymentSn(String paymentSn) {
		return paymentDao.getPaymentByPaymentSn(paymentSn);
	}

}