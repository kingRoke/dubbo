package com.roke.cn.bridge;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.roke.cn.api.IUsersApiSAervice;
import com.roke.cn.api.IDemoApiService;


@Component
public class ApiHoder {
	private static final String VER = "1.0.1";

    /**
     * 测试
     */
    @Reference(version = VER)
    private IDemoApiService iDemoApiService;
    
   
    
    /**
     * 用户服务
     */
    @Reference(version = VER)
    private IUsersApiSAervice iUsersApiService;

	public IDemoApiService getiDemoApiService() {
		return iDemoApiService;
	}

	

	public IUsersApiSAervice getiUsersApiService() {
		return iUsersApiService;
	}
	
	
}
