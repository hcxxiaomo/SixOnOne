<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>测试数据管理</title>

  <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>

	<div class="container">
	    <h4>所有数据</h4>
<%-- 	    <h3>${obj}</h3> --%>
  <table class="table table-striped table-condensed">
	 <tr>
    <th>id</th>
    <th>号牌号码</th>
 <th>号牌种类</th>
    <th>所有人</th>
 <th>机动车状态</th>
    <th>品牌</th>
 <th>型号</th>
    <th>颜色</th>
    <th>检验有效期止</th>
 <th>发动机号</th>
<!--     <th>车架号</th> -->
 <th>车辆识别代号</th>
 <th>初次登记日期</th>
    <th>发动机型号</th>
    <th>是否违法</th>
    <th>删除</th>
  </tr>
  <c:forEach items="${obj }" var="carInfo">
  <tr>
    <td>${carInfo.id }</td>
    <td>${carInfo.carNumberHpzm }</td>
    <td>${carInfo.typeHpzl }</td>
    <td>${carInfo.ownerSyr }</td>
    <td>${carInfo.statusZt }</td>
    <td>${carInfo.brandClpp1 }</td>
    <td>${carInfo.typeClxh }</td>
    <td>${carInfo.colorCsys }</td>
    <td>${carInfo.testValidityTimeYxqz }</td>
    <td>${carInfo.engineNumberFdjh }</td>
    <td>${carInfo.vinClsbdh }</td>
    <td>${carInfo.firstRegisterTimeCcdjrq }</td>
    <td>${carInfo.engineTypeFdjxh }</td>
    <td>${carInfo.legal }</td>
    <td><a href="../demo/del/${carInfo.id }"  class="btn btn-primary" >删除</a></td>
  </tr>
  </c:forEach>
</table>

<br/>
<div id="addInfo_hide"  style="width: 40%">
	<button  class="btn btn-info" onclick="addInfo_hide()">添加数据</button>
</div>


<div  id="addInfo_show"   class="bg-info" style="width: 40% ;display: none;">
	 <h4>增加数据</h4>
<form action="../demo/add" method="post">

  <div class="form-group">
    <label for="carNumberHpzm">号牌号码</label>
    <input type="text" class="form-control" id="carNumberHpzm" name="carNumberHpzm">
  </div>
  <div class="form-group">
    <label for="typeHpzl">号牌种类</label>
    <input type="text" class="form-control" id="typeHpzl" name="typeHpzl">
  </div>
  <div class="form-group">
    <label for="ownerSyr">所有人</label>
    <input type="text" class="form-control" id="ownerSyr" name="ownerSyr">
  </div>
  <div class="form-group">
    <label for="statusZt">机动车状态</label>
    <input type="text" class="form-control" id="statusZt" name="statusZt">
  </div>
  <div class="form-group">
    <label for="brandClpp1">品牌</label>
    <input type="text" class="form-control" id="brandClpp1" name="brandClpp1">
  </div>
  <div class="form-group">
    <label for="typeClxh">型号</label>
    <input type="text" class="form-control" id="typeClxh" name="typeClxh">
  </div>
  <div class="form-group">
    <label for="colorCsys">颜色</label>
    <input type="text" class="form-control" name="colorCsys">
  </div>
  <div class="form-group">
    <label for="testValidityTimeYxqz">检验有效期止</label>
    <input type="text" class="form-control" id="testValidityTimeYxqz" name="testValidityTimeYxqz">
  </div>
  <div class="form-group">
    <label for="engineNumberFdjh">发动机号</label>
    <input type="text" class="form-control" id="engineNumberFdjh" name="engineNumberFdjh">
  </div>
  <div class="form-group">
    <label for="vinClsbdh">车辆识别代号</label>
    <input type="text" class="form-control" id="vinClsbdh" name="vinClsbdh">
  </div>
  <div class="form-group">
    <label for="firstRegisterTimeCcdjrq">初次登记日期</label>
    <input type="text" class="form-control" id="firstRegisterTimeCcdjrq" name="firstRegisterTimeCcdjrq">
  </div>
  <div class="form-group">
    <label for="engineTypeFdjxh">发动机型号</label>
    <input type="text" class="form-control" id="engineTypeFdjxh" name="engineTypeFdjxh">
  </div>
  <div class="form-group">
    <label for="legal">是否违法</label>
    <input type="text" class="form-control" id="legal" name="legal">
  </div>
  <button type="submit" class="btn btn-default">提交</button>
</form>
</div>
	</div>
	

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
   <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
 
 <script type="text/javascript">
 function addInfo_hide(){
	 $("#addInfo_hide").hide();
	 $("#addInfo_show").show();
	 
 }
 
 </script>
 
  </body>
</html>