package com.aliyun.nobrain.context;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.slf4j.ILoggerFactory;

public final class LoggerFactory {


	private static ThreadLocal<Map<String, Object>> threadVariableMap = new ThreadLocal<Map<String, Object>>();

	private static Map<String, Logger> loggers = new HashMap<String, Logger>();

	private LoggerFactory() {
	}

	public ILoggerFactory getILoggerFactory() {
		return org.slf4j.LoggerFactory.getILoggerFactory();
	}

	public static Logger getLogger(Class<?> clazz) {
		return getLogger(clazz.getName());
	}

	public static Logger getLogger(String name) {
			return loggers.get(name);
	}

	public synchronized static void putThreadVariable(String key, String value) {
		Map<String, Object> valueMap = threadVariableMap.get();
		if (valueMap == null) {
			valueMap = new HashMap<String, Object>();
			threadVariableMap.set(valueMap);
		}
		if (valueMap.size() <= 10000) {
			valueMap.put(key, value);
		}
	}

	public synchronized static Map<String, Object> getThreadVariableMap() {
		return threadVariableMap.get();
	}


	

}
