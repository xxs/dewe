package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.bean.Pager;
import com.xxs.definedweek.dao.MessageDao;
import com.xxs.definedweek.entity.Member;
import com.xxs.definedweek.entity.Message;
import com.xxs.definedweek.service.MessageService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service实现类 - 消息

 * KEY: DEFINEDWEEK65B94A1C020124AC5E38C179CA8D1CD0

 */

@Service("messageServiceImpl")
public class MessageServiceImpl extends BaseServiceImpl<Message, String> implements MessageService {
	
	@Resource(name = "messageDaoImpl")
	private MessageDao messageDao;
	
	@Resource(name = "messageDaoImpl")
	public void setBaseDao(MessageDao messageDao) {
		super.setBaseDao(messageDao);
	}
	
	@Transactional(readOnly = true)
	public Pager getMemberInboxPager(Member member, Pager pager) {
		return messageDao.getMemberInboxPager(member, pager);
	}
	
	@Transactional(readOnly = true)
	public Pager getMemberOutboxPager(Member member, Pager pager) {
		return messageDao.getMemberOutboxPager(member, pager);
	}
	
	@Transactional(readOnly = true)
	public Pager getMemberDraftboxPager(Member member, Pager pager) {
		return messageDao.getMemberDraftboxPager(member, pager);
	}
	
	@Transactional(readOnly = true)
	public Pager getAdminInboxPager(Pager pager) {
		return messageDao.getAdminInboxPager(pager);
	}
	
	@Transactional(readOnly = true)
	public Pager getAdminOutboxPager(Pager pager) {
		return messageDao.getAdminOutboxPager(pager);
	}
	
	@Transactional(readOnly = true)
	public Long getUnreadMessageCount(Member member) {
		return messageDao.getUnreadMessageCount(member);
	}
	
	@Transactional(readOnly = true)
	public Long getUnreadMessageCount() {
		return messageDao.getUnreadMessageCount();
	}

}