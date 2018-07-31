package com.design.patterns.singleton;

import java.util.HashMap;
import java.util.Map;

public enum ApplicationData {
	
	INSTANCE;
	
	public Map<String,Object> appData = new HashMap<String, Object>();
	
	public Object getData(String key) {
		return appData.get(key);
	}
	
	public void addData(String key, String value) {
		appData.put(key, value);
	}
	
}
