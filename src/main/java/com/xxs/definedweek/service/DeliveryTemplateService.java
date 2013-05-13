package com.xxs.definedweek.service;

import com.xxs.definedweek.entity.DeliveryTemplate;

/**
 * Service接口 - 快递单模板

 * KEY: DEFINEDWEEK3F6674D6C2E7DF7287EF69622E4F46B5

 */

public interface DeliveryTemplateService extends BaseService<DeliveryTemplate, String> {
	
	/**
	 * 获取默认快递单模板,若无默认快递单模板,则获取最先添加的快递单模板
	 * 
	 */
	public DeliveryTemplate getDefaultDeliveryTemplate();

}