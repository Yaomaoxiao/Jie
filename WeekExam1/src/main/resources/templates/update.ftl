<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/js/popper.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
</head>
<body>
  <form action="update" method="post">
   <input type="hidden" name="pid" value="${pesByPid.pid }">
   <table class="table table-dark">
    <tr>
     <td>店铺名称</td>
     <td><input type="text" name="pname" value="${pesByPid.pname }"></td>
    </tr>
    
     <tr>
     <td>创建日期</td>
     <td><input type="date" name="ptime" value="${pesByPid.ptime}"></td>
    </tr>
    
     <tr>
     <td>销售商品</td>
     <td>
        <#list goodsList as g>
          <input type="checkbox" name="ids" value="${g.gid }">${g.gname }
        </#list>
     </td>
    </tr>
     <tr>
      <td colspan="11">
       <input type="submit" value="确认修改">
      </td>
     </tr>
   </table>
  </form>
</body>
</html>