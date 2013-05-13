package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.dao.DeliveryCorpDao;
import com.xxs.definedweek.entity.DeliveryCorp;
import com.xxs.definedweek.service.DeliveryCorpService;

import org.springframework.stereotype.Service;

/**
 * Service实现类 - 物流公司

 * KEY: DEFINEDWEEKF20B6E705344AD3757A3740CDC66E896

 */

@Service("deliveryCorpServiceImpl")
public class DeliveryCorpServiceImpl extends BaseServiceImpl<DeliveryCorp, String> implements DeliveryCorpService {

	@Resource(name = "deliveryCorpDaoImpl")
	public void setBaseDao(DeliveryCorpDao deliveryCorpDao) {
		super.setBaseDao(deliveryCorpDao);
	}

}