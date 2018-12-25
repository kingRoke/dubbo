package com.roke.cn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.roke.cn.bridge.ApiHoder;
import com.roke.cn.common.dto.UserDto;

@Controller
public class HelloController {
    @Autowired
    private ApiHoder apiHoder;
    
    @RequestMapping("hello")
    @ResponseBody
    public String hello(String name) {
        return apiHoder.getiDemoApiService().talk(name);
    }
    
    @RequestMapping("user")
    @ResponseBody
    public String register() {
    	UserDto dto = new UserDto();
    	dto.setName("roke");
    	dto.setPwd("123456");
    	if(apiHoder.getiUsersApiService().save(dto)) {
    		return "注册成功";
    	}
        return "注册失败";
    }
}
