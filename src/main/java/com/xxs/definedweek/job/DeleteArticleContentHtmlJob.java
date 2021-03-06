package com.xxs.definedweek.job;

import java.util.Map;

import com.xxs.definedweek.service.HtmlService;
import com.xxs.definedweek.util.SpringUtil;

import org.quartz.Job;
import org.quartz.JobExecutionContext;

/**
 * Service接口 - 删除文章内容HTML任务

 * KEY: DEFINEDWEEK3F6674D6C2E7DF7287EF69622E4F46B5

 */

public class DeleteArticleContentHtmlJob implements Job {
	
	public static final String JOB_NAME = "deleteArticleContentHtmlJob";// 任务名称
	public static final String TRIGGER_NAME = "deleteArticleContentHtmlTrigger";// Trigger名称
	public static final String GROUP_NAME = "deleteArticleContentHtmlGroup";// Group名称

	public void execute(JobExecutionContext context) {
		HtmlService htmlService = (HtmlService) SpringUtil.getBean("quartzHtmlServiceImpl");
		Map<?, ?> jobDataMap = context.getJobDetail().getJobDataMap();
		String htmlPath = (String) jobDataMap.get("htmlPath");
		Integer pageCount = Integer.valueOf((String)jobDataMap.get("pageCount"));
		htmlService.deleteArticleContentHtml(htmlPath, pageCount);
	}

}