<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
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
  <script language=JavaScript>
<!--
function CheckForm()
{
  if(myform.aztitle.value==''){
    alert('版位名称不能为空！');
    myform.aztitle.focus();
    return false;
  }
 
    if(myform.azwidth.value==''){
      alert('版位宽度不能为空！');
      myform.azwidth.focus();
       return false;
    }else{
      var mem_value = myform.azwidth.value;
	  for(var i=0; i<mem_value.length; i++)
	  {
		if(mem_value.charAt(i)<'0' || mem_value.charAt(i)>'9')
		{
		alert("版位宽度只能是数字");
		return false;
		}
	  }
      return true;
    }
    if(myform.azheight.value==''){
      alert('版位高度不能为空！');
      myform.azheight.focus();
      return false;
    }else{
     var mem_value = myform.azheight.value;
	  for(var i=0; i<mem_value.length; i++)
	  {
		if(mem_value.charAt(i)<'0' || mem_value.charAt(i)>'9')
		{
		alert("版位高度只能是数字");
		return false;
		}
	  }
      return true;
    }

  return true;
}

function Change_Setting()
{
  if(document.myform.ZoneType[0].checked == false) {
    document.myform.ShowType[2].disabled = true;
    if (document.myform.ShowType[2].checked == true)
    document.myform.ShowType[0].checked = true;
  } else
    document.myform.ShowType[2].disabled = false;
}

//-->
</script>
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
      <a href='Admin_Advertisement.asp?Action=ZoneList'>广告版位管理</a>&nbsp;|&nbsp;  
      <a href='Admin_Advertisement.asp?Action=AddZone'>添加新版位</a>&nbsp;|&nbsp; 
      <a href='Admin_Advertisement.asp?Action=ADList'>网站广告管理</a>&nbsp;|&nbsp; 
      <a href='Admin_Advertisement.asp?Action=AddAD'>添加新广告</a>&nbsp;|&nbsp; 
      <a href='Admin_Advertisement.asp?Action=ZoneJSTemplate'>广告JS模板</a>&nbsp;|&nbsp;
     <a href='Admin_UploadFile.asp?UploadDir=UploadAdPic'>广告上传图片管理</a>&nbsp;|&nbsp; 
     <a href='Admin_Advertisement.asp?Action=Import'>导入版位</a>&nbsp;|&nbsp; 
     <a href='Admin_Advertisement.asp?Action=Export'>导出版位</a>&nbsp;|&nbsp; 
    </td>
  </tr>
</table>
<br>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="6"><img src="ewssite/images/tleft.jpg" width="6" height="28" /></td>
    <td class="top">添加版位</td>
    <td width="6"><img src="ewssite/images/tright.jpg" width="6" height="28" /></td>
  </tr>
  <tr>
    <td class="mleft">&nbsp;</td>
    <td>
    
<form name="myform" onSubmit='return CheckForm();' action="addEadzone.aspx">
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="27%" height="30"><strong>所属频道分类：</strong><br />
      此分类只用于区分版位所在的位置</td>
    <td width="73%">
    <select name='eadzone.azchid' >
    <option value='0' selected>首页</option>
    <s:iterator value="listEchannels" id="echannels">
    <option value="${echannels.chid}">${echannels.chtitle}</option>
    </s:iterator>
    </select></td>
  </tr>
  <tr>
    <td><strong>版位名称：</strong></td>
    <td><input name='eadzone.zatitle' type='text' id='aztitle' size='60' maxlength='60' value=''> <font color='red'>*</font> </td>
  </tr>
  <tr>
    <td><strong>生成htm文件名：</strong></td>
    <td> <input name='eadzone.azjstitle' type='text' id='azjstitle' size='60' maxlength='100' value='201106/3.htm'> <font color='red'>*</font>  </td>
  </tr>
  <tr>
    <td><strong>版位描述：</strong></td>
    <td><textarea name='eadzone.azintro' cols='50' rows='3' id='azintro'></textarea></td>
  </tr>
  <tr>
    <td><strong>版位类型：</strong><br> 
   选择放置于此版位的广告类型</td>
    <td><input type='radio' name='eadzone.aztype' value='0'  id="ZoneType" checked> 矩形横幅&nbsp; 
    <input type='radio' name='eadzone.aztype' value='1' id="ZoneType" onclick='Change_Setting();' > 弹出窗口&nbsp;
      <input type='radio' name='eadzone.aztype' value='2' id="ZoneType"  onclick='Change_Setting();' >
       漂浮移动&nbsp; <input type='radio' name='eadzone.aztype' value='3' id="ZoneType" onclick='Change_Setting();' >
        对联广告&nbsp; </td>
  </tr>
  <tr>
    <td><strong>版位尺寸：</strong></td>
    <td>
  宽度: <input name='eadzone.azwidth' id="azwidth" size='5' maxlength='4'  value='468'>
   &nbsp;&nbsp;&nbsp;&nbsp; 高度:  <input name='eadzone.azheight' id="azheight" size='5' maxlength='4'  value='60'>              <font color='red'>*</font>    
   
    </td>
  </tr>
  <tr>
    <td><strong>显示方式：</strong><br>
    当版位中有多个广告时按照此设定进行显示（依据广告的权重）</td>
    <td><input name='eadzone.azshowtype' id="ShowType" type='radio' value='0' checked> 按权重随机显示&nbsp;&nbsp;权重越大显示机会越大。<br> 
	    <input name='eadzone.azshowtype' id="ShowType" type='radio' value='1'> 按权重优先显示&nbsp;&nbsp;显示权重值最大的广告。<br>  
		 <input name='eadzone.azshowtype' id="ShowType" type='radio' value='2'> 按顺序循环显示&nbsp;&nbsp;此方式仅对矩形横幅有效。</td>
  </tr>
  <tr>
    <td><strong>版位状态：</strong><br />
      设为活动的版位才能在前台显示</td>
    <td><input name='eadzone.azdisplay' type='checkbox'  value='0' checked> 活动版位      </td>
  </tr>
  <tr >
    <td colspan="2" align="center"><input  type='submit'  value='   ' class="ewssub">&nbsp;&nbsp;    
	    <input type="reset"  value='  ' class="ewsreset"></td>
    </tr>
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