package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.dao.OrderLogDao;
import com.xxs.definedweek.entity.OrderLog;
import com.xxs.definedweek.service.OrderLogService;

import org.springframework.stereotype.Service;

/**
 * Service实现类 - 订单日志

 * KEY: DEFINEDWEEK99551A0E5292A6C03298AFBE162F1450

 */

@Service("orderLogServiceImpl")
public class OrderLogServiceImpl extends BaseServiceImpl<OrderLog, String> implements OrderLogService {

	@Resource(name = "orderLogDaoImpl")
	public void setBaseDao(OrderLogDao orderLogDao) {
		super.setBaseDao(orderLogDao);
	}

}