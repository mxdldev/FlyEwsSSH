<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addEfavorites.jsp' starting page</title>
    
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
		function checkEfavorites(){				
			return flase;
			checkfatitle();			
			if(!flag){
				return false;
			}			
			return true;
		}
		function checkfatitle(){
			var fatitle = $('fatitle').value;
			if(fatitle==""){
				flag = false;
				msg_fatitle.innerHTML = "<font color='red'>请输入标题</font>";
			}
		}
	</script>
	 </head>
  
  <body>
<table width="100%" border="0" cellspacing="0" cellpadding="0" >
  <tr>
    <td width="6"><img src="ewssite/images/tleft.jpg" width="6" height="28" /></td>
    <td class="top">添加收藏信息</td>
    <td width="6"><img src="ewssite/images/tright.jpg" width="6" height="28" /></td>
  </tr>
  <tr>
    <td class="mleft">&nbsp;</td>
    <td>
    <form action="addEfavorites.aspx" method="post" name="form1" onsubmit="return checkEfavorites()">
    <table width="95%" border="0" cellspacing="0" cellpadding="0" style="margin-left:20px;padding-top:15px">    
  <tr>
    <td  width="10%" align="right">标题：</td>
    <td><input type="text" name="efavorites.fatitle" class="x-form-text" width="140px" size="20" id="fatitle" onblur="checkfatitle()"/> <span id="msg_fatitle"></span></td>
  </tr>
   <tr>
    <td  width="10%" align="right">地址：</td>
    <td><input type="text" name="efavorites.faurl" class="x-form-text" width="140px" size="20"/></td>
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