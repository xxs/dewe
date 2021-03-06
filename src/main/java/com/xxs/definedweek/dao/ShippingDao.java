package com.xxs.definedweek.dao;

import com.xxs.definedweek.entity.Shipping;

/**
 * Dao接口 - 发货

 * KEY: DEFINEDWEEKF50FF665BA3F54437122B7D828E6F51C

 */

public interface ShippingDao extends BaseDao<Shipping, String> {
	
	/**
	 * 获取最后生成的发货编号
	 * 
	 * @return 发货编号
	 */
	public String getLastShippingSn();

}