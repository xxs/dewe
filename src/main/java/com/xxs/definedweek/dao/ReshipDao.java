package com.xxs.definedweek.dao;

import com.xxs.definedweek.entity.Reship;

/**
 * Dao接口 - 退货

 * KEY: DEFINEDWEEK637C7DD59A103EF33A7394FCC82CDD9F

 */

public interface ReshipDao extends BaseDao<Reship, String> {
	
	/**
	 * 获取最后生成的退货编号
	 * 
	 * @return 退货编号
	 */
	public String getLastReshipSn();

}