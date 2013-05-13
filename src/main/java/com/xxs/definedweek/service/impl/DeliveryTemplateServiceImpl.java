package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.dao.DeliveryTemplateDao;
import com.xxs.definedweek.entity.DeliveryTemplate;
import com.xxs.definedweek.service.DeliveryTemplateService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service实现类 - 快递单模板

 * KEY: DEFINEDWEEKEEB47174264A6259B9A1BA5D141B72C0

 */

@Service("deliveryTemplateServiceImpl")
public class DeliveryTemplateServiceImpl extends BaseServiceImpl<DeliveryTemplate, String> implements DeliveryTemplateService {
	
	@Resource(name = "deliveryTemplateDaoImpl")
	private DeliveryTemplateDao deliveryTemplateDao;
	
	@Resource(name = "deliveryTemplateDaoImpl")
	public void setBaseDao(DeliveryTemplateDao deliveryTemplateDao) {
		super.setBaseDao(deliveryTemplateDao);
	}
	
	@Transactional(readOnly = true)
	public DeliveryTemplate getDefaultDeliveryTemplate() {
		return deliveryTemplateDao.getDefaultDeliveryTemplate();
	}

}