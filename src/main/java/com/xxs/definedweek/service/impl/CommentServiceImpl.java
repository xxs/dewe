package com.xxs.definedweek.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.xxs.definedweek.bean.Pager;
import com.xxs.definedweek.dao.CommentDao;
import com.xxs.definedweek.entity.Comment;
import com.xxs.definedweek.entity.Goods;
import com.xxs.definedweek.service.CommentService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service实现类 - 评论

 * KEY: DEFINEDWEEK65B94A1C020124AC5E38C179CA8D1CD0

 */

@Service("commentServiceImpl")
public class CommentServiceImpl extends BaseServiceImpl<Comment, String> implements CommentService {
	
	@Resource(name = "commentDaoImpl")
	private CommentDao commentDao;
	
	@Resource(name = "commentDaoImpl")
	public void setBaseDao(CommentDao commentDao) {
		super.setBaseDao(commentDao);
	}
	
	@Transactional(readOnly = true)
	public Pager getCommentPager(Pager pager) {
		return commentDao.getCommentPager(pager);
	}
	
	@Transactional(readOnly = true)
	public Pager getCommentPager(Pager pager, Goods goods) {
		return commentDao.getCommentPager(pager, goods);
	}
	
	@Transactional(readOnly = true)
	public List<Comment> getCommentList(Goods goods, Integer maxResults) {
		return commentDao.getCommentList(goods, maxResults);
	}

}