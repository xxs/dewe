package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.dao.OrderItemDao;
import com.xxs.definedweek.entity.OrderItem;
import com.xxs.definedweek.service.OrderItemService;

import org.springframework.stereotype.Service;

/**
 * Service实现类 - 订单项

 * KEY: DEFINEDWEEK3CCC6CA8E9A226C1626A7887BB102AC6

 */

@Service("orderItemServiceImpl")
public class OrderItemServiceImpl extends BaseServiceImpl<OrderItem, String> implements OrderItemService {

	@Resource(name = "orderItemDaoImpl")
	public void setBaseDao(OrderItemDao orderItemDao) {
		super.setBaseDao(orderItemDao);
	}

}