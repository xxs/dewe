package com.xxs.definedweek.service;

import com.xxs.definedweek.entity.Product;

/**
 * Service接口 - 货品

 * KEY: DEFINEDWEEK62F330D4576F1CE472FE4A72A3C1070A

 */

public interface ProductService extends BaseService<Product, String> {
	
	/**
	 * 根据货品编号判断此货品是否存在（不区分大小写）
	 * 
	 */
	public boolean isExistByProductSn(String productSn);
	
	/**
	 * 根据货品编号判断此货品是否唯一（不区分大小写）
	 * 
	 */
	public boolean isUniqueByProductSn(String oldProductSn, String newProductSn);
	
	/**
	 * 获取货品库存报警数
	 *            
	 * @return 货品库存报警数
	 */
	public Long getStoreAlertCount();

}