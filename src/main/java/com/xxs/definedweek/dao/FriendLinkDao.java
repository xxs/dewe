package com.xxs.definedweek.dao;

import java.util.List;

import com.xxs.definedweek.entity.FriendLink;

/**
 * Dao接口 - 友情链接

 * KEY: DEFINEDWEEKC3D6CEBD9415FBD14A8F32042E622780

 */

public interface FriendLinkDao extends BaseDao<FriendLink, String> {

	/**
	 * 获取图片友情链接集合
	 * 
	 * @param type
	 *            文章类型,null表示无限制
	 * 
	 * @param maxResults
	 *            最大结果数,null表示无限制
	 * 
	 * @return 图片友情链接集合
	 * 
	 */
	public List<FriendLink> getFriendLinkList(String type, Integer maxResults);

}