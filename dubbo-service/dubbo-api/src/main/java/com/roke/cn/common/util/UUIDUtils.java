package com.roke.cn.common.util;

import java.util.UUID;

public class  UUIDUtils {

	//返回digit位的随机字符
	public static String getRandomStr(Integer digit) {
		if(digit == null || digit<=0) return UUID.randomUUID().toString().replace("-","");
		return UUID.randomUUID().toString().replace("-","").substring(0, digit);
	}
}
