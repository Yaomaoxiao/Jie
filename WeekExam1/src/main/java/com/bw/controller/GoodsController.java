package com.bw.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.entity.Goods;
import com.bw.entity.Peson;
import com.bw.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {

	@Autowired
	GoodsService goodsService;
	
	@RequestMapping("list")
	public String list(Model model,@RequestParam(defaultValue="1")Integer pageNum,
			 @RequestParam(defaultValue="")String pname,
			 @RequestParam(defaultValue="")String lowtime,
			 @RequestParam(defaultValue="")String hightime
			){
		
		Map<String,Object> map = new HashMap<>();
		map.put("pname", pname);
		map.put("lowtime", lowtime);
		map.put("hightime", hightime);
		
		PageHelper.startPage(pageNum, 2);

		List<Map<String, Object>> pesonList = goodsService.getPesonList(map);
		
		PageInfo<Map<String, Object>> pageInfo = new PageInfo<Map<String, Object>>(pesonList);
		model.addAttribute("pesonList", pesonList);
		model.addAttribute("page", pageInfo);
		model.addAttribute("map", map);
		return "list";
	}
	
	@RequestMapping("toAdd")
	public String toAdd(Model model){
		List<Goods> goodsList = goodsService.getGoodsList();
		model.addAttribute("goodsList", goodsList);
		return "add";
	}
	
	@RequestMapping("add")
	public String addPeson(Peson peson,int[] ids ){
		
		int i = goodsService.addPeson(peson,ids);
	     
		return "redirect:list";
	}
	
	@RequestMapping("toUpdate")
	public String toUpdate(Peson peson,Model model){
		//根据ID回显数据
	Peson pesByPid = goodsService.getPesonByPid(peson);
	//查询所有的商品
	List<Goods> goodsList = goodsService.getGoodsList();
	//查询当前这条数据的商品
	List<Integer> PesPid = goodsService.getPesonPid(peson);
	
	model.addAttribute("goodsList", goodsList);
	model.addAttribute("pesByPid", pesByPid);
	model.addAttribute("PesPid", PesPid);
	
	System.out.println(pesByPid);
		return "update";
	}
	
	@RequestMapping("update")
	public String updatePeson(){
		
		return "redirect:list";
	}
	
	
	
	
	@RequestMapping("getdeleteAll")
	@ResponseBody
	public Object deleteAll(String ids){
		int i  = goodsService.deleteAll(ids);
		return i;
	}
}
