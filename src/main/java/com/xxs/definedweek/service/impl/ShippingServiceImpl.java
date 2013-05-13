package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.dao.ShippingDao;
import com.xxs.definedweek.entity.Shipping;
import com.xxs.definedweek.service.ShippingService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service实现类 - 发货

 * KEY: DEFINEDWEEKEACE05E3DC84AC6892E51AD68CBADA74

 */

@Service("shippingServiceImpl")
public class ShippingServiceImpl extends BaseServiceImpl<Shipping, String> implements ShippingService {
	
	@Resource(name = "shippingDaoImpl")
	private ShippingDao shippingDao;

	@Resource(name = "shippingDaoImpl")
	public void setBaseDao(ShippingDao shippingDao) {
		super.setBaseDao(shippingDao);
	}
	
	@Transactional(readOnly = true)
	public String getLastShippingSn() {
		return shippingDao.getLastShippingSn();
	}

}