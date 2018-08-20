<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib uri="/struts-tags" prefix="s"%>
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
	</head>

	<body>
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="6">
					<img src="ewssite/images/tleft.jpg" width="6" height="28" />
				</td>
				<td class="top">
					招聘信息列表
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
					<table width="98%" border="0" cellspacing="0" cellpadding="4"
						style="margin: 10px 10px 0px 10px" class="listborder">
						<tr>
							<td colspan="6" class="toolsbar" height="27px">
								&nbsp;
								<img src="resources/icons/add.gif">
								<a href="ewssite/model/job/addEjobs.jsp">添加</a>
							</td>
						</tr>
						<tr class="titlebar" height="23px">
							<td width="10%" class="tdborder">
								编号
							</td>
							<td width="25%" class="tdborder">
								招聘岗位
							</td>
							<td width="10%" class="tdborder">
								应聘人数
							</td>
							<td width="10%" class="tdborder">
								招聘人数
							</td>
							<td width="20%" class="tdborder">
								发布时间
							</td>
							<td width="20%" class="tdborder">
								操作
							</td>
						</tr>
						<s:iterator value="listEjobs">
							<tr align="center" class="trbg">
								<td>
									<s:property value="jid" />
								</td>
								<td>
									<a href="detailsEjobs.aspx?ejobs.jid=<s:property value='jid'/>"><s:property value="jtitle" /></a>
								</td>
								<td>
									<s:property value="etalents.size()" />
								</td>
								<td>
									<s:property value="jpeople" />
								</td>
								<td>
									<s:property value="jstart" />
								</td>
								<td>
									<a href="initEditEjobs.aspx?ejobs.jid=<s:property value='jid'/>">修改</a>/
									<a href="deleteEjobs.aspx?ejobs.jid=<s:property value='jid'/>">删除</a>/
									<c:choose>
										<c:when test="${jdisplay==0}">
											<a href="jdisplayEjobs.aspx?ejobs.jid=<s:property value='jid'/>&ejobs.jdisplay=0">显示</a>
										</c:when>
										<c:otherwise>
											<a href="jdisplayEjobs.aspx?ejobs.jid=<s:property value='jid'/>&ejobs.jdisplay=1">隐藏</a>
										</c:otherwise>
									</c:choose>
								</td>
							</tr>
						</s:iterator>
					</table>
					<table width="98%" border="0" cellspacing="0" cellpadding="0"
						style="margin: 0px 10px 10px 10px">
						<tr>
							<td height="25px" align="right" class="pagebar">
								<div style="padding-right: 15px">
									${pagination}
								</div>
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