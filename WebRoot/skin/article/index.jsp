<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'p.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">	
	<link rel="stylesheet" type="text/css" href="skin/css/css.css">
  </head>
  
  <body>
    <table width="900px" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td width="340" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0" style="border:1px solid #000000">
      <tr>
        <td bgcolor="EBF2FA" height="25px">　最新新闻</td><td bgcolor="EBF2FA" align="right">更多>></td>
      </tr>
      <tr>
        <td colspan="2">${enews_1_6_0_0_0_0_0_0_0_8_0_0_1_0_0_3_85_100_0}</td>
      </tr>
    </table></td>
    <td width="10"></td>
    <td width="340px" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0" style="border:1px solid #000000">
      <tr>
        <td bgcolor="EBF2FA" height="30">　推荐新闻</td><td bgcolor="EBF2FA" align="right">更多>></td>
      </tr>
      <tr>
        <td colspan="2">${enews_1_12_0_0_0_0_0_0_0_4_0_0_1_1_0_2_0_0_0}</td>
      </tr>
    </table></td>
    <td width="10"></td>
    <td valign="top" width="200px"><table width="100%" border="0" cellspacing="0" cellpadding="0" style="border:1px solid #000000">
      <tr>
        <td bgcolor="EBF2FA" height="30">　热点新闻</td><td bgcolor="EBF2FA" align="right">更多>></td>
      </tr>
      <tr>
        <td colspan="2">${enews_1_6_0_0_0_0_0_0_0_7_0_0_0_0_0_1_0_0_0}</td>
      </tr>
    </table></td>
  </tr>
</table></body>
</html>
