package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.dao.BrandDao;
import com.xxs.definedweek.entity.Brand;
import com.xxs.definedweek.service.BrandService;

import org.springframework.stereotype.Service;

/**
 * Service实现类 - 品牌

 * KEY: DEFINEDWEEKA46293E39B40E5C54C6BC841B973A701

 */

@Service("brandServiceImpl")
public class BrandServiceImpl extends BaseServiceImpl<Brand, String> implements BrandService {

	@Resource(name = "brandDaoImpl")
	public void setBaseDao(BrandDao brandDao) {
		super.setBaseDao(brandDao);
	}

}