<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'succ.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>EWS内容管理系统</title>
		<link rel="stylesheet" type="text/css"
			href="resources/css/ext-all.css" />
		<script type="text/javascript" src="resources/js/ext-base.js">
</script>
		<script type="text/javascript" src="resources/js/ext-all.js">
</script>
		<script type="text/javascript" src="resources/js/main.js">
</script>
		<script type='text/javascript' src='dwr/interface/tree.js''>
</script>
		<script type='text/javascript' src='dwr/engine.js'>
</script>
		<script type='text/javascript' src='dwr/util.js'>
</script>
	</head>
	<BODY
		style="Z-INDEX: 20000; LEFT: 0px; WIDTH: 100%; POSITION: absolute; TOP: 0px; HEIGHT: 100%">
		<DIV class="x-hidden x-date-bottom" id=header>
			<TABLE width="100%">
				<TBODY>
					<TR>
						<TD height="32px">
							<div style="font-size: 22px; font-weight: bold;">
								EWS内容管理系统V1.0
							</div>
						</TD>
						<TD align="right">
							<div style="font-size: 13px;">
								欢迎您：
								<font color="red">${eauserInfo.userName }</font> |
								<a href="logoutEauser.aspx">注销</a> |
								<a href="initChangeApass.aspx">修改密码</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							</div>
						</TD>
					</TR>
				</TBODY>
			</TABLE>
		</DIV>
		<DIV class="x-hidden x-date-bottom footer x-toolbar" id=footer>
			<div style="padding-right: 20px; color: #000000;" align="right">
				技术支持：锦华科技
			</div>
		</DIV>
	</BODY>
</HTML>
