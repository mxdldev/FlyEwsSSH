<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

		<title>My JSP 'addEfavorites.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="ewssite/css/css.css">
		<script type='text/javascript' src='dwr/engine.js'>
</script>
		<script type='text/javascript' src='dwr/util.js'>
</script>
		<script type='text/javascript' src='ewssite/js/date.js'>
</script>
		<script type="text/javascript">
		var flag = false;
		function checkEfavorites() {
			checkfaaname();
			if (!flag) {
				return false;
			}
			checkfaapass1();
			if (!flag) {
				return false;
			}
			checkfaapass2();
			if (!flag) {
				return false;
			}
			return true;
		}
		function checkfaaname(){
			//正则表达式校验
			var temp = /^[1-9][0-9]*$/
			var aname = document.getElementById("aname").value;
			if(aname==""){
				msg_aname.innerHTML = "<font color='red'>*不能为空</font>";
				flag = false;
				return;
			}else{
				msg_aname.innerHTML = "<font color='red'>*</font>";
			}
			flag = true;
		}
		function checkfaapass1(){
			//正则表达式校验
			var apass1 = document.getElementById("apass1").value;
			if(apass1==""){
				msg_apass1.innerHTML = "<font color='red'>*不能为空</font>";
				flag = false;
				return;
			}else{
				msg_apass1.innerHTML = "<font color='red'>*</font>";
			}
			if(apass1.length<6){
				msg_apass1.innerHTML = "<font color='red'>*大于6位</font>";
				flag = false;
				return;
			}else{
				msg_apass1.innerHTML = "<font color='red'>*</font>";
			}
			flag = true;
		}
		function checkfaapass2(){
			//正则表达式校验
			var apass1 = document.getElementById("apass1").value;
			var apass2 = document.getElementById("apass2").value;
			if(apass2==""){
				msg_apass2.innerHTML = "<font color='red'>*不能为空</font>";
				flag = false;
				return;
			}else{
				msg_apass2.innerHTML = "<font color='red'>*</font>";
			}
			if(apass1!=apass2){
				msg_apass2.innerHTML = "<font color='red'>*两次密码不同</font>";
				flag = false;
				return;
			}else{
				msg_apass2.innerHTML = "<font color='red'>*</font>";
			}
			flag = true;
		}
	</script>
	</head>

	<body>
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="6">
					<img src="ewssite/images/tleft.jpg" width="6" height="28" />
				</td>
				<td class="top">
					添加管理员
				</td>
				<td width="6">
					<img src="ewssite/images/tright.jpg" width="6" height="28" />
				</td>
			</tr>
			<tr>
				<td class="mleft">
					&nbsp;
				</td>
				<td>
					<form action="addEauser.aspx" method="post" name="form1"
						onsubmit="return checkEfavorites()">
						<table width="95%" border="0" cellspacing="0" cellpadding="0"
							style="margin-left: 20px; padding-top: 15px">
							<tr>
								<td width="10%" align="right">
									管理员登录名：
								</td>
								<td>
									<input type="text" name="eauser.aname"
										class="x-form-text" width="140px" size="20" id="aname"
										onblur="checkfaaname()" />
									<span id="msg_aname"><font color='red'>*</font></span>
								</td>
							</tr>
							<tr>
								<td width="10%" align="right">
									登录密码：
								</td>
								<td>
									<input type="password" name="eauser.apass"
										class="x-form-text" width="140px" size="20" id="apass1"
										onblur="checkfaapass1()" />
									<span id="msg_apass1"><font color='red'>*</font></span>
								</td>
							</tr>
							<tr>
								<td width="10%" align="right">
									重复登录密码：
								</td>
								<td>
									<input type="password" name="eauser.apass2"
										class="x-form-text" width="140px" size="20" id="apass2"
										onblur="checkfaapass2()" />
									<span id="msg_apass2"><font color='red'>*</font></span>
								</td>
							</tr>
							<tr>
								<td width="10%" align="right">
									真实姓名：
								</td>
								<td>
									<input type="text" name="eauser.atname" class="x-form-text" id="atname"
										width="140px" size="20" />
								</td>
							</tr>
							<tr>
								<td width="10%" align="right">
									管理员组类型：
								</td>
								<td>
									<select name="eauser.eagrouptype.agtid" style="width: 150px;">
										<c:forEach items="${listEagrouptype}" var="eagrouptype">
								        	<option value="${eagrouptype.agtid}">${eagrouptype.agtname}</option>
										</c:forEach>
								    </select>
								</td>
							</tr>
							<tr>
								<td width="10%" align="right">
									管理员状态：
								</td>
								<td>
									<select name="eauser.atype" style="width: 150px;">
								        <option value="0" selected="selected">启用</option>
										<option value="1">禁用</option>
								    </select>
								</td>
							</tr>
							<tr>
								<td width="10%" align="right"></td>
								<td>
									<input type="submit" class="ewssub" value=" " />
									<input type="reset" class="ewsreset" value=" " />
								</td>
							</tr>
							<tr>
								<td colspan="2" height="10px"></td>
							</tr>
						</table>
					</form>
				</td>
				<td class="mright">
					&nbsp;
				</td>
			</tr>
			<tr>
				<td>
					<img src="ewssite/images/bleft.jpg" width="6" height="5" />
				</td>
				<td class="bmiddle">&nbsp;</td>
				<td>
					<img src="ewssite/images/bright.jpg" width="6" height="5" />
				</td>
			</tr>
		</table>
	</body>
</html>