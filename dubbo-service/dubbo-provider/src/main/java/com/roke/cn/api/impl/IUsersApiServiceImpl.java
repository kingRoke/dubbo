package com.roke.cn.api.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.roke.cn.api.IUsersApiSAervice;
import com.roke.cn.common.dto.UserDto;
import com.roke.cn.common.util.BeanMapUtils;
import com.roke.cn.entity.User;
import com.roke.cn.service.IUserService;
@Service(version = "1.0.1", timeout = 90000, retries = 0)
public class IUsersApiServiceImpl implements IUsersApiSAervice {

	@Autowired
	private IUserService userService;
	
	public boolean save(UserDto dto) {
		// TODO Auto-generated method stub
		if(dto == null) return false;
		User user = BeanMapUtils.convertPojo(dto, User.class);
		return userService.save(user);
	}

	

}
