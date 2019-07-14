package com.bw.mapper;

import java.util.List;
import java.util.Map;

import com.bw.entity.Goods;
import com.bw.entity.Peson;



public interface GoodsMapper {
   List<Map<String,Object>> getPesonList(Map<String,Object> map);

   int deleteAll(String ids);

   List<Goods> getGoodsList();

   int addPeson(Peson peson);

   int addP_G(Map<String, Object> map);

   Peson getPesonByPid(Peson peson);

   List<Integer> getPesonPid(Peson peson);

  
}
