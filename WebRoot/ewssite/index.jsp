<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css"  href="resources/css/ext-all.css">
	<link rel="stylesheet" type="text/css"  href="resources/css/login.css">    
  </head>
  <body>
<!-- 加载效果 -->
<div id='loading-mask'></div>
<div id="loading">
    <div class="loading-indicator">
      <img src="resources/images/default/shared/large-loading.gif" width="32" height="32" style="margin-right:8px;float:left;vertical-align:top;"/> 
       <br/><span id="loading-msg">loading ...</span>
    </div>
</div>
<!-- 加载类库 -->
<script type="text/javascript" src="resources/js/ext-base.js"></script>
<script type="text/javascript" src="resources/js/ext-all.js"></script>
<script type="text/javascript" src="resources/js/ext-lang-zh_CN.js"></script>
<script type="text/javascript" src="resources/js/login.js"></script>
<!-- 退去加载效果 -->
<script type="text/javascript">
     Ext.get('loading').setOpacity(0.0,{duration:1.0,callback:function(){this.hide();}});
     Ext.get('loading-mask').setOpacity(0.0,{duration:1.0,callback:function(){this.hide();}});
</script>
   <!-- 登陆界面 -->  
<div id='wins'></div>
</body>
</html>


