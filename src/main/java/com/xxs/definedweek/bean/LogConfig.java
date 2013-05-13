package com.xxs.definedweek.bean;


/**
 * Bean类 - 日志配置

 * KEY: DEFINEDWEEK338298D5B309F4DB47533314D6524A77

 */

public class LogConfig {
	
	private String operation;// 操作名称
	private String actionClass;// Action类名称
	private String actionMethod;// Action方法名称
	
	public String getActionClass() {
		return actionClass;
	}
	
	public void setActionClass(String actionClass) {
		this.actionClass = actionClass;
	}
	
	public String getActionMethod() {
		return actionMethod;
	}
	
	public void setActionMethod(String actionMethod) {
		this.actionMethod = actionMethod;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

}