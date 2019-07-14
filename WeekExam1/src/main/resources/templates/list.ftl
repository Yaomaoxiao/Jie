<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/js/popper.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
 <script type="text/javascript">
 function qx(){
     $("input:checkbox").attr("checked",true);	 
 }
 function fx(){
     $("input:checkbox").each(function(){
    	 this.checked = !this.checked;
     })
 }
 
 function ps(ids){
	var ids = $("input:checked").map(function(){
		 return this.value;
	 }).get().join();
	 if(ids.length){
		 $.post("getdeleteAll",{ids:ids},function(obj){
		    	   if(obj>0){
		    	   	 alert("删除成功");
		    		   location.href = "list";
		    	   }else{
		    	     alert("删除失败");  	
		    	   }
		    	 },"json")
		     }else{
		     	alert("请至少选择一条数据");
		     }
	 }
 </script>

</head>
<body>
<form action="list" method="post">
店铺名称：  <input type="text" name="pname" value="${map.pname }"><br>
时间区间：  <input type="text" name="lowtime" value="${map.lowtime }">--- 
  <input type="text" name="hightime" value="${map.hightime }"><br>
  <button>查询</button>
</form>
 <table  class="table table-dark">
  <tr>
   <th>
    <input type="button" value="全选" onclick="qx()">
    <input type="button" value="反选" onclick="fx()">
   </th>
   <th>编号</th>
   <th>店铺名称</th>
   <th>创建日期</th>
   <th>销售商品</th>
   <th>操作
     <a href="toAdd"><input type="button" value="添加"></a>
   </th>
  </tr>
  <#list pesonList as p>
  <tr>
   <td>
    <input type="checkbox" name="ids" value="${p.pid }">
   </td>
   <td>${p.pid }</td>
   <td>${p.pname }</td>
   <td>${p.ptime }</td>
   <td>${p.gnames }</td>
   <td>
       	<a href="toUpdate?pid=${p.pid}"><input type="button" value="修改" ></a>
   </td>
  </tr>
  </#list>
 </table>
 <input type="button" value="批量删除" onclick="ps()">
<#include "page.ftl" >
</body>
</html>