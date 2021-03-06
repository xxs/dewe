package com.xxs.definedweek.dao.impl;

import java.util.List;

import com.xxs.definedweek.bean.Pager;
import com.xxs.definedweek.dao.CommentDao;
import com.xxs.definedweek.entity.Comment;
import com.xxs.definedweek.entity.Goods;

import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 * Dao实现类 - 评论

 * KEY: DEFINEDWEEKF443BAE0CC7277A3DD71774267D31005

 */

@Repository("commentDaoImpl")
public class CommentDaoImpl extends BaseDaoImpl<Comment, String> implements CommentDao {
	
	public Pager getCommentPager(Pager pager) {
		return super.findPager(pager, Restrictions.isNull("forComment"));
	}
	
	public Pager getCommentPager(Pager pager, Goods goods) {
		return super.findPager(pager, Restrictions.isNull("forComment"), Restrictions.eq("isShow", true), Restrictions.eq("goods", goods));
	}
	
	@SuppressWarnings("unchecked")
	public List<Comment> getCommentList(Goods goods, Integer maxResults) {
		Query query = null;
		if (goods != null) {
			String hql = "from Comment as comment where comment.isShow = :isShow and comment.forComment is null and comment.goods = :goods order by comment.createDate desc";
			query = getSession().createQuery(hql);
			query.setParameter("isShow", true).setParameter("goods", goods);
		} else {
			String hql = "from Comment as comment where comment.isShow = :isShow and comment.forComment is null order by comment.createDate desc";
			query = getSession().createQuery(hql);
			query.setParameter("isShow", true);
		}
		if (maxResults != null) {
			query.setMaxResults(maxResults);
		}
		return query.list();
	}
	
}