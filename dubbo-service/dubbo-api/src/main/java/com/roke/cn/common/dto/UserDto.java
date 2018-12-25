package com.roke.cn.common.dto;

import java.io.Serializable;
import java.util.Date;

public class UserDto implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = -4500986235104581906L;
	
	private String id;//唯一标示
	private String name;//名称
    private String pwd;//密码  
    private Date createTime;// 注册时间
    private Date updateTime;// 更新时间
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	   
}
