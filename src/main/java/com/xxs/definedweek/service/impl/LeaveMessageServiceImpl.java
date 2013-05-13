package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.bean.Pager;
import com.xxs.definedweek.dao.LeaveMessageDao;
import com.xxs.definedweek.entity.LeaveMessage;
import com.xxs.definedweek.service.LeaveMessageService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service实现类 - 在线留言

 * KEY: DEFINEDWEEK65B94A1C020124AC5E38C179CA8D1CD0

 */

@Service("leaveMessageServiceImpl")
public class LeaveMessageServiceImpl extends BaseServiceImpl<LeaveMessage, String> implements LeaveMessageService {
	
	@Resource(name = "leaveMessageDaoImpl")
	private LeaveMessageDao leaveMessageDao;
	
	@Resource(name = "leaveMessageDaoImpl")
	public void setBaseDao(LeaveMessageDao leaveMessageDao) {
		super.setBaseDao(leaveMessageDao);
	}
	
	@Transactional(readOnly = true)
	public Pager getLeaveMessagePager(Pager pager, boolean isContainUnReply) {
		return leaveMessageDao.getLeaveMessagePager(pager, isContainUnReply);
	}

}