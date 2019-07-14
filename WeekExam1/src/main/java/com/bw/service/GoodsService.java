package com.bw.service;

import java.util.List;
import java.util.Map;

import com.bw.entity.Goods;
import com.bw.entity.Peson;

public interface GoodsService {
	List<Map<String,Object>> getPesonList(Map<String,Object> map);

	int deleteAll(String ids);

	List<Goods> getGoodsList();

	int addPeson(Peson peson, int[] ids);

	Peson getPesonByPid(Peson peson);

	List<Integer> getPesonPid(Peson peson);

}
