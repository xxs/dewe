package com.xxs.definedweek.action.shop;

import javax.annotation.Resource;

import com.xxs.definedweek.service.MemberService;
import com.xxs.definedweek.service.MessageService;

import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.ParentPackage;

/**
 * 前台Action类 - 会员中心
 */

@ParentPackage("shop")
@InterceptorRefs({
	@InterceptorRef(value = "memberVerifyInterceptor"),
	@InterceptorRef(value = "shopStack")
})
public class MemberCenterAction extends BaseShopAction {

	private static final long serialVersionUID = -3568504222758246021L;
	
	@Resource(name = "memberServiceImpl")
	MemberService memberService;
	@Resource(name = "messageServiceImpl")
	MessageService messageService;
	
	// 会员中心首页
	public String index() {
		return "index";
	}

	// 获取未读消息数量
	public Long getUnreadMessageCount() {
		return messageService.getUnreadMessageCount(getLoginMember());
	}
	
}