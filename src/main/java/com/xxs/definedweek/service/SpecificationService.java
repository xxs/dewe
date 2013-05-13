package com.xxs.definedweek.service;

import com.xxs.definedweek.bean.SpecificationValue;
import com.xxs.definedweek.entity.Specification;

/**
 * Service接口 - 商品规格

 * KEY: DEFINEDWEEK0093A02DC48CD73BDC71C06BA52A9AD2

 */

public interface SpecificationService extends BaseService<Specification, String> {
	
	/**
	 * 根据商品规格ID、商品规格值ID获取规格值
	 * 
	 * @param specificationId
	 *            商品规格ID
	 *            
	 * @param specificationValueId
	 *            商品规格值ID
	 *            
	 * @return 商品规格值
	 */
	public SpecificationValue getSpecificationValue(String specificationId, String specificationValueId);

}