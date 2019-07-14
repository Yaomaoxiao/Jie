package com.bw.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bw.entity.Goods;
import com.bw.entity.Peson;
import com.bw.mapper.GoodsMapper;

@Service
public class GoodsServiceImpl  implements GoodsService{
	
	@Autowired
	GoodsMapper goodsMapper;

	@Override
	public List<Map<String, Object>> getPesonList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return goodsMapper.getPesonList(map);
	}

	@Override
	public int deleteAll(String ids) {
		// TODO Auto-generated method stub
		return goodsMapper.deleteAll(ids);
	}

	@Override
	public List<Goods> getGoodsList() {
		// TODO Auto-generated method stub
		return goodsMapper.getGoodsList();
	}

	@Override
	public int addPeson(Peson peson, int[] ids) {
		//1:先去添加店铺  返回主键
		int i = goodsMapper.addPeson(peson);
		
		//2:在去添加中间表
		Map<String, Object> map = new HashMap<>();
		map.put("peson", peson);
		map.put("ids", ids);
		
		int j = goodsMapper.addP_G(map);
		
		return 1;
	}

	@Override
	public Peson getPesonByPid(Peson peson) {
		// TODO Auto-generated method stub
		return goodsMapper.getPesonByPid(peson);
	}

	@Override
	public List<Integer> getPesonPid(Peson peson) {
		// TODO Auto-generated method stub
		return goodsMapper.getPesonPid(peson);
	}



}
