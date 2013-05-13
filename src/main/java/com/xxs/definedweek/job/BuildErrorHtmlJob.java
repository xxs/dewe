package com.xxs.definedweek.job;

import com.xxs.definedweek.service.HtmlService;
import com.xxs.definedweek.util.SpringUtil;

import org.quartz.Job;
import org.quartz.JobExecutionContext;

/**
 * Service接口 - 生成错误页HTML任务

 * KEY: DEFINEDWEEK3F6674D6C2E7DF7287EF69622E4F46B5

 */

public class BuildErrorHtmlJob implements Job {
	
	public static final String JOB_NAME = "buildErrorHtmlJob";// 任务名称
	public static final String TRIGGER_NAME = "buildErrorHtmlTrigger";// Trigger名称
	public static final String GROUP_NAME = "buildErrorHtmlGroup";// Group名称

	public void execute(JobExecutionContext context) {
		HtmlService htmlService = (HtmlService) SpringUtil.getBean("quartzHtmlServiceImpl");
		htmlService.buildErrorPageHtml();
		htmlService.buildErrorPageAccessDeniedHtml();
		htmlService.buildErrorPage500Html();
		htmlService.buildErrorPage404Html();
		htmlService.buildErrorPage403Html();
	}

}