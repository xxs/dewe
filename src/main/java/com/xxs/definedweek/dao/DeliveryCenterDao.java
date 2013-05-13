package com.xxs.definedweek.dao;

import com.xxs.definedweek.entity.DeliveryCenter;

/**
 * Dao接口 - 发货点

 * KEY: DEFINEDWEEK6EC45B0FCAF1A33579C2CA7460906C3F

 */

public interface DeliveryCenterDao extends BaseDao<DeliveryCenter, String> {
	
	/**
	 * 获取默认发货点,若无默认发货点,则获取最先添加的发货点
	 * 
	 */
	public DeliveryCenter getDefaultDeliveryCenter();

}