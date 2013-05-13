package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.bean.SpecificationValue;
import com.xxs.definedweek.dao.SpecificationDao;
import com.xxs.definedweek.entity.Specification;
import com.xxs.definedweek.service.SpecificationService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service实现类 - 商品规格

 * KEY: DEFINEDWEEK2B3A4FEF05A42E033E79040EB368B28E

 */

@Service("specificationServiceImpl")
public class SpecificationServiceImpl extends BaseServiceImpl<Specification, String> implements SpecificationService {
	
	@Resource(name = "specificationDaoImpl")
	private SpecificationDao specificationDao;

	@Resource(name = "specificationDaoImpl")
	public void setBaseDao(SpecificationDao specificationDao) {
		super.setBaseDao(specificationDao);
	}
	
	@Transactional(readOnly = true)
	public SpecificationValue getSpecificationValue(String specificationId, String specificationValueId) {
		Specification specification = specificationDao.get(specificationId);
		for (SpecificationValue specificationValue : specification.getSpecificationValueList()) {
			if (specificationValue.getId().equals(specificationValueId)) {
				return specificationValue;
			}
		}
		return null;
	}

}