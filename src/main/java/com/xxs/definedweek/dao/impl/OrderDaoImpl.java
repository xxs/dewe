package com.xxs.definedweek.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.xxs.definedweek.bean.Pager;
import com.xxs.definedweek.dao.OrderDao;
import com.xxs.definedweek.entity.Member;
import com.xxs.definedweek.entity.Order;
import com.xxs.definedweek.entity.OrderItem;
import com.xxs.definedweek.entity.Order.OrderStatus;
import com.xxs.definedweek.entity.Order.PaymentStatus;
import com.xxs.definedweek.entity.Order.ShippingStatus;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 * Dao实现类 - 订单

 * KEY: DEFINEDWEEK8061830D6037E81F0D148994EFFC9C78

 */

@Repository("orderDaoImpl")
public class OrderDaoImpl extends BaseDaoImpl<Order, String> implements OrderDao {
	
	@SuppressWarnings("unchecked")
	public String getLastOrderSn() {
		String hql = "from Order as order order by order.createDate desc";
		List<Order> orderList =  getSession().createQuery(hql).setFirstResult(0).setMaxResults(1).list();
		if (orderList != null && orderList.size() > 0) {
			return orderList.get(0).getOrderSn();
		} else {
			return null;
		}
	}
	
	public Pager getOrderPager(Member member, Pager pager) {
		return super.findPager(pager, Restrictions.eq("member", member));
	}
	
	@SuppressWarnings("unchecked")
	public List<Order> getOrderList(Member member, OrderStatus orderStatus) {
		String hql = "from Order as order where order.member = :member and order.orderStatus = :orderStatus";
		return getSession().createQuery(hql).setParameter("member", member).setParameter("orderStatus", orderStatus).list();
	}
	
	public Long getUnprocessedOrderCount() {
		String hql = "select count(*) from Order as order where order.orderStatus = :orderStatus";
		return (Long) getSession().createQuery(hql).setParameter("orderStatus", OrderStatus.unprocessed).uniqueResult();
	}
	
	public Long getPaidUnshippedOrderCount() {
		String hql = "select count(*) from Order as order where order.paymentStatus = :paymentStatus and order.shippingStatus = :shippingStatus and order.orderStatus != :orderStatusCompleted and order.orderStatus != :orderStatusInvalid";
		return (Long) getSession().createQuery(hql).setParameter("paymentStatus", PaymentStatus.paid).setParameter("shippingStatus", ShippingStatus.unshipped).setParameter("orderStatusCompleted", OrderStatus.completed).setParameter("orderStatusInvalid", OrderStatus.invalid).uniqueResult();
	}

	// 保存对象时,自动更新商品ID集合
	@Override
	public String save(Order order) {
		List<String> goodsIdList = new ArrayList<String>();
		Set<OrderItem> orderItemSet = order.getOrderItemSet();
		if (orderItemSet != null) {
			for (OrderItem orderItem : orderItemSet) {
				goodsIdList.add(orderItem.getProduct().getGoods().getId());
			}
		}
		order.setGoodsIdList(goodsIdList);
		return super.save(order);
	}

	// 更新对象时,自动更新商品ID集合
	@Override
	public void update(Order order) {
		List<String> goodsIdList = new ArrayList<String>();
		Set<OrderItem> orderItemSet = order.getOrderItemSet();
		if (orderItemSet != null) {
			for (OrderItem orderItem : orderItemSet) {
				goodsIdList.add(orderItem.getProduct().getGoods().getId());
			}
		}
		order.setGoodsIdList(goodsIdList);
		super.update(order);
	}
	
}