package com.xxs.definedweek.service;

import java.util.List;

import com.xxs.definedweek.bean.Pager;
import com.xxs.definedweek.entity.GoodsAttribute;
import com.xxs.definedweek.entity.GoodsType;

/**
 * Service接口 - 商品属性

 * KEY: DEFINEDWEEK5F501119538BE415CF4E4B56A4ACD3E9

 */

public interface GoodsAttributeService extends BaseService<GoodsAttribute, String> {
	
	/**
	 * 根据商品类型获取未使用的商品属性值对象属性序号,若无可用序号则返回null
	 * 
	 * @return 商品属性值对象属性序号
	 */
	public Integer getUnusedPropertyIndex(GoodsType goodsType);
	
	/**
	 * 根据商品类型获取商品属性集合
	 * 
	 * @return 商品属性集合
	 */
	public List<GoodsAttribute> getGoodsAttributeList(GoodsType goodsType);
	
	/**
	 * 根据商品类型获取商品属性分页对象
	 * 
	 * @return 分页对象
	 */
	public Pager getGoodsAttributePager(GoodsType goodsType, Pager pager);

}