package com.xxs.definedweek.service;

import java.util.List;

import com.xxs.definedweek.entity.Goods;
import com.xxs.definedweek.entity.GoodsCategory;

/**
 * Service接口 - 商品分类

 * KEY: DEFINEDWEEK9A058EDC3D9C0E5B105452AB83A4DF2C

 */

public interface GoodsCategoryService extends BaseService<GoodsCategory, String> {
	
	/**
	 * 判断标识是否存在（不区分大小写）
	 * 
	 * @param sign
	 *            标识
	 * 
	 */
	public boolean isExistBySign(String sign);
	
	/**
	 * 判断标识是否唯一（不区分大小写）
	 * 
	 * @param sign
	 *            旧标识
	 *            
	 * @param newSign
	 *            新标识
	 * 
	 */
	public boolean isUniqueBySign(String oldSign, String newSign);
	
	/**
	 * 根据标识获取GoodsCategory对象
	 * 
	 * @param sign
	 *            sign
	 * 
	 */
	public GoodsCategory getGoodsCategoryBySign(String sign);
	
	/**
	 * 获取商品分类树集合
	 * 
	 * @return 商品分类树集合
	 * 
	 */
	public List<GoodsCategory> getGoodsCategoryTree();
	
	/**
	 * 获取商品分类树集合;
	 * 
	 * @return 商品分类树集合
	 * 
	 */
	public List<GoodsCategory> getGoodsCategoryTreeList();
	
	/**
	 * 获取顶级商品分类集合
	 * 
	 * @param maxResults
	 *            最大结果数,null表示无限制
	 * 
	 * @return 顶级商品分类集合
	 * 
	 */
	public List<GoodsCategory> getRootGoodsCategoryList(Integer maxResults);
	
	/**
	 * 根据GoodsCategory对象获取所有子类集合,若无子类则返回null
	 * 
	 * @param goodsCategory
	 *            goodsCategory
	 *            
	 * @param isContainChildren
	 *            是否包含所有子分类
	 * 
	 * @param maxResults
	 *            最大结果数,null表示无限制
	 * 
	 * @return 子类集合
	 * 
	 */
	public List<GoodsCategory> getChildrenGoodsCategoryList(GoodsCategory goodsCategory, boolean isContainChildren, Integer maxResults);
	
	/**
	 * 根据GoodsCategory对象获取所有父类集合,若无父类则返回null
	 * 
	 * @param goodsCategory
	 *            goodsCategory
	 *            
	 * @param isContainParent
	 *            是否包含所有父分类
	 * 
	 * @param maxResults
	 *            最大结果数,null表示无限制
	 * 
	 * @return 父类集合
	 * 
	 */
	public List<GoodsCategory> getParentGoodsCategoryList(GoodsCategory goodsCategory, boolean isContainParent, Integer maxResults);
	
	/**
	 * 根据Goods对象获取所有父类集合,若无父类则返回null
	 * 
	 * @param goods
	 *            goods
	 *            
	 * @param isContainParent
	 *            是否包含所有父分类
	 * 
	 * @param maxResults
	 *            最大结果数,null表示无限制
	 * 
	 * @return 父类集合
	 * 
	 */
	public List<GoodsCategory> getParentGoodsCategoryList(Goods goods, boolean isContainParent, Integer maxResults);
	
	/**
	 * 根据GoodsCategory对象获取路径集合
	 * 
	 * @param goodsCategory
	 *            goodsCategory
	 * 
	 * @return GoodsCategory路径集合
	 * 
	 */
	public List<GoodsCategory> getGoodsCategoryPathList(GoodsCategory goodsCategory);
	
}