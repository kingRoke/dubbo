package com.roke.cn.entity;

import java.io.Serializable;

import com.roke.cn.common.util.UUIDUtils;

public class IdEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void generateId() {
		setId(UUIDUtils.getRandomStr(null));
	}
}
