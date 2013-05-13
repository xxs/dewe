package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.bean.Pager;
import com.xxs.definedweek.dao.OrderDao;
import com.xxs.definedweek.entity.Member;
import com.xxs.definedweek.entity.Order;
import com.xxs.definedweek.service.OrderService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service实现类 - 订单

 * KEY: DEFINEDWEEKDD7076EB801A97081A271D1D0D7AF8F7

 */

@Service("orderServiceImpl")
public class OrderServiceImpl extends BaseServiceImpl<Order, String> implements OrderService {
	
	@Resource(name = "orderDaoImpl")
	private OrderDao orderDao;

	@Resource(name = "orderDaoImpl")
	public void setBaseDao(OrderDao orderDao) {
		super.setBaseDao(orderDao);
	}
	
	@Transactional(readOnly = true)
	public String getLastOrderSn() {
		return orderDao.getLastOrderSn();
	}
	
	@Transactional(readOnly = true)
	public Pager getOrderPager(Member member, Pager pager) {
		return orderDao.getOrderPager(member, pager);
	}
	
	@Transactional(readOnly = true)
	public Long getUnprocessedOrderCount() {
		return orderDao.getUnprocessedOrderCount();
	}
	
	@Transactional(readOnly = true)
	public Long getPaidUnshippedOrderCount() {
		return orderDao.getPaidUnshippedOrderCount();
	}

}