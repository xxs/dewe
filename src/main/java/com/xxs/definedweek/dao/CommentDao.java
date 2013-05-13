package com.xxs.definedweek.dao;

import java.util.List;

import com.xxs.definedweek.bean.Pager;
import com.xxs.definedweek.entity.Comment;
import com.xxs.definedweek.entity.Goods;

/**
 * Dao接口 - 评论

 * KEY: DEFINEDWEEK3A0B882ABE9AC561AB89D38D5F32E2BA

 */

public interface CommentDao extends BaseDao<Comment, String> {
	
	/**
	 * 根据Pager获取评论分页对象（包含isShow = true的对象,不包含回复）
	 *            
	 * @param pager
	 *            Pager对象
	 *            
	 * @return 评论分页对象
	 */
	public Pager getCommentPager(Pager pager);
	
	/**
	 * 根据商品、pager获取评论集合,若无评论则返回null（只包含isShow = true的对象,不包含回复）
	 * 
	 * @param goods
	 *            商品
	 * 
	 * @param pager
	 *            pger
	 * 
	 * @return 评论集合
	 * 
	 */
	public Pager getCommentPager(Pager pager, Goods goods);
	
	/**
	 * 根据商品、最大结果数获取评论集合,若无评论则返回null（只包含isShow = true的对象,不包含回复）
	 * 
	 * @param goods
	 *            商品,null表示无限制
	 * 
	 * @param maxResults
	 *            最大结果数,null表示无限制
	 * 
	 * @return 评论集合
	 * 
	 */
	public List<Comment> getCommentList(Goods goods, Integer maxResults);
	
}