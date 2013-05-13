package com.xxs.definedweek.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.xxs.definedweek.dao.MemberDao;
import com.xxs.definedweek.dao.OrderDao;
import com.xxs.definedweek.entity.Goods;
import com.xxs.definedweek.entity.Member;
import com.xxs.definedweek.entity.Order;
import com.xxs.definedweek.entity.Order.OrderStatus;
import com.xxs.definedweek.service.MemberService;
import com.xxs.definedweek.util.CommonUtil;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service实现类 - 会员

 * KEY: DEFINEDWEEK9A3ACBDD2D3A5E96E54D057769342EAF

 */

@Service("memberServiceImpl")
public class MemberServiceImpl extends BaseServiceImpl<Member, String> implements MemberService {

	@Resource(name = "memberDaoImpl")
	private MemberDao memberDao;
	@Resource(name = "orderDaoImpl")
	private OrderDao orderDao;

	@Resource(name = "memberDaoImpl")
	public void setBaseDao(MemberDao memberDao) {
		super.setBaseDao(memberDao);
	}
	
	@Transactional(readOnly = true)
	public boolean isExistByUsername(String username) {
		return memberDao.isExistByUsername(username);
	}
	
	@Transactional(readOnly = true)
	public Member getMemberByUsername(String username) {
		return memberDao.getMemberByUsername(username);
	}
	
	public boolean verifyMember(String username, String password) {
		Member member = getMemberByUsername(username);
		if (member != null && member.getPassword().equals(DigestUtils.md5Hex(password))) {
			return true;
		} else {
			return false;
		}
	}
	
	public String buildPasswordRecoverKey() {
		return System.currentTimeMillis() + Member.PASSWORD_RECOVER_KEY_SEPARATOR + CommonUtil.getUUID() + DigestUtils.md5Hex(String.valueOf(Math.random() * 1000000000));
	}
	
	public Date getPasswordRecoverKeyBuildDate(String passwordRecoverKey) {
		long time = Long.valueOf(StringUtils.substringBefore(passwordRecoverKey, Member.PASSWORD_RECOVER_KEY_SEPARATOR));
		return new Date(time);
	}
	
	@Transactional(readOnly = true)
	public boolean isPurchased(Member member, Goods goods) {
		List<Order> orderList = orderDao.getOrderList(member, OrderStatus.completed);
		for (Order order : orderList) {
			List<String> goodsIdList = order.getGoodsIdList();
			if (goodsIdList != null) {
				for (String goodsId : goodsIdList) {
					if (StringUtils.equals(goods.getId(), goodsId)) {
						return true;
					}
				}
			}
			
		}
		return false;
	}

}