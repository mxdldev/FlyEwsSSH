<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
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
	</head>

	<body>
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="6">
					<img src="ewssite/images/tleft.jpg" width="6" height="28" />
				</td>
				<td class="top">
					个人简历
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
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td class="tdborder" colspan="4">
								${etalent.ejobs.jtitle}
							</td>
						</tr>
						<tr>
							<td class="tdborder">
								姓名:
							</td>
							<td class="tdborder">
								<b>${etalent.taname}</b>
							</td>
							<td class="tdborder">
								性别:
							</td>
							<td class="tdborder">
								<b>${etalent.tasex}</b>
							</td>
						</tr>
						<tr>
							<td class="tdborder">
								身高:
							</td>
							<td class="tdborder">
								<b>${etalent.tastature}</b>
							</td>
							<td class="tdborder">
								户籍:
							</td>
							<td class="tdborder">
								<b>${etalent.taarea}</b>
							</td>
						</tr>
						<tr>
							<td class="tdborder">
								民族:
							</td>
							<td class="tdborder">
								<b>${etalent.tafolk}</b>
							</td>
							<td class="tdborder">
								体重:
							</td>
							<td class="tdborder">
								<b>${etalent.taavoirdupois}</b>
							</td>
						</tr>
						<tr>
							<td class="tdborder">
								婚姻状况:
							</td>
							<td class="tdborder">
								<b>${etalent.tamarriage}</b>
							</td>
							<td class="tdborder">
								证件号码:
							</td>
							<td class="tdborder">
								<b>${etalent.taidentity}</b>
							</td>
						</tr>
						<tr>
							<td class="tdborder">
								联系电话:
							</td>
							<td class="tdborder">
								<b>${etalent.tatel}</b>
							</td>
							<td class="tdborder">
								邮件:
							</td>
							<td class="tdborder">
								<b>${etalent.taemail}</b>
							</td>
						</tr>
						<tr>
							<td class="tdborder">
								地址:
							</td>
							<td class="tdborder">
								<b>${etalent.taaddr}</b>
							</td>
							<td class="tdborder">
								QQ:
							</td>
							<td class="tdborder">
								<b>${etalent.taqq}</b>
							</td>
						</tr>
						<tr>
							<td class="tdborder">
								学历:
							</td>
							<td class="tdborder">
								<b>${etalent.tacert}</b>
							</td>
							<td class="tdborder">
								专业:
							</td>
							<td class="tdborder">
								<b>${etalent.taspecialty}</b>
							</td>
						</tr>
						<tr>
							<td class="tdborder">
								学校:
							</td>
							<td class="tdborder">
								<b>${etalent.taschool}</b>
							</td>
							<td class="tdborder">
								求职类型:
							</td>
							<td class="tdborder">
								<b>${etalent.tatype}</b>
							</td>
						</tr>
						<tr>
							<td class="tdborder">
								待遇要求:
							</td>
							<td class="tdborder">
								<b>${etalent.tadeal}</b>
							</td>
							<td class="tdborder">
								工作年限:
							</td>
							<td class="tdborder">
								<b>${etalent.taworkyear}</b>
							</td>
						</tr>
						<tr>
							<td class="tdborder">
								到岗时间:
							</td>
							<td class="tdborder">
								<b>${etalent.tatoworktime}</b>
							</td>
							<td class="tdborder">
								培训:
							</td>
							<td class="tdborder">
								<b>${etalent.taeducate}</b>
							</td>
						</tr>
						<tr>
							<td class="tdborder">
								工作经历:
							</td>
							<td class="tdborder">
								<b>${etalent.tawork}</b>
							</td>
							<td class="tdborder">
								技能特长:
							</td>
							<td class="tdborder">
								<b>${etalent.taskill}</b>
							</td>
						</tr>
						<tr>
							<td class="tdborder">
								自我评价:
							</td>
							<td class="tdborder" colspan="3">
								<b>${etalent.taother}</b>
							</td>
						</tr>
						<tr>
							<td class="tdborder">
								发布时间:
							</td>
							<td class="tdborder">
								<b>${etalent.taaddtime}</b>
							</td>
							<td class="tdborder">
								照片路径:
							</td>
							<td class="tdborder">
								<b>${etalent.tapic}</b>
							</td>
						</tr>
					</table>
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