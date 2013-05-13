package com.xxs.definedweek.service;

import com.xxs.definedweek.entity.DeliveryCenter;

/**
 * Service接口 - 发货点

 * KEY: DEFINEDWEEK3F6674D6C2E7DF7287EF69622E4F46B5

 */

public interface DeliveryCenterService extends BaseService<DeliveryCenter, String> {
	
	/**
	 * 获取默认发货点,若无默认发货点,则获取最先添加的发货点
	 * 
	 */
	public DeliveryCenter getDefaultDeliveryCenter();

}