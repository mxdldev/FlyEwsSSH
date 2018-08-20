<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>后台子主菜单添加</title>
    
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
		function checkEmsub(){				
			checkmsmrid()
			if(!flag){
				return false;
			}
			checkmstitle();			
			if(!flag){
				return false;
			}
			checkmsurl()
			if(!flag){
				return false;
			}			
			return true;
		}
		function checkmsmrid(){
			var msmrid = $('msmrid').value;
			if (msmrid=="0"){
				flag = false;
				msg_msmrid.innerHTML = "<font color='red'>请选择主栏目</font>";
			}else{
				flag = true;
				msg_msmrid.innerHTML = "";
			}
		}
		function checkmstitle(){
			var mstitle = $('mstitle').value;
			if(mstitle==""){
				flag = false;
				msg_mstitle.innerHTML = "<font color='red'>请输入标题</font>";
			}else{
				flag = true;
				msg_mstitle.innerHTML = "";
			}
		}
		function checkmsurl(){
			var msurl = $('msurl').value;
			if(msurl==""){
				flag = false;
				msg_msurl.innerHTML = "<font color='red'>请输入连接</font>";
			}else{
				flag = true;
				msg_msurl.innerHTML = "";
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
    <form action="addEmsub.aspx" method="post" name="form1" onSubmit="return checkEmsub()">
    <table width="95%" border="0" cellspacing="0" cellpadding="0" style="margin-left:20px;padding-top:15px">    
  <tr>
    <td  width="10%" align="right">主栏目：</td>
    <td><select name="msub.msmrid" id="msmrid" onblur="checkmsmrid()">
        <option value="0" selected>请选择主栏目</option>
		<!--主栏目-->
		<c:forEach items="${listEmroots}" var="root">
		<option value="${root.mrid}">${root.mrtitle}</option>
		</c:forEach>
      </select> <span id="msg_msmrid"></span></td>
  </tr>
  <tr>
  	<td  width="10%" align="right">排序：</td>
  	<td><input type="text" name="msub.msorder" class="x-form-text" width="50px" size="20" value="10"/></td>
  </tr>
   <tr>
    <td  width="10%" align="right">栏目名称：</td>
    <td><input type="text" name="msub.mstitle" class="x-form-text" width="140px" size="20" id="mstitle" onBlur="checkmstitle()"/> <span id="msg_mstitle"></span></td>
  </tr> 
   <tr>
    <td  width="10%" align="right">连接：</td>
    <td><input type="text" name="msub.msurl" class="x-form-text" width="140px" id="msurl" onBlur="checkmsurl()"/> <span id="msg_msurl"></span></td>
  </tr>
   <tr>
    <td  width="10%" align="right">是否显示：</td>
    <td><select name="msub.msdisplay">
        <option value="0" selected>显示</option>
		<option value="1">隐藏</option>
      </select></td>
  </tr>  
   <tr>
    <td  width="10%" align="right"></td>
    <td><input type="submit" class="ewssub" value=" "/>　　　<input type="reset" class="ewsreset" value=" "/></td>
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
