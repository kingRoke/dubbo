package com.roke.cn.repository.mybatis;



import org.apache.ibatis.annotations.Mapper;

import com.roke.cn.entity.User;
@Mapper
public interface IUserMybatisDao {
	
	int insert(User user);
  
}
