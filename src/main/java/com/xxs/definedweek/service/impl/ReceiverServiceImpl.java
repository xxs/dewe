package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.dao.ReceiverDao;
import com.xxs.definedweek.entity.Receiver;
import com.xxs.definedweek.service.ReceiverService;

import org.springframework.stereotype.Service;

/**
 * Service实现类 - 收货地址

 * KEY: DEFINEDWEEK0FBC86A60DF8465A166FAB21F537E740

 */

@Service("receiverServiceImpl")
public class ReceiverServiceImpl extends BaseServiceImpl<Receiver, String> implements ReceiverService {

	@Resource(name = "receiverDaoImpl")
	public void setBaseDao(ReceiverDao receiverDao) {
		super.setBaseDao(receiverDao);
	}

}