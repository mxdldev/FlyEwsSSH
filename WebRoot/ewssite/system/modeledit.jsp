<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>模型修改</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="ewssite/css/css.css">
	<script type='text/javascript' src='dwr/engine.js'></script>
	<script type='text/javascript' src='dwr/util.js'></script>
	<script type="text/javascript">	   
		var flag = false;
		function checkEmodel(){				
			checkmtitle();			
			if(!flag){
				return false;
			}
			checkmurl()
			if(!flag){
				return false;
			}			
			return true;
		}
		function checkmtitle(){
			var mtitle = $('mtitle').value;
			if(mtitle==""){
				flag = false;
				msg_mtitle.innerHTML = "<font color='red'>请输入名称</font>";
			}else{
				flag = true;
				msg_mtitle.innerHTML = "";
			}
		}
		function checkmurl(){
			var murl = $('murl').value;
			if(murl==""){
				flag = false;
				msg_murl.innerHTML = "<font color='red'>请输入管理入口地址</font>";
			}else{
				flag = true;
				msg_murl.innerHTML = "";
			}
		}
	</script>
  </head>
  
  <body>
<table width="100%" border="0" cellspacing="0" cellpadding="0" >
  <tr>
    <td width="6"><img src="ewssite/images/tleft.jpg" width="6" height="28" /></td>
    <td class="top">添加子菜单</td>
    <td width="6"><img src="ewssite/images/tright.jpg" width="6" height="28" /></td>
  </tr>
  <tr>
    <td class="mleft">&nbsp;</td>
    <td>
    <form action="editEmodel.aspx" method="post" name="form1" onSubmit="return checkEmodel()">
    <table width="95%" border="0" cellspacing="0" cellpadding="0" style="margin-left:20px;padding-top:15px">    
  <tr>
  	<td  width="10%" align="right">排序：</td>
  	<td><input type="text" name="model.morder" class="x-form-text" width="50px" size="20" value="${model.morder}"/></td>
  </tr>
   <tr>
    <td  width="10%" align="right">名称：</td>
    <td><input type="text" name="model.mtitle" value="${model.mtitle}" class="x-form-text" width="140px" size="20" id="mtitle" onBlur="checkmtitle()"/> <span id="msg_mtitle"></span></td>
  </tr> 
   <tr>
    <td  width="10%" align="right">管理入口地址：</td>
    <td><input type="text" name="model.murl" value="${model.murl}" class="x-form-text" width="140px" id="murl" onBlur="checkmurl()"/> <span id="msg_murl"></span></td>
  </tr>
   <tr>
    <td  width="10%" align="right">是否显示：</td>
    <td><select name="model.mdisplay">
        <c:if test="${model.mdisplay==0}">
		<option value=0 selected>显示</option>
		<option value=1>隐藏</option>
		</c:if>
		<c:if test="${model.mdisplay==1}">
		<option value=0>显示</option>
		<option value=1 selected>隐藏</option>
		</c:if>
      </select></td>
  </tr>  
   <tr>
    <td  width="10%" align="right">是否可以删除：</td>
    <td><select name="model.mdeleted">
        <c:if test="${model.mdeleted==0}">
		<option value=0 selected>可以</option>
		<option value=1>不可以</option>
		</c:if>
		<c:if test="${model.mdeleted==1}">
		<option value=0>可以</option>
		<option value=1 selected>不可以</option>
		</c:if>
      </select></td>
  </tr>
   <tr>
    <td  width="10%" align="right">是否可以分类：</td>
    <td><select name="model.mclass">
        <c:if test="${model.mclass==0}">
		<option value=0 selected>可以</option>
		<option value=1>不可以</option>
		</c:if>
		<c:if test="${model.mclass==1}">
		<option value=0>可以</option>
		<option value=1 selected>不可以</option>
		</c:if>
      </select></td>
  </tr>
   <tr>
    <td  width="10%" align="right"></td>
    <td><input type="hidden" name="model.mid" value="${model.mid}">
									<input type="hidden" name="model.maddtime" value="${model.maddtime}">
									<input type="submit" class="ewssub" value=" " />
									<input type="reset" class="ewsreset" value=" " /></td>
  </tr>
  <tr><td colspan="2" height="10px"></td></tr>  
</table>
</form>
</td>
    <td class="mright">&nbsp;</td>
  </tr>
  <tr>
    <td><img src="ewssite/images/bleft.jpg" width="6" height="5" /></td>
    <td class="bmiddle"></td>
    <td><img src="ewssite/images/bright.jpg" width="6" height="5" /></td>
  </tr>
</table>
  </body>
</html>
