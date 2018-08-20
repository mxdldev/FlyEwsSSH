<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
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
	</head>
  
  <body>
  <table width='100%' border='0' align='center' cellpadding='0' cellspacing='0' >
  <tr > 
    <td height='22' colspan='10' class="top">
    <table width='100%'>
    <tr class='topbg'><td align='center'><b>网 站 广 告 管 理</b></td>
   
</tr></table></td>
  </tr>
  <tr >
    <td width='70' height='30'>管理导航：</td>
    <td>
      <a href='listEadzone.aspx'>广告版位管理</a>
      &nbsp;|&nbsp;<a href='findChannelsNameEadzone.aspx'>添加新版位</a>
      &nbsp;|&nbsp;      <a href='Admin_Advertisement.asp?Action=ADList'>
              网站广告管理</a>&nbsp;|&nbsp;    
        <a href='Admin_Advertisement.asp?Action=AddAD'>添加新广告</a>
        &nbsp;|&nbsp;<a href='Admin_Advertisement.asp?Action=ZoneJSTemplate'>广告JS模板</a>
        &nbsp;|&nbsp;      <a href='Admin_UploadFile.asp?UploadDir=UploadAdPic'>广告上传图片管理</a>&nbsp;|&nbsp;      <a href='Admin_Advertisement.asp?Action=Import'>导入版位</a>&nbsp;|&nbsp;      <a href='Admin_Advertisement.asp?Action=Export'>导出版位</a>&nbsp;|&nbsp;    </td>
  </tr>
</table>
<br>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="6"><img src="ewssite/images/tleft.jpg" width="6" height="28" /></td>
    <td class="top">广告管理</td>
    <td width="6"><img src="ewssite/images/tright.jpg" width="6" height="28" /></td>
  </tr>
  <tr>
    <td class="mleft">&nbsp;</td>
    <td>
    <table width="98%" border="0" cellspacing="0" cellpadding="4" style="margin:10px 10px 0px 10px" class="listborder">
      
      <tr class="titlebar" height="20px">
        <td width="5%" class="tdborder">ID</td>
        <td width="15%" class="tdborder">版位名称</td>
        <td width="15%" class="tdborder">版位类型</td>
	    <td width="10%" class="tdborder">显示</td>
        <td width="15%" class="tdborder">版位尺寸</td>
		<td width="5%" class="tdborder">活动</td>
        <td width="20%" class="tdborder">操作</td>
        <td width="25%" >版位htm</td>
      </tr>
      <s:iterator value="listEadzone" id="adzone">
      <tr align="center" class="trbg">
        <td>${adzone.azid }</td>
        <c:if test="${adzone.azchid==0}"><td>[首页]${adzone.zatitle }</td></c:if>
        <c:if test="${adzone.aztype==0}"><td>矩形横幅</td></c:if>
        <c:if test="${adzone.aztype==1}"><td>弹出窗口</td></c:if>
        <c:if test="${adzone.aztype==2}"><td>漂浮移动</td></c:if>
        <c:if test="${adzone.aztype==3}"><td>对联广告</td></c:if>
		<c:if test="${adzone.azshowtype==0}"><td>随机</td></c:if>
	    <c:if test="${adzone.azshowtype==1}"><td>优先</td></c:if> 
		<c:if test="${adzone.azshowtype==2}"><td>循环</td></c:if>  
        <td>${adzone.azheight }x${adzone.azwidth }</td>
        <c:if test="${adzone.azdisplay==0}"><td><b>√</b></td></c:if>
        <c:if test="${adzone.azdisplay==1}"><td>×</td></c:if>	
		<td>&nbsp;&nbsp;&nbsp;<a href="">添加</a>&nbsp;&nbsp;&nbsp;
		<a href="initEditEadzone.aspx?eadzone.azid=${adzone.azid }">修改</a>
		&nbsp;&nbsp;&nbsp;复制&nbsp;&nbsp;&nbsp;<br/>
		<a href="deleteEadzone.aspx?eadzone.azid=${adzone.azid }">删除</a>
		&nbsp;&nbsp;&nbsp;清空&nbsp;&nbsp;&nbsp;暂停</td>
        <td><a href="">刷新</a>&nbsp;&nbsp;&nbsp;预览&nbsp;&nbsp;&nbsp;<br/>htm调用代码</td>
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