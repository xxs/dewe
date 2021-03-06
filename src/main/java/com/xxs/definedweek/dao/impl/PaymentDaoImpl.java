package com.xxs.definedweek.dao.impl;

import java.util.List;

import com.xxs.definedweek.dao.PaymentDao;
import com.xxs.definedweek.entity.Payment;

import org.springframework.stereotype.Repository;

/**
 * Dao实现类 - 支付

 * KEY: DEFINEDWEEKF9A10498A79B1352A22264FA2960B2E5

 */

@Repository("paymentDaoImpl")
public class PaymentDaoImpl extends BaseDaoImpl<Payment, String> implements PaymentDao {
	
	@SuppressWarnings("unchecked")
	public String getLastPaymentSn() {
		String hql = "from Payment as payment order by payment.createDate desc";
		List<Payment> paymentList =  getSession().createQuery(hql).setFirstResult(0).setMaxResults(1).list();
		if (paymentList != null && paymentList.size() > 0) {
			return paymentList.get(0).getPaymentSn();
		} else {
			return null;
		}
	}
	
	public Payment getPaymentByPaymentSn(String paymentSn) {
		String hql = "from Payment as payment where payment.paymentSn = :paymentSn";
		return (Payment) getSession().createQuery(hql).setParameter("paymentSn", paymentSn).uniqueResult();
	}

}