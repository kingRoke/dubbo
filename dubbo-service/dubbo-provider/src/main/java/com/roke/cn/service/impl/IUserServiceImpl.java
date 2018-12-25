package com.roke.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.roke.cn.entity.User;
import com.roke.cn.repository.mybatis.IUserMybatisDao;
import com.roke.cn.service.IUserService;

@Component
public class IUserServiceImpl implements IUserService {

	@Autowired
	private IUserMybatisDao userDao;
	
	public boolean save(User user) {
		// TODO Auto-generated method stub
		if(user != null) {
			user.generateId();
			return userDao.insert(user)==1;
		}
		return false;	
	}

}
