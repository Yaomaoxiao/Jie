package com.bw;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

public class WTest {

	
	@Test
	public void FunisTrue(){
		try {
			AssertUtile.isTrue(false, "断言为真");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void FunisFalse(){
		try {
			AssertUtile.isFalse(true, "断言为假");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void FunnotNull(){
		try {
			AssertUtile.notNull("", "断言对象不能为空");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void FunisNull(){
		try {
			AssertUtile.isNull("", "断言对象必须为空");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void FunnotEmpty(){
		try {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			arrayList.add(5);
			AssertUtile.notEmpty(arrayList, "集合不能为空");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void FunnotEmptyMap(){
		try {
			HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
			hashMap.put("03E", 32);
			AssertUtile.notEmptyMap(hashMap, "map集合不能为空");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void FunhasText(){
		try {
			AssertUtile.hasText(" sasa", "字符串必须有值,去掉空格后长度必须大于0");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void FungreaterThanZero(){
		try {
			AssertUtile.greaterThanZero(-1, "断言值必须大于0");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
}
