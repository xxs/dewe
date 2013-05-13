package com.xxs.definedweek.service;

import com.xxs.definedweek.entity.Reship;

/**
 * Service接口 - 退货

 * KEY: DEFINEDWEEKC7E38C49F1DEA30184481ABB3241FF04

 */

public interface ReshipService extends BaseService<Reship, String> {

	/**
	 * 获取最后生成的退货编号
	 * 
	 * @return 退货编号
	 */
	public String getLastReshipSn();

}