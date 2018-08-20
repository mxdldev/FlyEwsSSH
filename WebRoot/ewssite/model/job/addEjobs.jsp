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
			checkfajorder();
			if (!flag) {
				return false;
			}
			checkfajtitle();
			if (!flag) {
				return false;
			}
			checkfajstart();
			if (!flag) {
				return false;
			}
			checkfajend();
			if (!flag) {
				return false;
			}
			return true;
		}
		function checkfajorder(){
			//正则表达式校验
			var temp = /^[1-9][0-9]*$/
			var jorder = document.getElementById("jorder").value;
			if(jorder==""){
				msg_jorder.innerHTML = "<font color='red'>*不能为空</font>";
				flag = false;
				return;
			}else{
				msg_jorder.innerHTML = "<font color='red'>*</font>";
			}
			if(!temp.test(jorder)){
				msg_jorder.innerHTML = "<font color='red'>*必须是大于0的整数</font>";
				flag = false;
			}else{
				msg_jorder.innerHTML = "<font color='red'>*</font>";
			}
			flag = true;
		}
		function checkfajtitle(){
			//正则表达式校验
			var jtitle = document.getElementById("jtitle").value;
			if(jtitle==""){
				msg_jtitle.innerHTML = "<font color='red'>不能为空</font>";
				flag = false;
				return;
			}else{
				msg_jtitle.innerHTML = "<font color='red'>*</font>";
			}
			flag = true;
		}
		function checkfajstart(){
			//正则表达式校验
			var jstart = document.getElementById("jstart").value;
			if(jstart==""){
				flag = false;
				return;
			}
			flag = true;
		}
		function checkfajend(){
			//正则表达式校验
			var jend = document.getElementById("jend").value;
			if(jend==""){
				flag = false;
				return;
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
					添加招聘信息
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
					<form action="addEjobs.aspx" method="post" name="form1"
						onsubmit="return checkEfavorites()">
						<table width="95%" border="0" cellspacing="0" cellpadding="0"
							style="margin-left: 20px; padding-top: 15px">
							<tr>
								<td width="10%" align="right">
									排序：
								</td>
								<td>
									<input type="text" name="ejobs.jorder"
										class="x-form-text" width="140px" size="20" id="jorder" value="10"
										onblur="checkfajorder()" />
									<span id="msg_jorder"><font color='red'>*</font></span>
								</td>
							</tr>
							<tr>
								<td width="10%" align="right">
									招聘岗位：
								</td>
								<td>
									<input type="text" name="ejobs.jtitle"
										class="x-form-text" width="140px" size="20" id="jtitle"
										onblur="checkfajtitle()" />
									<span id="msg_jtitle"><font color='red'>*</font></span>
								</td>
							</tr>
							<tr>
								<td width="10%" align="right">
									待遇：
								</td>
								<td>
									<input type="text" name="ejobs.jdeal" class="x-form-text" id="jdeal"
										width="140px" size="20" />
								</td>
							</tr>
							<tr>
								<td width="10%" align="right">
									招聘人数：
								</td>
								<td>
									<input type="text" name="ejobs.jpeople" class="x-form-text" value="若干"
										width="140px" size="20" />
								</td>
							</tr>
							<tr>
								<td width="10%" align="right">
									是否显示：
								</td>
								<td>
									<select name="jdisplay" style="width: 150px;">
								        <option value="0" selected="selected">显示</option>
										<option value="1">隐藏</option>
								    </select>
								</td>
							</tr>
							<tr>
								<td width="10%" align="right">
									发布时间：
								</td>
								<td>
									<input type="text" name="ejobs.jstart" class="x-form-text" readonly="readonly" id="jstart" onblur="checkfajstart()"
										width="140px" size="20" onClick="SelectDate(this,'yyyy-MM-dd');"/>
									<span id=""><font color='red'>*</font></span>
								</td>
							</tr>
							<tr>
								<td width="10%" align="right">
									结束时间：
								</td>
								<td>
									<input type="text" name="ejobs.jend" class="x-form-text" readonly="readonly" id="jend" onblur="checkfajend()"
										width="140px" size="20" onClick="SelectDate(this,'yyyy-MM-dd');"/>
									<span id=""><font color='red'>*</font></span>
								</td>
							</tr>
							<tr>
								<td width="10%" align="right">
									具体要求：
								</td>
								<td>
									<input type="text" name="ejobs.jcontent" class="x-form-text"
										width="140px" size="20"/>
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
				<td class="bmiddle"></td>
				<td>
					<img src="ewssite/images/bright.jpg" width="6" height="5" />
				</td>
			</tr>
		</table>
	</body>
</html>