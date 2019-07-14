package test;

import java.util.ArrayList;
import java.util.HashMap;

import main.AssertUtil;
import main.ERuntimeException;

import org.junit.Test;

public class Tests {
     
	@Test
	public void test1(){
		try {
			AssertUtil.istrue(true, "这不是一个true");
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test2(){
		try {
			AssertUtil.isfalse(false, "这不是一个false");
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test3(){
		try {
			AssertUtil.isNotNull(" ", "字符串不能为空");
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test4(){
		try {
			AssertUtil.isNull("sdd", "字符串必须为空");
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test5(){
		try {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			arrayList.add(5);
			AssertUtil.iscollectionNotNull(arrayList, "不能为空");
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test6(){
		try {
			HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
			hashMap.put(55, "03E");
			AssertUtil.ismapNotNull(hashMap, "不能为空");
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test7(){
		try {
			AssertUtil.isLength(" saa s", "必须有值 去掉空格长度大于0");
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test8(){
		try {
			AssertUtil.isMath(-1,"值必须是正数");
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
}
