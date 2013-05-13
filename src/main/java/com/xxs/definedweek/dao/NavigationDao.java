package com.xxs.definedweek.dao;

import java.util.List;

import com.xxs.definedweek.entity.Navigation;
import com.xxs.definedweek.entity.Navigation.NavigationPosition;

/**
 * Dao接口 - 导航

 * KEY: DEFINEDWEEK8AB0DD49D172E6AD636A61B24245294C

 */

public interface NavigationDao extends BaseDao<Navigation, String> {
	
	/**
	 * 获取导航集合（只包含isVisible=true的对象）
	 * 
	 * @param navigationPosition
	 *            导航位置,null表示无限制
	 * 
	 * @param maxResults
	 *            最大结果数,null表示无限制
	 * 
	 * @return 顶级商品分类集合
	 * 
	 */
	public List<Navigation> getNavigationList(NavigationPosition navigationPosition, Integer maxResults);
	
}