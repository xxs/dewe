package com.xxs.definedweek.dao;

import com.xxs.definedweek.entity.DeliveryTemplate;

/**
 * Dao接口 - 快递单模板

 * KEY: DEFINEDWEEK6EC45B0FCAF1A33579C2CA7460906C3F

 */

public interface DeliveryTemplateDao extends BaseDao<DeliveryTemplate, String> {
	
	/**
	 * 获取默认快递单模板,若无默认快递单模板,则获取最先添加的快递单模板
	 * 
	 */
	public DeliveryTemplate getDefaultDeliveryTemplate();

}