package com.xxs.definedweek.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.xxs.definedweek.util.CaptchaUtil;
import com.xxs.definedweek.util.SettingUtil;

/**
 * 过滤器 - 后台登录验证码

 * KEY: DEFINEDWEEKB0535C36C9459255C291F7E3D0779783

 */

@Component("adminLoginCaptchaFilter")
public class AdminLoginCaptchaFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {}

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		if (CaptchaUtil.validateCaptchaByRequest(request)) {
			filterChain.doFilter(request, response);
		} else {
			String adminLoginUrl = SettingUtil.getSetting().getAdminLoginUrl();
			response.sendRedirect(request.getContextPath() + adminLoginUrl + "?error=captcha");
		}
	}
	
	public void destroy() {}

}