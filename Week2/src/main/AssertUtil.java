package main;

import java.util.Collection;
import java.util.Map;

public class AssertUtil {

	public static  void istrue(boolean exp,String message){
		if(!exp){
			throw new ERuntimeException(message);
		}
	}
	
	public static  void isfalse(boolean exp,String message){
		if(exp){
			throw new ERuntimeException(message);
		}
	}
	
	public static  void isNotNull(String exp,String message){
		if(exp == null || exp.length()==0){
			throw new ERuntimeException(message);
		}
	}
	public static  void isNull(String exp,String message){
		if(exp.length()>0){
			throw new ERuntimeException(message);
		}
	}
	
	public static  void iscollectionNotNull(Collection<?> col,String message){
		if(col == null ||col.size()==0){
			throw new ERuntimeException(message);
		}
	}
	
	
	public static void ismapNotNull(Map<?,?> map,String message){
		if(map.size()==0){
			throw new ERuntimeException(message);
		}
	}
	public static void isLength(String exp,String message){
		if(exp.trim().length()==0){
			throw new ERuntimeException(message);
		}
	}
	public static void isMath(int exp,String message){
		if(exp <= 0){
			throw new ERuntimeException(message);
		}
	}
	
	public static void luan(int exp,String message){
		if(exp <= 0){
			System.out.println();
			System.out.println();
			throw new ERuntimeException(message);
		}
	}
	
	
	
	
}
