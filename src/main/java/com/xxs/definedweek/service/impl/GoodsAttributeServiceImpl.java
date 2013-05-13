package com.xxs.definedweek.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.xxs.definedweek.bean.Pager;
import com.xxs.definedweek.dao.GoodsAttributeDao;
import com.xxs.definedweek.entity.GoodsAttribute;
import com.xxs.definedweek.entity.GoodsType;
import com.xxs.definedweek.service.GoodsAttributeService;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springmodules.cache.annotations.CacheFlush;
import org.springmodules.cache.annotations.Cacheable;

/**
 * Service实现类 - 商品属性

 * KEY: DEFINEDWEEK1DBC8F3D75E6812599E1C363C0BB757D

 */

@Service("goodsAttributeServiceImpl")
public class GoodsAttributeServiceImpl extends BaseServiceImpl<GoodsAttribute, String> implements GoodsAttributeService {

	@Resource(name = "goodsAttributeDaoImpl")
	private GoodsAttributeDao goodsAttributeDao;
	
	@Resource(name = "goodsAttributeDaoImpl")
	public void setBaseDao(GoodsAttributeDao goodsAttributeDao) {
		super.setBaseDao(goodsAttributeDao);
	}
	
	@Transactional(readOnly = true)
	public Integer getUnusedPropertyIndex(GoodsType goodsType) {
		return goodsAttributeDao.getUnusedPropertyIndex(goodsType);
	}
	
	@Cacheable(modelId = "goodsAttributeCaching")
	@Transactional(readOnly = true)
	public List<GoodsAttribute> getGoodsAttributeList(GoodsType goodsType) {
		List<GoodsAttribute> goodsAttributeList = goodsAttributeDao.getGoodsAttributeList(goodsType);
		if (goodsAttributeList != null) {
			for (GoodsAttribute goodsAttribute : goodsAttributeList) {
				Hibernate.initialize(goodsAttribute);
			}
		}
		return goodsAttributeList;
	}
	
	@Transactional(readOnly = true)
	public Pager getGoodsAttributePager(GoodsType goodsType, Pager pager) {
		return goodsAttributeDao.getGoodsAttributePager(goodsType, pager);
	}

	@Override
	@CacheFlush(modelId = "goodsAttributeFlushing")
	public void delete(GoodsAttribute goodsAttribute) {
		goodsAttributeDao.delete(goodsAttribute);
	}

	@Override
	@CacheFlush(modelId = "goodsAttributeFlushing")
	public void delete(String id) {
		goodsAttributeDao.delete(id);
	}

	@Override
	@CacheFlush(modelId = "goodsAttributeFlushing")
	public void delete(String[] ids) {
		goodsAttributeDao.delete(ids);
	}

	@Override
	@CacheFlush(modelId = "goodsAttributeFlushing")
	public String save(GoodsAttribute goodsAttribute) {
		return goodsAttributeDao.save(goodsAttribute);
	}

	@Override
	@CacheFlush(modelId = "goodsAttributeFlushing")
	public void update(GoodsAttribute goodsAttribute) {
		goodsAttributeDao.update(goodsAttribute);
	}

}