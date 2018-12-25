package com.roke.cn.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.roke.cn.api.IDemoApiService;
@Service(version = "1.0.1", timeout = 90000, retries = 0)
public class IDemoApiServiceImpl implements IDemoApiService {

	public String talk(String name) {
		// TODO Auto-generated method stub
		return "hello"+name;
	}

}
