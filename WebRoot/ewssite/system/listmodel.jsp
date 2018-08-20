<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>模型管理列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="ewssite/css/css.css">
  </head>
  
  <body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="6"><img src="ewssite/images/tleft.jpg" width="6" height="28" /></td>
    <td class="top">后台菜单列表</td>
    <td width="6"><img src="ewssite/images/tright.jpg" width="6" height="28" /></td>
  </tr>
  <tr>
    <td class="mleft">&nbsp;</td>
    <td><table width="98%" border="0" cellspacing="0" cellpadding="4" style="margin:10px 10px 0px 10px" class="listborder">
      <tr>
        <td colspan="4" class="toolsbar" height="27px">&nbsp;<img src="resources/icons/add.gif"><a href="ewssite/system/modeladd.jsp">添加模型</a></td>
        </tr>
      <tr class="titlebar" height="23px">
		<td width="5%" class="tdborder">ID</td>
		<td width="70%" class="tdborder">名称</td>
		<td width="20%">操作</td>
	</tr>
    <s:iterator value="listEmodel" id="dispaily">
	<tr align="center" class="trbg">
		<td><s:property value="mid" /></td>
		<td><s:property value="mtitle" /></td>
		<td>
		<a href="editshowEmodel.aspx?id=<s:property value='mid'/>">修改</a> /
		<c:if test="${dispaily.mdisplay==0}"><a href="disEmodel.aspx?id=<s:property value='mid'/>&dis=1">隐藏</a></c:if>
		<c:if test="${dispaily.mdisplay==1}"><a href="disEmodel.aspx?id=<s:property value='mid'/>&dis=0">显示</a></c:if>
		<c:if test="${dispaily.mdeleted==0}">/<a href="delEmodel.aspx?id=<s:property value='mid'/>">删除</a></c:if>
		</td>
	</tr>
	</s:iterator>      
    </table>
	<table width="98%" border="0" cellspacing="0" cellpadding="0" style="margin:0px 10px 10px 10px">
  <tr>
    <td height="25px" align="right" class="pagebar"><div style="padding-right:15px">${pagination}</div></td>
  </tr>
</table>
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
