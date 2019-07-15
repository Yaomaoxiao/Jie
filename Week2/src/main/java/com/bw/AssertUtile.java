package com.bw;

import java.util.Collection;
import java.util.Map;

public class AssertUtile {
	
	//方法1：断言为真，如果为假，则抛出自定义异常，异常消息为第2个参数默认消息。
	public static void isTrue(boolean condition, String message){
		if(!condition){
			throw new WRuntimeException(message);
		}
	}
	
	//方法2：断言为假，如果为真，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	public static void isFalse(boolean condition, String message){
		if(condition){
			throw new WRuntimeException(message);
		}
	}
	
	//方法3：断言对象不为空，如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	public static void notNull(String obj, String message){
		if(obj == null || obj.length()==0){
			throw new WRuntimeException(message);
		}
	}
	
	
	//方法4：断言对象必须空，如果不为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	public static void isNull(String obj, String message){
		if(!(obj == null || obj.length()==0)){
			throw new WRuntimeException(message);
		}
	}
	
	//方法5：断言集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	public static void notEmpty(Collection<?> coll, String message){
		if(coll == null || coll.size()==0){
			throw new WRuntimeException(message);
		}
	}
	
	
	//方法6：断言Map集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	public static void notEmptyMap(Map<?,?> map, String message){
           if(map == null || map.size()==0){
        	   throw new WRuntimeException(message);
           }		
	}
	
	//方法7：断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0，如果没值，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	public static void hasText(String condition, String message){
		if(condition.trim().length()==0){
			 throw new WRuntimeException(message);
		}
	}
	
	//方法8：断言值必须大于0，如果小于或等于0，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	public static void greaterThanZero(int num, String message){
		 if(num<=0){
			 throw new WRuntimeException(message);
		 }
	}
	
}