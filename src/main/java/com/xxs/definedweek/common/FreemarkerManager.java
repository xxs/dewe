package com.xxs.definedweek.common;

import javax.servlet.ServletContext;

import com.xxs.definedweek.directive.ArticleCategoryListDirective;
import com.xxs.definedweek.directive.ArticleCategoryTreeDirective;
import com.xxs.definedweek.directive.ArticleListDirective;
import com.xxs.definedweek.directive.CheckboxDirective;
import com.xxs.definedweek.directive.CommentListDirective;
import com.xxs.definedweek.directive.FriendLinkListDirective;
import com.xxs.definedweek.directive.GoodsCategoryListDirective;
import com.xxs.definedweek.directive.GoodsCategoryTreeDirective;
import com.xxs.definedweek.directive.GoodsListDirective;
import com.xxs.definedweek.directive.InstantMessagingListDirective;
import com.xxs.definedweek.directive.NavigationListDirective;
import com.xxs.definedweek.directive.PaginationDirective;
import com.xxs.definedweek.directive.SubstringMethod;
import com.xxs.definedweek.util.SpringUtil;
import freemarker.template.TemplateException;

public class FreemarkerManager extends org.apache.struts2.views.freemarker.FreemarkerManager {

	public synchronized freemarker.template.Configuration getConfiguration(ServletContext servletContext) throws TemplateException {
		freemarker.template.Configuration config = (freemarker.template.Configuration) servletContext.getAttribute(CONFIG_SERVLET_CONTEXT_KEY);
		if (config == null) {
			config = createConfiguration(servletContext);
			// config.setTemplateExceptionHandler(TemplateExceptionHandler.IGNORE_HANDLER);
			
			SubstringMethod substringMethod = (SubstringMethod) SpringUtil.getBean("substringMethod");
			CheckboxDirective checkboxDirective = (CheckboxDirective) SpringUtil.getBean("checkboxDirective");
			PaginationDirective paginationDirective = (PaginationDirective) SpringUtil.getBean("paginationDirective");
			CommentListDirective commentListDirective = (CommentListDirective) SpringUtil.getBean("commentListDirective");
			NavigationListDirective navigationListDirective = (NavigationListDirective) SpringUtil.getBean("navigationListDirective");
			FriendLinkListDirective friendLinkListDirective = (FriendLinkListDirective) SpringUtil.getBean("friendLinkListDirective");
			InstantMessagingListDirective instantMessagingListDirective = (InstantMessagingListDirective) SpringUtil.getBean("instantMessagingListDirective");
			ArticleCategoryListDirective articleCategoryListDirective = (ArticleCategoryListDirective) SpringUtil.getBean("articleCategoryListDirective");
			ArticleCategoryTreeDirective articleCategoryTreeDirective = (ArticleCategoryTreeDirective) SpringUtil.getBean("articleCategoryTreeDirective");
			ArticleListDirective articleListDirective = (ArticleListDirective) SpringUtil.getBean("articleListDirective");
			GoodsCategoryListDirective goodsCategoryListDirective = (GoodsCategoryListDirective) SpringUtil.getBean("goodsCategoryListDirective");
			GoodsCategoryTreeDirective goodsCategoryTreeDirective = (GoodsCategoryTreeDirective) SpringUtil.getBean("goodsCategoryTreeDirective");
			GoodsListDirective goodsListDirective = (GoodsListDirective) SpringUtil.getBean("goodsListDirective");
			
			config.setSharedVariable(SubstringMethod.TAG_NAME, substringMethod);
			config.setSharedVariable(CheckboxDirective.TAG_NAME, checkboxDirective);
			config.setSharedVariable(PaginationDirective.TAG_NAME, paginationDirective);
			config.setSharedVariable(CommentListDirective.TAG_NAME, commentListDirective);
			config.setSharedVariable(NavigationListDirective.TAG_NAME, navigationListDirective);
			config.setSharedVariable(FriendLinkListDirective.TAG_NAME, friendLinkListDirective);
			config.setSharedVariable(InstantMessagingListDirective.TAG_NAME, instantMessagingListDirective);
			config.setSharedVariable(ArticleCategoryListDirective.TAG_NAME, articleCategoryListDirective);
			config.setSharedVariable(ArticleCategoryTreeDirective.TAG_NAME, articleCategoryTreeDirective);
			config.setSharedVariable(ArticleListDirective.TAG_NAME, articleListDirective);
			config.setSharedVariable(GoodsCategoryListDirective.TAG_NAME, goodsCategoryListDirective);
			config.setSharedVariable(GoodsCategoryTreeDirective.TAG_NAME, goodsCategoryTreeDirective);
			config.setSharedVariable(GoodsListDirective.TAG_NAME, goodsListDirective);
			
			servletContext.setAttribute(CONFIG_SERVLET_CONTEXT_KEY, config);
		}
		config.setWhitespaceStripping(true);
		return config;
	}

}