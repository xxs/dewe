package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.dao.DeliveryItemDao;
import com.xxs.definedweek.entity.DeliveryItem;
import com.xxs.definedweek.service.DeliveryItemService;

import org.springframework.stereotype.Service;

/**
 * Service实现类 - 发货项

 * KEY: DEFINEDWEEK5CCDCA53AF8463D621530B1ADA0CE130

 */

@Service("deliveryItemServiceImpl")
public class DeliveryItemServiceImpl extends BaseServiceImpl<DeliveryItem, String> implements DeliveryItemService {

	@Resource(name = "deliveryItemDaoImpl")
	public void setBaseDao(DeliveryItemDao deliveryItemDao) {
		super.setBaseDao(deliveryItemDao);
	}

}