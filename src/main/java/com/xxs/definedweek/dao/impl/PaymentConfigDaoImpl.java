package com.xxs.definedweek.dao.impl;

import java.util.List;
import java.util.Set;

import com.xxs.definedweek.dao.PaymentConfigDao;
import com.xxs.definedweek.entity.Order;
import com.xxs.definedweek.entity.Payment;
import com.xxs.definedweek.entity.PaymentConfig;
import com.xxs.definedweek.entity.Refund;
import com.xxs.definedweek.entity.PaymentConfig.PaymentConfigType;

import org.springframework.stereotype.Repository;

/**
 * Dao实现类 - 支付配置

 * KEY: DEFINEDWEEKE1842B16170CAE78F2D0E2F7E18EEE4B

 */

@Repository("paymentConfigDaoImpl")
public class PaymentConfigDaoImpl extends BaseDaoImpl<PaymentConfig, String> implements PaymentConfigDao {

	@SuppressWarnings("unchecked")
	public List<PaymentConfig> getNonDepositPaymentConfigList() {
		String hql = "from PaymentConfig as paymentConfig where paymentConfig.paymentConfigType != :paymentConfigType order by paymentConfig.orderList asc";
		return getSession().createQuery(hql).setParameter("paymentConfigType", PaymentConfigType.deposit).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<PaymentConfig> getNonDepositOfflinePaymentConfigList() {
		String hql = "from PaymentConfig as paymentConfig where paymentConfig.paymentConfigType != :paymentConfigTypeDeposit and paymentConfig.paymentConfigType != :paymentConfigTypeOffline order by paymentConfig.orderList asc";
		return getSession().createQuery(hql).setParameter("paymentConfigTypeDeposit", PaymentConfigType.deposit).setParameter("paymentConfigTypeOffline", PaymentConfigType.offline).list();
	}
	
	// 关联处理
	@Override
	public void delete(PaymentConfig paymentConfig) {
		Set<Order> orderSet = paymentConfig.getOrderSet();
		if (orderSet != null) {
			for (Order order : orderSet) {
				order.setPaymentConfig(null);
			}
		}
		
		Set<Payment> paymentSet = paymentConfig.getPaymentSet();
		if (paymentSet != null) {
			for (Payment payment : paymentSet) {
				payment.setPaymentConfig(null);
			}
		}
		
		Set<Refund> refundSet = paymentConfig.getRefundSet();
		if (refundSet != null) {
			for (Refund refund : refundSet) {
				refund.setPaymentConfig(null);
			}
		}
		
		super.delete(paymentConfig);
	}

	// 关联处理
	@Override
	public void delete(String id) {
		PaymentConfig paymentConfig = load(id);
		this.delete(paymentConfig);
	}

	// 关联处理
	@Override
	public void delete(String[] ids) {
		for (String id : ids) {
			PaymentConfig paymentConfig = load(id);
			this.delete(paymentConfig);
		}
	}

}