package com.imti.util;

import java.util.UUID;

/**@文件名: UUIDUtils.java
 * @类功能说明: 
 * @作者: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @日期: 2019年3月13日下午2:41:53
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: GuoHaiFeng</li> 
 * 	 <li>日期: 2019年3月13日下午2:41:53</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class UUIDUtils {
	
	public static String getUUID(){
		String uuid = UUID.randomUUID().toString().replace("-", "");
		return uuid;
	}


}
