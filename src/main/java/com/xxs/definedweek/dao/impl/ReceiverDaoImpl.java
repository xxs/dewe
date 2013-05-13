package com.xxs.definedweek.dao.impl;

import java.util.List;

import com.xxs.definedweek.dao.ReceiverDao;
import com.xxs.definedweek.entity.Receiver;

import org.springframework.stereotype.Repository;

/**
 * Dao实现类 - 收货地址

 * KEY: DEFINEDWEEKFDB0C29D95AE89A58BB8DA83E757D119

 */

@Repository("receiverDaoImpl")
public class ReceiverDaoImpl extends BaseDaoImpl<Receiver, String> implements ReceiverDao {

	// 保存时若对象isDefault=true,则设置其它对象isDefault值为false
	@Override
	@SuppressWarnings("unchecked")
	public String save(Receiver receiver) {
		if (receiver.getIsDefault()) {
			String hql = "from Receiver as receiver where receiver.member = :member and receiver.isDefault = :isDefault";
			List<Receiver> receiverList = getSession().createQuery(hql).setParameter("member", receiver.getMember()).setParameter("isDefault", true).list();
			if (receiverList != null) {
				for (Receiver r : receiverList) {
					r.setIsDefault(false);
				}
			}
		}
		return super.save(receiver);
	}

	// 更新时若对象isDefault=true,则设置其它对象isDefault值为false
	@Override
	@SuppressWarnings("unchecked")
	public void update(Receiver receiver) {
		if (receiver.getIsDefault()) {
			String hql = "from Receiver as receiver where receiver.member = :member and receiver.isDefault = :isDefault and receiver != :receiver";
			List<Receiver> receiverList = getSession().createQuery(hql).setParameter("member", receiver.getMember()).setParameter("isDefault", true).setParameter("receiver", receiver).list();
			if (receiverList != null) {
				for (Receiver r : receiverList) {
					r.setIsDefault(false);
				}
			}
		}
		super.update(receiver);
	}

}