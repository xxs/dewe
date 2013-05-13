package com.xxs.definedweek.service.impl;

import javax.annotation.Resource;

import com.xxs.definedweek.dao.LogDao;
import com.xxs.definedweek.entity.Log;
import com.xxs.definedweek.service.LogService;

import org.springframework.stereotype.Service;

/**
 * Service实现类 - 日志

 * KEY: DEFINEDWEEK1F694A92A7CFA4B05E87616ADCA7D169

 */

@Service("logServiceImpl")
public class LogServiceImpl extends BaseServiceImpl<Log, String> implements LogService {

	@Resource(name = "logDaoImpl")
	public void setBaseDao(LogDao logDao) {
		super.setBaseDao(logDao);
	}

}