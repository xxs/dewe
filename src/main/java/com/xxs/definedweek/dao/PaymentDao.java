package com.xxs.definedweek.dao;

import com.xxs.definedweek.entity.Payment;

/**
 * Dao接口 - 支付

 * KEY: DEFINEDWEEKACA6CABD1FC7D622AF175DC35325E151

 */

public interface PaymentDao extends BaseDao<Payment, String> {
	
	/**
	 * 获取最后生成的支付编号
	 * 
	 * @return 支付编号
	 */
	public String getLastPaymentSn();
	
	/**
	 * 根据支付编号获取对象（若对象不存在,则返回null）
	 * 
	 * @return 支付对象
	 */
	public Payment getPaymentByPaymentSn(String paymentSn);


}