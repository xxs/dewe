package com.xxs.definedweek.dao;

import java.util.List;

import com.xxs.definedweek.bean.Pager;
import com.xxs.definedweek.entity.Member;
import com.xxs.definedweek.entity.Order;
import com.xxs.definedweek.entity.Order.OrderStatus;

/**
 * Dao接口 - 订单

 * KEY: DEFINEDWEEK9B6182BB453DB3970191ECBF6F4D8AD0

 */

public interface OrderDao extends BaseDao<Order, String> {
	
	/**
	 * 获取最后生成的订单编号
	 * 
	 * @return 订单编号
	 */
	public String getLastOrderSn();
	
	/**
	 * 根据Member、Pager获取订单分页对象
	 * 
	 * @param member
	 *            会员
	 *            
	 * @param pager
	 *            Pager对象
	 *            
	 * @return 订单分页对象
	 */
	public Pager getOrderPager(Member member, Pager pager);
	
	/**
	 * 根据会员、订单状态获取订单
	 * 
	 * @param member
	 *            会员
	 *            
	 * @param orderStatus
	 *            订单状态
	 *            
	 * @return 已完成的订单
	 */
	public List<Order> getOrderList(Member member, OrderStatus orderStatus);
	
	/**
	 * 获取未处理订单数
	 *            
	 * @return 未处理订单数
	 */
	public Long getUnprocessedOrderCount();
	
	/**
	 * 获取已支付未发货订单数（不包含已完成或已作废订单）
	 *            
	 * @return 已支付未发货订单数
	 */
	public Long getPaidUnshippedOrderCount();

}