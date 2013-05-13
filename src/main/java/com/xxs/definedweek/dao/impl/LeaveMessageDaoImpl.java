package com.xxs.definedweek.dao.impl;

import com.xxs.definedweek.bean.Pager;
import com.xxs.definedweek.dao.LeaveMessageDao;
import com.xxs.definedweek.entity.LeaveMessage;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 * Dao实现类 - 在线留言

 * KEY: DEFINEDWEEKF443BAE0CC7277A3DD71774267D31005

 */

@Repository("leaveMessageDaoImpl")
public class LeaveMessageDaoImpl extends BaseDaoImpl<LeaveMessage, String> implements LeaveMessageDao{

	public Pager getLeaveMessagePager(Pager pager, boolean isContainUnReply) {
		if (isContainUnReply) {
			return super.findPager(pager, Restrictions.isNull("forLeaveMessage"));
		} else {
			return super.findPager(pager, Restrictions.isNull("forLeaveMessage"), Restrictions.isNotEmpty("replyLeaveMessageSet"));
		}
	}
	
}