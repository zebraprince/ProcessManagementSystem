package com.chinasofti.service.workflow;

import com.chinasofti.service.IDispenseService;

public class DispenseService implements IDispenseService {

	public String ddispense(String userName) {
		String path = null;
		if ("user".equals(userName)) {
			path = "path1";
		} else if ("user1".equals(userName)) {
			path = "path2";
		}
		return path;
	}
	
}
