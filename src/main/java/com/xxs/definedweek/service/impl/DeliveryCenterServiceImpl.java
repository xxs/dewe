package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.dao.DeliveryCenterDao;
import com.xxs.definedweek.entity.DeliveryCenter;
import com.xxs.definedweek.service.DeliveryCenterService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service实现类 - 发货点

 * KEY: DEFINEDWEEKEEB47174264A6259B9A1BA5D141B72C0

 */

@Service("deliveryCenterServiceImpl")
public class DeliveryCenterServiceImpl extends BaseServiceImpl<DeliveryCenter, String> implements DeliveryCenterService {
	
	@Resource(name = "deliveryCenterDaoImpl")
	private DeliveryCenterDao deliveryCenterDao;
	
	@Resource(name = "deliveryCenterDaoImpl")
	public void setBaseDao(DeliveryCenterDao deliveryCenterDao) {
		super.setBaseDao(deliveryCenterDao);
	}
	
	@Transactional(readOnly = true)
	public DeliveryCenter getDefaultDeliveryCenter() {
		return deliveryCenterDao.getDefaultDeliveryCenter();
	}

}