package com.xxs.definedweek.action.shop;

import java.util.List;

import javax.annotation.Resource;

import com.xxs.definedweek.entity.PaymentConfig;
import com.xxs.definedweek.service.DepositService;
import com.xxs.definedweek.service.PaymentConfigService;

import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.ParentPackage;

/**
 * 前台Action类 - 预存款
 */

@ParentPackage("shop")
@InterceptorRefs({
	@InterceptorRef(value = "memberVerifyInterceptor"),
	@InterceptorRef(value = "shopStack")
})
public class DepositAction extends BaseShopAction {

	private static final long serialVersionUID = -3091246496095700007L;
	
	@Resource(name = "depositServiceImpl")
	private DepositService depositService;
	@Resource(name = "paymentConfigServiceImpl")
	private PaymentConfigService paymentConfigService;
	
	// 预存款列表
	public String list() {
		pager = depositService.getDepositPager(getLoginMember(), pager);
		return LIST;
	}
	
	// 预存款充值
	public String recharge() {
		return "recharge";
	}
	
	// 获取支付配置（不包含预存款、线下支付方式）
	public List<PaymentConfig> getNonDepositOfflinePaymentConfigList() {
		return paymentConfigService.getNonDepositOfflinePaymentConfigList();
	}

}