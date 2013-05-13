package com.xxs.definedweek.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.xxs.definedweek.dao.InstantMessagingDao;
import com.xxs.definedweek.entity.InstantMessaging;
import com.xxs.definedweek.entity.InstantMessaging.InstantMessagingType;
import com.xxs.definedweek.service.InstantMessagingService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service实现类 - 在线客服

 * KEY: DEFINEDWEEKA46293E39B40E5C54C6BC841B973A701

 */

@Service("instantMessagingServiceImpl")
public class InstantMessagingServiceImpl extends BaseServiceImpl<InstantMessaging, String> implements InstantMessagingService {

	@Resource(name = "instantMessagingDaoImpl")
	InstantMessagingDao instantMessagingDao;
	
	@Resource(name = "instantMessagingDaoImpl")
	public void setBaseDao(InstantMessagingDao instantMessagingDao) {
		super.setBaseDao(instantMessagingDao);
	}
	
	@Transactional(readOnly = true)
	public List<InstantMessaging> getInstantMessagingList(InstantMessagingType instantMessagingType, Integer maxResults) {
		return instantMessagingDao.getInstantMessagingList(instantMessagingType, maxResults);
	}

}