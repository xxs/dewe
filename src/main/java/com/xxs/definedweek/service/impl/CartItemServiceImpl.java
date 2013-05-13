package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.dao.CartItemDao;
import com.xxs.definedweek.entity.CartItem;
import com.xxs.definedweek.service.CartItemService;

import org.springframework.stereotype.Service;

/**
 * Service实现类 - 购物车项

 * KEY: DEFINEDWEEKB29936B2E4DBE58A5D88D80B8580D7A5

 */

@Service("cartItemServiceImpl")
public class CartItemServiceImpl extends BaseServiceImpl<CartItem, String> implements CartItemService {

	@Resource(name = "cartItemDaoImpl")
	public void setBaseDao(CartItemDao cartItemDao) {
		super.setBaseDao(cartItemDao);
	}

}