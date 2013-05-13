package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.dao.GoodsTypeDao;
import com.xxs.definedweek.entity.GoodsType;
import com.xxs.definedweek.service.GoodsTypeService;

import org.springframework.stereotype.Service;

/**
 * Service实现类 - 商品类型

 * KEY: DEFINEDWEEK11AE7AEEC7428ABAA892EED06C4E877F

 */

@Service("goodsTypeServiceImpl")
public class GoodsTypeServiceImpl extends BaseServiceImpl<GoodsType, String> implements GoodsTypeService {

	@Resource(name = "goodsTypeDaoImpl")
	public void setBaseDao(GoodsTypeDao goodsTypeDao) {
		super.setBaseDao(goodsTypeDao);
	}

}