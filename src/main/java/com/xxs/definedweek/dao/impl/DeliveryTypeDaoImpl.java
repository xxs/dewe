package com.xxs.definedweek.dao.impl;

import java.util.Set;

import com.xxs.definedweek.dao.DeliveryTypeDao;
import com.xxs.definedweek.entity.DeliveryType;
import com.xxs.definedweek.entity.Order;
import com.xxs.definedweek.entity.Reship;
import com.xxs.definedweek.entity.Shipping;

import org.springframework.stereotype.Repository;

/**
 * Dao实现类 - 配送方式

 * KEY: DEFINEDWEEK8FA9BB4F72C2C9F3D643830EB2B318C3

 */

@Repository("deliveryTypeDaoImpl")
public class DeliveryTypeDaoImpl extends BaseDaoImpl<DeliveryType, String> implements DeliveryTypeDao {

	public DeliveryType getDefaultDeliveryType() {
		String hql = "from DeliveryType as deliveryType where deliveryType.isDefault = :isDefault";
		return (DeliveryType) getSession().createQuery(hql).setParameter("isDefault", true).setMaxResults(1).uniqueResult();
	}
	
	// 关联处理
	@Override
	public void delete(DeliveryType deliveryType) {
		Set<Order> orderSet = deliveryType.getOrderSet();
		if (orderSet != null) {
			for (Order order : orderSet) {
				order.setDeliveryType(null);
			}
		}
		
		Set<Shipping> shippingSet = deliveryType.getShippingSet();
		if (shippingSet != null) {
			for (Shipping shipping : shippingSet) {
				shipping.setDeliveryType(null);
			}
		}
		
		Set<Reship> reshipSet = deliveryType.getReshipSet();
		if (reshipSet != null) {
			for (Reship reship : reshipSet) {
				reship.setDeliveryType(null);
			}
		}
		
		super.delete(deliveryType);
	}

	// 关联处理
	@Override
	public void delete(String id) {
		DeliveryType deliveryType = super.load(id);
		this.delete(deliveryType);
	}

	// 关联处理
	@Override
	public void delete(String[] ids) {
		for (String id : ids) {
			DeliveryType deliveryType = super.load(id);
			this.delete(deliveryType);
		}
	}

}