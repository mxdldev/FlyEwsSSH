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
    
    <title>后台主菜单修改</title>
    
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
		<script type="text/javascript">
var flag = false;
function checkEmroot() {
	checkmrtitle();
	if (!flag) {
		return false;
	}
	return true;
}function checkmrtitle(){
			var mrtitle = $('mrtitle').value;
			if(mrtitle==""){
				flag = false;
				msg_mrtitle.innerHTML = "<font color='red'>请输入标题</font>";
			}else{
			flag = true;
			msg_mrtitle.innerHTML = "";
			}
		}
	</script>

  </head>
  
	<body>
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="6"><img src="ewssite/images/tleft.jpg" width="6" height="28" /></td>
				<td class="top">添加主菜单</td>
				<td width="6"><img src="ewssite/images/tright.jpg" width="6" height="28" /></td>
			</tr>
			<tr>
				<td class="mleft">&nbsp;</td>
				<td>
					<form action="editEmroot.aspx" method="post" name="form1"
						onSubmit="return checkEmroot()">
						<table width="95%" border="0" cellspacing="0" cellpadding="0"
							style="margin-left: 20px; padding-top: 15px">
							<tr>
								<td width="10%" align="right">
									排序：
								</td>
								<td>
									<input type="text" name="mroot.mrorder" class="x-form-text"
										width="50" size="20" value="${mroot.mrorder}" />
								</td>
							</tr>
							<tr>
								<td width="10%" align="right">
									栏目名称：
								</td>
								<td>
									<input type="text" name="mroot.mrtitle" class="x-form-text"
										width="140px" size="20" id="mrtitle" value="${mroot.mrtitle}" onBlur="checkmrtitle()" />
									<span id="msg_mrtitle"></span>
								</td>
							</tr>
							<tr>
								<td width="10%" align="right">
									是否显示：
								</td>
								<td>
									<select name="mroot.mrdisplay">
										<c:if test="${mroot.mrdisplay==0}">
										<option value=0 selected>
											显示
										</option>
										<option value=1>
											隐藏
										</option>
										</c:if>
										<c:if test="${mroot.mrdisplay==1}">
										<option value=0>
											显示
										</option>
										<option value=1 selected>
											隐藏
										</option>
										</c:if>
									</select>
								</td>
							</tr>
							<tr>
								<td width="10%" align="right"></td>
								<td><input type="hidden" name="mroot.mrid" value="${mroot.mrid}">
									<input type="hidden" name="mroot.mraddtime" value="${mroot.mraddtime}">
									<input type="submit" class="ewssub" value=" " />
									<input type="reset" class="ewsreset" value=" " />
								</td>
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
