package com.xxs.definedweek.dao;

import java.util.List;

import com.xxs.definedweek.bean.Pager;
import com.xxs.definedweek.entity.GoodsAttribute;
import com.xxs.definedweek.entity.GoodsType;

/**
 * Dao接口 - 商品属性

 * KEY: DEFINEDWEEK4D051F4491A9917665E897135777FB7C

 */

public interface GoodsAttributeDao extends BaseDao<GoodsAttribute, String> {
	
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