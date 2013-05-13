package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.bean.Pager;
import com.xxs.definedweek.dao.GoodsNotifyDao;
import com.xxs.definedweek.entity.GoodsNotify;
import com.xxs.definedweek.entity.Member;
import com.xxs.definedweek.service.GoodsNotifyService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service实现类 - 到货通知

 * KEY: DEFINEDWEEK9A3ACBDD2D3A5E96E54D057769342EAF

 */

@Service("goodsNotifyServiceImpl")
public class GoodsNotifyServiceImpl extends BaseServiceImpl<GoodsNotify, String> implements GoodsNotifyService {

	@Resource(name = "goodsNotifyDaoImpl")
	private GoodsNotifyDao goodsNotifyDao;

	@Resource(name = "goodsNotifyDaoImpl")
	public void setBaseDao(GoodsNotifyDao goodsNotifyDao) {
		super.setBaseDao(goodsNotifyDao);
	}
	
	@Transactional(readOnly = true)
	public Pager findPager(Member member, Pager pager) {
		return goodsNotifyDao.findPager(member, pager);
	}
	
	@Transactional(readOnly = true)
	public Long getUnprocessedGoodsNotifyCount() {
		return goodsNotifyDao.getUnprocessedGoodsNotifyCount();
	}

}