package com.xxs.definedweek.job;

import com.xxs.definedweek.service.HtmlService;
import com.xxs.definedweek.util.SpringUtil;

import org.quartz.Job;
import org.quartz.JobExecutionContext;

/**
 * Service接口 - 生成ADMIN.JS任务

 * KEY: DEFINEDWEEK3F6674D6C2E7DF7287EF69622E4F46B5

 */

public class BuildAdminJsJob implements Job {
	
	public static final String JOB_NAME = "buildAdminJsJob";// 任务名称
	public static final String TRIGGER_NAME = "buildAdminJsTrigger";// Trigger名称
	public static final String GROUP_NAME = "buildAdminJsGroup";// Group名称

	public void execute(JobExecutionContext context) {
		HtmlService htmlService = (HtmlService) SpringUtil.getBean("quartzHtmlServiceImpl");
		htmlService.buildAdminJs();
	}

}