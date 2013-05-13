package com.xxs.definedweek.service;

import java.util.List;

import com.xxs.definedweek.entity.PaymentConfig;

/**
 * Service接口 - 支付配置

 * KEY: DEFINEDWEEKF62254C64269DF9FBA1F2B1C07D33182

 */

public interface PaymentConfigService extends BaseService<PaymentConfig, String> {
	
	/**
	 * 获取非预存款类型的支付配置
	 * 
	 * @return 支付配置
	 */
	public List<PaymentConfig> getNonDepositPaymentConfigList();
	
	/**
	 * 获取非预存款、线下支付方式的支付配置
	 * 
	 * @return 支付配置
	 */
	public List<PaymentConfig> getNonDepositOfflinePaymentConfigList();
	
}