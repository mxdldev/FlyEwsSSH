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
  if(myform.ADName.value==''){
    alert('广告名称不能为空！');
    myform.ADName.focus();
    return false;
  }
  if(myform.ADType[0].checked == true && myform.ImgUrl.value==''){
    alert('图片地址不能为空！');
    myform.ImgUrl.focus();
    return false;
  }
  if(myform.ADType[1].checked == true && myform.FlashUrl.value==''){
    alert('动画地址不能为空！');
    myform.FlashUrl.focus();
    return false;
  }
  if(myform.ADType[2].checked == true && myform.ADText.value==''){
    alert('广告文本不能为空！');
    myform.ADText.focus();
    return false;
  }
  if(myform.ADType[3].checked == true && myform.ADCode.value==''){
    alert('广告代码不能为空！');
    myform.ADCode.focus();
    return false;
  }
  if(myform.Priority.value==''){
    alert('广告权重不能为空！');
    myform.Priority.focus();
    return false;
  }
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
    <td class="top">添加广告</td>
    <td width="6"><img src="ewssite/images/tright.jpg" width="6" height="28" /></td>
  </tr>
  <tr>
    <td class="mleft">&nbsp;</td>
    <td>
    
<form name="myform" onSubmit='return CheckForm();' action="addEadzone.aspx">

 <table width='100%' border='0' align='center' cellpadding='0' cellspacing='0' class='border'>
    <tr align='center'>  
	    <td  valign='top' width='255'>   
		     <table width='100%' border='0' cellpadding='2' cellspacing='1'>  
			         <tr>          
					   <td align='center'><b>所属版位</b></td>    
					 </tr> 
					<tr>
					  <td> 
					   <select name='ZoneID' size='2' multiple style='height:360px;width:250px;'>
					   <option value='6'>【网站通用】7676</option><option value='5'>【网站通用】tyut</option>
					   <option value='4'>【网站通用】yy</option><option value='3'>【网站通用】65</option>
					   <option value='1'>【网站通用】gg</option><option value='7' selected>【网站首页】7</option>
					   <option value='2'>【网站首页】rr</option>   
					 </select>  
			        </td>     
				 </tr>
			</table> 
		</td> 
		<td valign='top'> 
		  <table width='100%' border='0' cellpadding='2' cellspacing='1'>
		      <tr >   
			  <td width='70' align='right'><strong>广告名称：</strong></td> 
			  <td width="664"> <input name='ADName' type='text' id='ADName' size='58' maxlength='255' value=''>
			  <font color='red'>*</font> </td>  
			  </tr>  
			  <tr >
			  <td width='70' align='right'><strong>广告类型：</strong></td>   
			   <td><input type='radio' name='ADType' value='1' onclick='Change_ADType();' checked> 图片&nbsp;&nbsp;
			   <input type='radio' name='ADType' value='2' onclick='Change_ADType();'> 动画&nbsp;&nbsp;  
			   </td> 
			   </tr> 
			    <tr >
				 <td width='70' align='right'><strong>广告内容：</strong></td> 
				  <td height='266' valign='top'>  
				  <table id='ADContent_1' width='100%' border='0' cellpadding='2' cellspacing='1' bgcolor='#ffffff' style='display:'>                <tr align='center' class='tdbg2'> 
				   <td colspan='2'><strong>广告内容设置--图片</strong></td> 
				 </tr> 
				  <tr > 
				  <td width='80' height="32" align='right'>图片地址：</td>                  
 <td>                    <input name='ImgUrl' type='text' id='ImgUrl' size='58' maxlength='255' value=''>                    <font color='red'>*</font></td>  
               </tr>          
			         <tr > 
				 <td width='80' align='right'>图片上传：</td> 
				  <td> <iframe style='top:2px' ID='uploadPhoto' src='Upload.asp?dialogtype=AdPic' frameborder=0 scrolling=no width='360' height='25'></iframe> </td>       
				    </tr>          
				<tr > 
				 <td width='80' height="29" align='right'>图片尺寸：</td>                  
                  <td>  宽：<input name='ImgWidth' type='text' id='ImgWidth' size='6' maxlength='5' value=''> 
				   像素&nbsp;&nbsp;&nbsp;&nbsp; 
				    高：<input name='ImgHeight' type='text' id='ImgHeight' size='6' maxlength='5' value=''> 
					 像素 </td> 
				 </tr> 
				<tr > 
				<td width='80' height="40" align='right'>链接地址：</td>                  
                <td> <input name='LinkUrl' type='text' id='LinkUrl' value='http://' size='58' maxlength='255'>  </td>                </tr>
				<tr> <td width='80' height="42" align='right'>链接提示：</td>                  
                 <td> <input name='LinkAlt' type='text' id='LinkAlt' value='' size='58' maxlength='255'>                  </td>                </tr>
                <tr >
				<td width='80' align='right'>广告简介：</td>
				 <td> <textarea name='ADIntro' cols='48' rows='4' id='ADIntro'></textarea> </td>
				</tr>           
			</table> 
			<table id='ADContent_2' width='100%' border='0' cellpadding='2' cellspacing='1' bgcolor='#ffffff' style='display:none'>                <tr align='center' class='tdbg2'> 
			      <td colspan='2'><strong>广告内容设置--动画</strong></td>  
			    </tr> 
				 <tr > 
				   <td width='80' align='right'>动画地址：</td> 
				   <td>
				   <input name='FlashUrl' type='text' id='FlashUrl' size='58' maxlength='255' value=''>
				    <font color='red'>*</font>
					</td>
					</tr> 
					 <tr >
					  <td width='80' align='right'>动画上传：</td>
					  <td> <iframe style='top:2px' ID='uploadPhoto' src='Upload.asp?dialogtype=AdPic' frameborder=0 scrolling=no width='360' height='25'></iframe> 
					  </td>              
				    </tr> 
					<tr >  
					 <td width='80' align='right'>动画尺寸：</td>  
					  <td>宽：<input name='FlashWidth' type='text' id='FlashWidth' size='6' maxlength='5' value=''>                    像素&nbsp;&nbsp;&nbsp;&nbsp; 高：<input name='FlashHeight' type='text' id='FlashHeight' size='6' maxlength='5' value=''>                    像素
				     </td>  
					 </tr> 
					 <tr > 
					  <td width='80' align='right'>背景透明：</td> 
					  <td> <input type='radio' name='FlashWmode' value='0' checked> 不透明&nbsp;&nbsp;  <input type='radio' name='FlashWmode' value='1'> 透明&nbsp;&nbsp;  
					  </td> 
					 </tr> 
					 </table> 
					
	              </td>  
				 </tr> 
				  <tr > 
				   <td width='70' align='right'><strong>广告权重：</strong></td>   
				    <td> 
					<input name='Priority' type='text' id='Priority' size='4' maxlength='3' value='1'> <font color='red'>*</font> 此项为版位广告随机显示时的优先权，权重越大显示机会越大。            </td>  
				 </tr>
			 <tr >  
			   <td width='70' align='right'><strong>广告统计：</strong></td>   
			     <td> 
				 <input name='CountView' type='checkbox' id='CountView' value='yes'> 统计浏览数  浏览数：<input name='Views' type='text' id='Views' size='5' maxlength='6' value=''>              &nbsp;&nbsp;&nbsp;&nbsp;<input name='CountClick' type='checkbox' id='CountClick' value='yes'> 统计点击数  点击数：<input name='Clicks' type='text' id='Clicks' size='5' maxlength='6' value=''>                </td>    
			 </tr>     
			 <tr >       
			      <td width='70' align='right'><strong>审核状态：</strong></td>   
				   <td>  <input name='Passed' type='checkbox' id='Passed' value='yes' checked> 通过审核            </td>   
		     </tr>      
			   </table>     
			    </td>    
				</tr>  </table> 
				 <table width='100%' border='0' align='center' cellpadding='2' cellspacing='1'>    <tr>      <td height='40' colspan='2' align='center'>        <input name='Action' type='hidden' id='Action' value='SaveAddAD'>        <input type='submit' name='Submit' value=' 添 加 '>      </td>    </tr>  </table>
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