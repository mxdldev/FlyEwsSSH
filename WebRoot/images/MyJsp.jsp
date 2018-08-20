<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!-- saved from url=(0054)http://10.17.255.140:8080/houseProject/house/infos.jsp -->
<!-- 由开发人员工具生成。它可能不是原始源文件的准确表示形式 -->
<HTML><HEAD><TITLE>HR Manager Project - base on SSH Framework</TITLE>
<META content=no-cache http-equiv=pragma>
<META content=no-cache http-equiv=cache-control>
<LINK rel=stylesheet type=text/css href="../resources/css/ext-all.css">
<LINK id=test rel=stylesheet type=text/css>
<SCRIPT type=text/javascript src="../resources/js/ext-base.js"></SCRIPT>

<SCRIPT type=text/javascript src="../resources/js/ext-all.js"></SCRIPT>

<SCRIPT type=text/javascript src="dwr/engine.js"></SCRIPT>

<SCRIPT type=text/javascript src="dwr/util.js"></SCRIPT>

<SCRIPT type=text/javascript src="../resources/js/ext-lang-zh_CN.js"></SCRIPT>

<SCRIPT type=text/javascript src="dwr/interface/houseService.js"></SCRIPT>

<SCRIPT type=text/javascript src="../resources/js/pager.js"></SCRIPT>

<SCRIPT type=text/javascript src="../resources/js/init-house.js"></SCRIPT>

<SCRIPT type=text/javascript src="../resources/js/changeColor.js"></SCRIPT>

<STYLE type=text/css>#button-grid .x-panel-body {
	BORDER-BOTTOM: #99bbe8 1px solid; BORDER-LEFT: #99bbe8 1px solid; BORDER-TOP: 0px; BORDER-RIGHT: #99bbe8 1px solid
}
.icon-grid {
	BACKGROUND-IMAGE: url(../resources/resources/icons/grid.png) !important
}
.add {
	BACKGROUND-IMAGE: url(../resources/icons/add.gif) !important
}
.option {
	BACKGROUND-IMAGE: url(../resources/icons/plugin.gif) !important
}
.remove {
	BACKGROUND-IMAGE: url(../resources/icons/delete.gif) !important
}
.copy {
	BACKGROUND-IMAGE: url(../resources/icons/folder_go.png) !important
}
.import {
	BACKGROUND-IMAGE: url(../resources/icons/arrow-up.gif) !important
}
.export {
	BACKGROUND-IMAGE: url(../resources/icons/arrow-down.gif) !important
}
.print {
	BACKGROUND-IMAGE: url(../resources/icons/feed_add.png) !important
}
.refresh {
	BACKGROUND-IMAGE: url(../resources/icons/table_refresh.png) !important
}
.details {
	BACKGROUND-IMAGE: url(../resources/icons/rss_go.png) !important
}
</STYLE>
</HEAD>
<BODY id=ext-gen6 class=" ext-ie ext-ie6 ext-border-box" onload=changeskin(parent.skino,parent.skini)>
<DIV id=add-window class=x-hidden>
<DIV class=x-window-header>添加房屋信息</DIV>
<DIV id=content></DIV></DIV>
<DIV style="WIDTH: 800px" id=ext-comp-1001 class="x-panel x-form-label-left">
<DIV class=x-panel-tl>
<DIV class=x-panel-tr>
<DIV class=x-panel-tc>
<DIV style="MozUserSelect: none; KhtmlUserSelect: none" id=ext-gen7 class="x-panel-header x-unselectable" unselectable="on">
<DIV id=ext-gen12 class="x-tool x-tool-toggle">&nbsp;</DIV><SPAN id=ext-gen34 class=x-panel-header-text>查询房屋信息</SPAN></DIV></DIV></DIV></DIV>
<DIV id=ext-gen8 class=x-panel-bwrap>
<DIV class=x-panel-ml>
<DIV class=x-panel-mr>
<DIV class=x-panel-mc>
<DIV style="WIDTH: 788px; HEIGHT: auto" id=ext-gen9 class=x-panel-body>
<FORM id=ext-gen32 class=" x-form" method=post>
<DIV class="x-form-item " tabIndex=-1><LABEL style="WIDTH: 55px" class=x-form-item-label for=ext-comp-1002>标题:</LABEL>
<DIV style="PADDING-LEFT: 60px" id=x-form-el-ext-comp-1002 class=x-form-element>
<DIV id=ext-comp-1002 class=x-panel>
<DIV id=ext-gen35 class=x-panel-bwrap>
<DIV id=ext-gen36 class="x-panel-body x-panel-body-noheader x-column-layout-ct">
<DIV style="WIDTH: 725px" id=ext-gen41 class=x-column-inner><INPUT style="WIDTH: 120px" id=ext-comp-1003 class=" x-form-text x-form-field x-column" name=title autocomplete="off">
<DIV style="WIDTH: 290px" id=ext-comp-1004 class="x-panel x-form-label-left x-column">
<DIV id=ext-gen47 class=x-panel-bwrap>
<DIV style="WIDTH: 290px" id=ext-gen48 class="x-panel-body x-panel-body-noheader">
<DIV class="x-form-item " tabIndex=-1><LABEL style="WIDTH: 60px" class=x-form-item-label for=ext-comp-1005>发布日期:</LABEL>
<DIV style="PADDING-LEFT: 65px" id=x-form-el-ext-comp-1005 class=x-form-element>
<DIV style="WIDTH: 193px" id=ext-gen49 class=x-form-field-wrap><INPUT style="WIDTH: 176px" id=ext-comp-1005 class=" x-form-text x-form-field" size=10 name=booktime autocomplete="off"><IMG id=ext-gen50 class="x-form-trigger x-form-date-trigger" src="http://10.17.255.140:8080/houseProject/resources/images/default/s.gif"></DIV></DIV>
<DIV class=x-form-clear-left></DIV></DIV></DIV></DIV></DIV>
<DIV id=ext-gen42 class=x-clear></DIV></DIV></DIV></DIV></DIV></DIV>
<DIV class=x-form-clear-left></DIV></DIV>
<DIV class="x-form-item " tabIndex=-1><LABEL style="WIDTH: 55px" class=x-form-item-label for=ext-comp-1006>几室:</LABEL>
<DIV style="PADDING-LEFT: 60px" id=x-form-el-ext-comp-1006 class=x-form-element>
<DIV id=ext-comp-1006 class=x-panel>
<DIV id=ext-gen37 class=x-panel-bwrap>
<DIV id=ext-gen38 class="x-panel-body x-panel-body-noheader x-column-layout-ct">
<DIV style="WIDTH: 725px" id=ext-gen59 class=x-column-inner>
<DIV style="WIDTH: 105px" id=ext-gen61 class="x-form-field-wrap x-column"><INPUT id=room type=hidden name=room><INPUT style="WIDTH: 88px" id=ext-comp-1007 class=" x-form-text x-form-field x-combo-noedit x-form-empty-field" value=无限制！ readOnly size=24 autocomplete="off"><IMG id=ext-gen62 class="x-form-trigger x-form-arrow-trigger" src="http://10.17.255.140:8080/houseProject/resources/images/default/s.gif"></DIV>
<DIV style="WIDTH: 145px" id=ext-comp-1008 class="x-panel x-form-label-left x-column">
<DIV id=ext-gen73 class=x-panel-bwrap>
<DIV style="WIDTH: 145px" id=ext-gen74 class="x-panel-body x-panel-body-noheader">
<DIV class="x-form-item " tabIndex=-1><LABEL style="WIDTH: 40px" class=x-form-item-label for=ext-comp-1009>几厅:</LABEL>
<DIV style="PADDING-LEFT: 45px" id=x-form-el-ext-comp-1009 class=x-form-element>
<DIV style="WIDTH: 68px" id=ext-gen83 class=x-form-field-wrap><INPUT id=ting type=hidden name=ting><INPUT style="WIDTH: 51px" id=ext-comp-1009 class=" x-form-text x-form-field x-form-empty-field" value=无限制！ readOnly size=24 autocomplete="off"><IMG id=ext-gen84 class="x-form-trigger x-form-arrow-trigger" src="http://10.17.255.140:8080/houseProject/resources/images/default/s.gif"></DIV></DIV>
<DIV class=x-form-clear-left></DIV></DIV></DIV></DIV></DIV>
<DIV style="WIDTH: 108px" id=ext-comp-1010 class="x-panel x-form-label-left x-column">
<DIV id=ext-gen75 class=x-panel-bwrap>
<DIV style="WIDTH: 108px" id=ext-gen76 class="x-panel-body x-panel-body-noheader">
<DIV class="x-form-item " tabIndex=-1><LABEL style="WIDTH: 40px" class=x-form-item-label for=ext-comp-1011>租金:</LABEL>
<DIV style="PADDING-LEFT: 45px" id=x-form-el-ext-comp-1011 class=x-form-element><INPUT style="WIDTH: 54px" id=ext-comp-1011 class=" x-form-text x-form-field" name=priceStart autocomplete="off"></DIV>
<DIV class=x-form-clear-left></DIV></DIV></DIV></DIV></DIV>
<DIV style="WIDTH: 108px" id=ext-comp-1012 class="x-panel x-form-label-left x-column">
<DIV id=ext-gen77 class=x-panel-bwrap>
<DIV style="WIDTH: 108px" id=ext-gen78 class="x-panel-body x-panel-body-noheader">
<DIV class="x-form-item " tabIndex=-1><LABEL style="WIDTH: 10px" class=x-form-item-label for=ext-comp-1013>至</LABEL>
<DIV style="PADDING-LEFT: 15px" id=x-form-el-ext-comp-1013 class=x-form-element><INPUT style="WIDTH: 68px" id=ext-comp-1013 class=" x-form-text x-form-field" name=priceEnd autocomplete="off"></DIV>
<DIV class=x-form-clear-left></DIV></DIV></DIV></DIV></DIV>
<DIV style="WIDTH: 145px" id=ext-comp-1014 class="x-panel x-form-label-left x-column">
<DIV id=ext-gen79 class=x-panel-bwrap>
<DIV style="WIDTH: 145px" id=ext-gen80 class="x-panel-body x-panel-body-noheader">
<DIV class="x-form-item " tabIndex=-1><LABEL style="WIDTH: 40px" class=x-form-item-label for=ext-comp-1015>排序:</LABEL>
<DIV style="PADDING-LEFT: 45px" id=x-form-el-ext-comp-1015 class=x-form-element>
<DIV style="WIDTH: 68px" id=ext-gen103 class=x-form-check-wrap><INPUT id=ext-comp-1015 class=" x-form-radio x-form-field" value=asc CHECKED type=radio name=sortCond autocomplete="off"><LABEL id=ext-gen104 class=x-form-cb-label for=ext-comp-1015>升序</LABEL></DIV></DIV>
<DIV class=x-form-clear-left></DIV></DIV></DIV></DIV></DIV>
<DIV style="WIDTH: 108px" id=ext-comp-1016 class="x-panel x-form-label-left x-column">
<DIV id=ext-gen81 class=x-panel-bwrap>
<DIV style="WIDTH: 108px" id=ext-gen82 class="x-panel-body x-panel-body-noheader">
<DIV class="x-form-item " tabIndex=-1><LABEL style="WIDTH: 1px" class=x-form-item-label for=ext-comp-1017></LABEL>
<DIV style="PADDING-LEFT: 6px" id=x-form-el-ext-comp-1017 class=x-form-element>
<DIV style="WIDTH: 77px" id=ext-gen110 class=x-form-check-wrap><INPUT id=ext-comp-1017 class=" x-form-radio x-form-field" value=desc type=radio name=sortCond autocomplete="off"><LABEL id=ext-gen111 class=x-form-cb-label for=ext-comp-1017>降序</LABEL></DIV></DIV>
<DIV class=x-form-clear-left></DIV></DIV></DIV></DIV></DIV>
<DIV id=ext-gen60 class=x-clear></DIV></DIV></DIV></DIV></DIV></DIV>
<DIV class=x-form-clear-left></DIV></DIV>
<DIV class="x-form-item " tabIndex=-1><LABEL style="WIDTH: 55px" class=x-form-item-label for=ext-comp-1018>区域:</LABEL>
<DIV style="PADDING-LEFT: 60px" id=x-form-el-ext-comp-1018 class=x-form-element>
<DIV id=ext-comp-1018 class=x-panel>
<DIV id=ext-gen39 class=x-panel-bwrap>
<DIV id=ext-gen40 class="x-panel-body x-panel-body-noheader x-column-layout-ct">
<DIV style="WIDTH: 725px" id=ext-gen117 class=x-column-inner>
<DIV style="WIDTH: 214px" id=ext-gen119 class="x-form-field-wrap x-column"><INPUT id=area type=hidden name=area><INPUT style="WIDTH: 197px" id=parent_id class=" x-form-text x-form-field x-combo-noedit x-form-empty-field" value=请选择区域... readOnly size=24 autocomplete="off"><IMG id=ext-gen120 class="x-form-trigger x-form-arrow-trigger" src="http://10.17.255.140:8080/houseProject/resources/images/default/s.gif"></DIV>
<DIV style="WIDTH: 214px" id=ext-gen131 class="x-form-field-wrap x-column"><INPUT id=street type=hidden name=street><INPUT style="WIDTH: 197px" id=child_id class=" x-form-text x-form-field x-combo-noedit x-form-empty-field" value=请选择街道... readOnly size=24 autocomplete="off"><IMG id=ext-gen132 class="x-form-trigger x-form-arrow-trigger" src="http://10.17.255.140:8080/houseProject/resources/images/default/s.gif"></DIV>
<DIV id=ext-gen118 class=x-clear></DIV></DIV></DIV></DIV></DIV></DIV>
<DIV class=x-form-clear-left></DIV></DIV></FORM></DIV></DIV></DIV></DIV>
<DIV class=x-panel-bl>
<DIV class=x-panel-br>
<DIV class=x-panel-bc>
<DIV id=ext-gen10 class=x-panel-footer>
<DIV class=x-panel-btns-ct>
<DIV class="x-panel-btns x-panel-btns-center">
<TABLE cellSpacing=0>
<TBODY>
<TR>
<TD id=ext-gen16 class=x-panel-btn-td>
<TABLE style="WIDTH: 75px" id=ext-comp-1019 class="x-btn-wrap x-btn" border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD class=x-btn-left><I>&nbsp;</I></TD>
<TD class=x-btn-center><EM unselectable="on"><BUTTON id=ext-gen18 class=x-btn-text>确定</BUTTON></EM></TD>
<TD class=x-btn-right><I>&nbsp;</I></TD></TR></TBODY></TABLE></TD>
<TD id=ext-gen24 class=x-panel-btn-td>
<TABLE style="WIDTH: 75px" id=ext-comp-1020 class="x-btn-wrap x-btn" border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD class=x-btn-left><I>&nbsp;</I></TD>
<TD class=x-btn-center><EM unselectable="on"><BUTTON id=ext-gen26 class=x-btn-text>取消</BUTTON></EM></TD>
<TD class=x-btn-right><I>&nbsp;</I></TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE>
<DIV class=x-clear></DIV></DIV></DIV></DIV></DIV></DIV></DIV></DIV></DIV>
<DIV style="WIDTH: 800px" id=button-grid class="x-panel x-panel-noborder x-grid-panel">
<DIV style="MozUserSelect: none; KhtmlUserSelect: none" id=ext-gen146 class="x-panel-header x-panel-header-noborder x-unselectable" unselectable="on"><IMG class="x-panel-inline-icon icon-grid" src="http://10.17.255.140:8080/houseProject/resources/images/default/s.gif"><SPAN id=ext-gen346 class=x-panel-header-text>房屋信息列表</SPAN></DIV>
<DIV id=ext-gen147 class=x-panel-bwrap>
<DIV id=ext-gen148 class="x-panel-tbar x-panel-tbar-noborder">
<DIV id=ext-comp-1024 class="x-toolbar x-small-editor">
<TABLE cellSpacing=0>
<TBODY>
<TR>
<TD id=ext-gen152>
<TABLE style="WIDTH: auto" id=houseAddBtn class="x-btn-wrap x-btn x-btn-text-icon" border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD class=x-btn-left><I>&nbsp;</I></TD>
<TD class=x-btn-center><EM unselectable="on"><BUTTON id=ext-gen154 class="x-btn-text add" qtip="发布一条房屋信息">发布</BUTTON></EM></TD>
<TD class=x-btn-right><I>&nbsp;</I></TD></TR></TBODY></TABLE></TD>
<TD><SPAN id=ext-gen160 class=ytb-sep></SPAN></TD>
<TD id=ext-gen161>
<TABLE style="WIDTH: auto" id=houseEditBtn class="x-btn-wrap x-btn x-btn-text-icon" border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD class=x-btn-left><I>&nbsp;</I></TD>
<TD class=x-btn-center><EM unselectable="on"><BUTTON id=ext-gen163 class="x-btn-text option" qtip="修改一条房屋信息">编辑</BUTTON></EM></TD>
<TD class=x-btn-right><I>&nbsp;</I></TD></TR></TBODY></TABLE></TD>
<TD><SPAN id=ext-gen169 class=ytb-sep></SPAN></TD>
<TD id=ext-gen170>
<TABLE style="WIDTH: auto" id=houseDelBtn class="x-btn-wrap x-btn x-btn-text-icon" border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD class=x-btn-left><I>&nbsp;</I></TD>
<TD class=x-btn-center><EM unselectable="on"><BUTTON id=ext-gen172 class="x-btn-text remove" qtip="删除选择的房屋信息">删除</BUTTON></EM></TD>
<TD class=x-btn-right><I>&nbsp;</I></TD></TR></TBODY></TABLE></TD>
<TD><SPAN id=ext-gen178 class=ytb-sep></SPAN></TD>
<TD id=ext-gen179>
<TABLE style="WIDTH: auto" id=houseRefreshBtn class="x-btn-wrap x-btn x-btn-text-icon" border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD class=x-btn-left><I>&nbsp;</I></TD>
<TD class=x-btn-center><EM unselectable="on"><BUTTON id=ext-gen181 class="x-btn-text refresh" qtip="刷新房屋信息">刷新</BUTTON></EM></TD>
<TD class=x-btn-right><I>&nbsp;</I></TD></TR></TBODY></TABLE></TD>
<TD><SPAN id=ext-gen187 class=ytb-sep></SPAN></TD>
<TD id=ext-gen188>
<TABLE style="WIDTH: auto" id=houseCopyBtn class="x-btn-wrap x-btn x-btn-text-icon" border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD class=x-btn-left><I>&nbsp;</I></TD>
<TD class=x-btn-center><EM unselectable="on"><BUTTON id=ext-gen190 class="x-btn-text copy" qtip="复制添加选择的房屋信息">复制</BUTTON></EM></TD>
<TD class=x-btn-right><I>&nbsp;</I></TD></TR></TBODY></TABLE></TD>
<TD><SPAN id=ext-gen196 class=ytb-sep></SPAN></TD>
<TD id=ext-gen197>
<TABLE style="WIDTH: auto" id=houseImportBtn class="x-btn-wrap x-btn x-btn-text-icon" border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD class=x-btn-left><I>&nbsp;</I></TD>
<TD class=x-btn-center><EM unselectable="on"><BUTTON id=ext-gen199 class="x-btn-text import" qtip="批量导入房屋信息">导入</BUTTON></EM></TD>
<TD class=x-btn-right><I>&nbsp;</I></TD></TR></TBODY></TABLE></TD>
<TD><SPAN id=ext-gen205 class=ytb-sep></SPAN></TD>
<TD id=ext-gen206>
<TABLE style="WIDTH: auto" id=houseExportExcelBtn class="x-btn-wrap x-btn x-btn-text-icon" border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD class=x-btn-left><I>&nbsp;</I></TD>
<TD class=x-btn-center><EM unselectable="on"><BUTTON id=ext-gen208 class="x-btn-text export" qtip="导出房屋信息">导出Excel</BUTTON></EM></TD>
<TD class=x-btn-right><I>&nbsp;</I></TD></TR></TBODY></TABLE></TD>
<TD><SPAN id=ext-gen214 class=ytb-sep></SPAN></TD>
<TD id=ext-gen215>
<TABLE style="WIDTH: auto" id=houseExportPdfBtn class="x-btn-wrap x-btn x-btn-text-icon" border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD class=x-btn-left><I>&nbsp;</I></TD>
<TD class=x-btn-center><EM unselectable="on"><BUTTON id=ext-gen217 class="x-btn-text export" qtip="导出房屋信息">导出Pdf</BUTTON></EM></TD>
<TD class=x-btn-right><I>&nbsp;</I></TD></TR></TBODY></TABLE></TD>
<TD><SPAN id=ext-gen223 class=ytb-sep></SPAN></TD>
<TD id=ext-gen224>
<TABLE style="WIDTH: auto" id=housePrintBtn class="x-btn-wrap x-btn x-btn-text-icon" border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD class=x-btn-left><I>&nbsp;</I></TD>
<TD class=x-btn-center><EM unselectable="on"><BUTTON id=ext-gen226 class="x-btn-text print" qtip="打印房屋信息">打印</BUTTON></EM></TD>
<TD class=x-btn-right><I>&nbsp;</I></TD></TR></TBODY></TABLE></TD>
<TD><SPAN id=ext-gen232 class=ytb-sep></SPAN></TD>
<TD id=ext-gen233>
<TABLE style="WIDTH: auto" id=houseDetailBtn class="x-btn-wrap x-btn x-btn-text-icon" border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD class=x-btn-left><I>&nbsp;</I></TD>
<TD class=x-btn-center><EM unselectable="on"><BUTTON id=ext-gen235 class="x-btn-text details" qtip="查看所选房屋信息详情">详情</BUTTON></EM></TD>
<TD class=x-btn-right><I>&nbsp;</I></TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE></DIV></DIV>
<DIV style="WIDTH: 800px; HEIGHT: auto" id=ext-gen149 class="x-panel-body x-panel-body-noborder">
<DIV hideFocus id=ext-gen318 class=x-grid3>
<DIV id=ext-gen319 class=x-grid3-viewport>
<DIV id=ext-gen320 class=x-grid3-header>
<DIV id=ext-gen327 class=x-grid3-header-inner>
<DIV class=x-grid3-header-offset>
<TABLE style="WIDTH: 776px" border=0 cellSpacing=0 cellPadding=0>
<THEAD>
<TR class=x-grid3-hd-row>
<TD style="WIDTH: 20px" class="x-grid3-hd x-grid3-cell x-grid3-td-checker">
<DIV class="x-grid3-hd-inner x-grid3-hd-checker" unselectable="on"><A class=x-grid3-hd-btn href="http://10.17.255.140:8080/houseProject/house/infos.jsp#"></A>
<DIV class=x-grid3-hd-checker>&nbsp;</DIV><IMG class=x-grid3-sort-icon src="http://10.17.255.140:8080/houseProject/resources/images/default/s.gif"></DIV></TD>
<TD style="WIDTH: 56px" class="x-grid3-hd x-grid3-cell x-grid3-td-hid">
<DIV class="x-grid3-hd-inner x-grid3-hd-hid" unselectable="on"><A class=x-grid3-hd-btn href="http://10.17.255.140:8080/houseProject/house/infos.jsp#"></A>房屋号<IMG class=x-grid3-sort-icon src="http://10.17.255.140:8080/houseProject/resources/images/default/s.gif"></DIV></TD>
<TD style="WIDTH: 112px" class="x-grid3-hd x-grid3-cell x-grid3-td-2">
<DIV class="x-grid3-hd-inner x-grid3-hd-2" unselectable="on"><A class=x-grid3-hd-btn href="http://10.17.255.140:8080/houseProject/house/infos.jsp#"></A>房屋标题<IMG class=x-grid3-sort-icon src="http://10.17.255.140:8080/houseProject/resources/images/default/s.gif"></DIV></TD>
<TD style="WIDTH: 56px" class="x-grid3-hd x-grid3-cell x-grid3-td-3">
<DIV class="x-grid3-hd-inner x-grid3-hd-3" unselectable="on"><A class=x-grid3-hd-btn href="http://10.17.255.140:8080/houseProject/house/infos.jsp#"></A>联系人<IMG class=x-grid3-sort-icon src="http://10.17.255.140:8080/houseProject/resources/images/default/s.gif"></DIV></TD>
<TD style="WIDTH: 84px" class="x-grid3-hd x-grid3-cell x-grid3-td-4">
<DIV class="x-grid3-hd-inner x-grid3-hd-4" unselectable="on"><A class=x-grid3-hd-btn href="http://10.17.255.140:8080/houseProject/house/infos.jsp#"></A>联系电话<IMG class=x-grid3-sort-icon src="http://10.17.255.140:8080/houseProject/resources/images/default/s.gif"></DIV></TD>
<TD style="WIDTH: 84px" class="x-grid3-hd x-grid3-cell x-grid3-td-5">
<DIV class="x-grid3-hd-inner x-grid3-hd-5" unselectable="on"><A class=x-grid3-hd-btn href="http://10.17.255.140:8080/houseProject/house/infos.jsp#"></A>月租金<IMG class=x-grid3-sort-icon src="http://10.17.255.140:8080/houseProject/resources/images/default/s.gif"></DIV></TD>
<TD style="WIDTH: 84px" class="x-grid3-hd x-grid3-cell x-grid3-td-6">
<DIV class="x-grid3-hd-inner x-grid3-hd-6" unselectable="on"><A class=x-grid3-hd-btn href="http://10.17.255.140:8080/houseProject/house/infos.jsp#"></A>发布日期<IMG class=x-grid3-sort-icon src="http://10.17.255.140:8080/houseProject/resources/images/default/s.gif"></DIV></TD>
<TD style="WIDTH: 112px" class="x-grid3-hd x-grid3-cell x-grid3-td-7">
<DIV class="x-grid3-hd-inner x-grid3-hd-7" unselectable="on"><A class=x-grid3-hd-btn href="http://10.17.255.140:8080/houseProject/house/infos.jsp#"></A>房屋格局<IMG class=x-grid3-sort-icon src="http://10.17.255.140:8080/houseProject/resources/images/default/s.gif"></DIV></TD>
<TD style="WIDTH: 168px" class="x-grid3-hd x-grid3-cell x-grid3-td-8">
<DIV class="x-grid3-hd-inner x-grid3-hd-8" unselectable="on"><A class=x-grid3-hd-btn href="http://10.17.255.140:8080/houseProject/house/infos.jsp#"></A>街道地址<IMG class=x-grid3-sort-icon src="http://10.17.255.140:8080/houseProject/resources/images/default/s.gif"></DIV></TD></TR></THEAD>
<TBODY></TBODY></TABLE></DIV></DIV>
<DIV class=x-clear></DIV></DIV>
<DIV style="OVERFLOW-X: hidden; OVERFLOW: visible" id=ext-gen321 class=x-grid3-scroller>
<DIV id=ext-gen322 class=x-grid3-body>
<DIV style="WIDTH: 776px" class="x-grid3-row " rowIndex="0">
<TABLE style="WIDTH: 776px" class=x-grid3-row-table border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD style="WIDTH: 20px" class="x-grid3-col x-grid3-cell x-grid3-td-checker x-grid3-cell-first " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-checker" unselectable="on">
<DIV class=x-grid3-row-checker>&nbsp;</DIV></DIV></TD>
<TD style="WIDTH: 56px" class="x-grid3-col x-grid3-cell x-grid3-td-hid " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-hid" unselectable="on">1</DIV></TD>
<TD style="WIDTH: 112px" class="x-grid3-col x-grid3-cell x-grid3-td-2 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-2" unselectable="on">不错的新房子哦！</DIV></TD>
<TD style="WIDTH: 56px" class="x-grid3-col x-grid3-cell x-grid3-td-3 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-3" unselectable="on">张先生</DIV></TD>
<TD style="WIDTH: 84px" class="x-grid3-col x-grid3-cell x-grid3-td-4 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-4" unselectable="on">13621546513</DIV></TD>
<TD style="WIDTH: 84px" class="x-grid3-col x-grid3-cell x-grid3-td-5 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-5" unselectable="on"><SPAN style="COLOR: green; FONT-WEIGHT: bold">1000</SPAN>元</DIV></TD>
<TD style="WIDTH: 84px" class="x-grid3-col x-grid3-cell x-grid3-td-6 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-6" unselectable="on">2008-10-12</DIV></TD>
<TD style="WIDTH: 112px" class="x-grid3-col x-grid3-cell x-grid3-td-7 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-7" unselectable="on">2��1��</DIV></TD>
<TD style="WIDTH: 168px" class="x-grid3-col x-grid3-cell x-grid3-td-8 x-grid3-cell-last " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-8" unselectable="on">硚口区崇仁路</DIV></TD></TR></TBODY></TABLE></DIV>
<DIV style="WIDTH: 776px" class="x-grid3-row x-grid3-row-alt" rowIndex="1">
<TABLE style="WIDTH: 776px" class=x-grid3-row-table border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD style="WIDTH: 20px" class="x-grid3-col x-grid3-cell x-grid3-td-checker x-grid3-cell-first " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-checker" unselectable="on">
<DIV class=x-grid3-row-checker>&nbsp;</DIV></DIV></TD>
<TD style="WIDTH: 56px" class="x-grid3-col x-grid3-cell x-grid3-td-hid " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-hid" unselectable="on">2</DIV></TD>
<TD style="WIDTH: 112px" class="x-grid3-col x-grid3-cell x-grid3-td-2 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-2" unselectable="on">风水不错！</DIV></TD>
<TD style="WIDTH: 56px" class="x-grid3-col x-grid3-cell x-grid3-td-3 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-3" unselectable="on">李先生</DIV></TD>
<TD style="WIDTH: 84px" class="x-grid3-col x-grid3-cell x-grid3-td-4 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-4" unselectable="on">13871546513</DIV></TD>
<TD style="WIDTH: 84px" class="x-grid3-col x-grid3-cell x-grid3-td-5 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-5" unselectable="on"><SPAN style="COLOR: red; FONT-WEIGHT: bold">1600</SPAN>元</DIV></TD>
<TD style="WIDTH: 84px" class="x-grid3-col x-grid3-cell x-grid3-td-6 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-6" unselectable="on">2008-08-21</DIV></TD>
<TD style="WIDTH: 112px" class="x-grid3-col x-grid3-cell x-grid3-td-7 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-7" unselectable="on">2��2��</DIV></TD>
<TD style="WIDTH: 168px" class="x-grid3-col x-grid3-cell x-grid3-td-8 x-grid3-cell-last " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-8" unselectable="on">洪山区珞狮路</DIV></TD></TR></TBODY></TABLE></DIV>
<DIV style="WIDTH: 776px" class="x-grid3-row " rowIndex="2">
<TABLE style="WIDTH: 776px" class=x-grid3-row-table border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD style="WIDTH: 20px" class="x-grid3-col x-grid3-cell x-grid3-td-checker x-grid3-cell-first " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-checker" unselectable="on">
<DIV class=x-grid3-row-checker>&nbsp;</DIV></DIV></TD>
<TD style="WIDTH: 56px" class="x-grid3-col x-grid3-cell x-grid3-td-hid " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-hid" unselectable="on">5</DIV></TD>
<TD style="WIDTH: 112px" class="x-grid3-col x-grid3-cell x-grid3-td-2 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-2" unselectable="on">不错的新房子哦！</DIV></TD>
<TD style="WIDTH: 56px" class="x-grid3-col x-grid3-cell x-grid3-td-3 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-3" unselectable="on">秦小姐</DIV></TD>
<TD style="WIDTH: 84px" class="x-grid3-col x-grid3-cell x-grid3-td-4 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-4" unselectable="on">13029806513</DIV></TD>
<TD style="WIDTH: 84px" class="x-grid3-col x-grid3-cell x-grid3-td-5 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-5" unselectable="on"><SPAN style="COLOR: red; FONT-WEIGHT: bold">2200</SPAN>元</DIV></TD>
<TD style="WIDTH: 84px" class="x-grid3-col x-grid3-cell x-grid3-td-6 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-6" unselectable="on">2008-10-12</DIV></TD>
<TD style="WIDTH: 112px" class="x-grid3-col x-grid3-cell x-grid3-td-7 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-7" unselectable="on">3��3��</DIV></TD>
<TD style="WIDTH: 168px" class="x-grid3-col x-grid3-cell x-grid3-td-8 x-grid3-cell-last " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-8" unselectable="on">洪山区珞狮路</DIV></TD></TR></TBODY></TABLE></DIV>
<DIV style="WIDTH: 776px" class="x-grid3-row x-grid3-row-alt" rowIndex="3">
<TABLE style="WIDTH: 776px" class=x-grid3-row-table border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD style="WIDTH: 20px" class="x-grid3-col x-grid3-cell x-grid3-td-checker x-grid3-cell-first " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-checker" unselectable="on">
<DIV class=x-grid3-row-checker>&nbsp;</DIV></DIV></TD>
<TD style="WIDTH: 56px" class="x-grid3-col x-grid3-cell x-grid3-td-hid " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-hid" unselectable="on">9</DIV></TD>
<TD style="WIDTH: 112px" class="x-grid3-col x-grid3-cell x-grid3-td-2 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-2" unselectable="on">不错的新房子哦！</DIV></TD>
<TD style="WIDTH: 56px" class="x-grid3-col x-grid3-cell x-grid3-td-3 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-3" unselectable="on">张先生</DIV></TD>
<TD style="WIDTH: 84px" class="x-grid3-col x-grid3-cell x-grid3-td-4 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-4" unselectable="on">13112546513</DIV></TD>
<TD style="WIDTH: 84px" class="x-grid3-col x-grid3-cell x-grid3-td-5 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-5" unselectable="on"><SPAN style="COLOR: green; FONT-WEIGHT: bold">1000</SPAN>元</DIV></TD>
<TD style="WIDTH: 84px" class="x-grid3-col x-grid3-cell x-grid3-td-6 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-6" unselectable="on">2008-09-03</DIV></TD>
<TD style="WIDTH: 112px" class="x-grid3-col x-grid3-cell x-grid3-td-7 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-7" unselectable="on">3��3��</DIV></TD>
<TD style="WIDTH: 168px" class="x-grid3-col x-grid3-cell x-grid3-td-8 x-grid3-cell-last " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-8" unselectable="on">江岸区沿江大道</DIV></TD></TR></TBODY></TABLE></DIV>
<DIV style="WIDTH: 776px" class="x-grid3-row " rowIndex="4">
<TABLE style="WIDTH: 776px" class=x-grid3-row-table border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD style="WIDTH: 20px" class="x-grid3-col x-grid3-cell x-grid3-td-checker x-grid3-cell-first " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-checker" unselectable="on">
<DIV class=x-grid3-row-checker>&nbsp;</DIV></DIV></TD>
<TD style="WIDTH: 56px" class="x-grid3-col x-grid3-cell x-grid3-td-hid " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-hid" unselectable="on">22</DIV></TD>
<TD style="WIDTH: 112px" class="x-grid3-col x-grid3-cell x-grid3-td-2 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-2" unselectable="on">便宜房子！</DIV></TD>
<TD style="WIDTH: 56px" class="x-grid3-col x-grid3-cell x-grid3-td-3 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-3" unselectable="on">张先生</DIV></TD>
<TD style="WIDTH: 84px" class="x-grid3-col x-grid3-cell x-grid3-td-4 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-4" unselectable="on">13326446513</DIV></TD>
<TD style="WIDTH: 84px" class="x-grid3-col x-grid3-cell x-grid3-td-5 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-5" unselectable="on"><SPAN style="COLOR: red; FONT-WEIGHT: bold">3000</SPAN>元</DIV></TD>
<TD style="WIDTH: 84px" class="x-grid3-col x-grid3-cell x-grid3-td-6 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-6" unselectable="on">2008-10-11</DIV></TD>
<TD style="WIDTH: 112px" class="x-grid3-col x-grid3-cell x-grid3-td-7 " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-7" unselectable="on">2��1��</DIV></TD>
<TD style="WIDTH: 168px" class="x-grid3-col x-grid3-cell x-grid3-td-8 x-grid3-cell-last " tabIndex=0>
<DIV class="x-grid3-cell-inner x-grid3-col-8" unselectable="on">洪山区武珞路</DIV></TD></TR></TBODY></TABLE></DIV></DIV><A id=ext-gen323 class=x-grid3-focus tabIndex=-1 href="http://10.17.255.140:8080/houseProject/house/infos.jsp#"></A></DIV></DIV>
<DIV id=ext-gen325 class=x-grid3-resize-marker>&nbsp;</DIV>
<DIV id=ext-gen326 class=x-grid3-resize-proxy>&nbsp;</DIV></DIV></DIV>
<DIV id=ext-gen150 class="x-panel-bbar x-panel-bbar-noborder">
<DIV id=ext-comp-1023 class="x-toolbar x-small-editor">
<TABLE cellSpacing=0>
<TBODY>
<TR>
<TD id=ext-gen241>
<TABLE style="WIDTH: auto" id=ext-comp-1025 class="x-btn-wrap x-btn x-btn-icon x-item-disabled" disabled border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD class=x-btn-left><I>&nbsp;</I></TD>
<TD class=x-btn-center><EM unselectable="on"><BUTTON id=ext-gen243 class="x-btn-text x-tbar-page-first" qtip="第一页">&nbsp;</BUTTON></EM></TD>
<TD class=x-btn-right><I>&nbsp;</I></TD></TR></TBODY></TABLE></TD>
<TD id=ext-gen249>
<TABLE style="WIDTH: auto" id=ext-comp-1026 class="x-btn-wrap x-btn x-btn-icon x-item-disabled" disabled border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD class=x-btn-left><I>&nbsp;</I></TD>
<TD class=x-btn-center><EM unselectable="on"><BUTTON id=ext-gen251 class="x-btn-text x-tbar-page-prev" qtip="前一页">&nbsp;</BUTTON></EM></TD>
<TD class=x-btn-right><I>&nbsp;</I></TD></TR></TBODY></TABLE></TD>
<TD><SPAN id=ext-gen257 class=ytb-sep></SPAN></TD>
<TD><SPAN id=ext-gen258 class=ytb-text>页</SPAN></TD>
<TD><INPUT style="HEIGHT: 18px" id=ext-gen259 class=x-tbar-page-number value=1 size=3></TD>
<TD><SPAN id=ext-gen262 class=ytb-text>页共 68 页</SPAN></TD>
<TD><SPAN id=ext-gen263 class=ytb-sep></SPAN></TD>
<TD id=ext-gen264>
<TABLE style="WIDTH: auto" id=ext-comp-1027 class="x-btn-wrap x-btn x-btn-icon " border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD class=x-btn-left><I>&nbsp;</I></TD>
<TD class=x-btn-center><EM unselectable="on"><BUTTON id=ext-gen266 class="x-btn-text x-tbar-page-next" qtip="下一页">&nbsp;</BUTTON></EM></TD>
<TD class=x-btn-right><I>&nbsp;</I></TD></TR></TBODY></TABLE></TD>
<TD id=ext-gen272>
<TABLE style="WIDTH: auto" id=ext-comp-1028 class="x-btn-wrap x-btn x-btn-icon " border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD class=x-btn-left><I>&nbsp;</I></TD>
<TD class=x-btn-center><EM unselectable="on"><BUTTON id=ext-gen274 class="x-btn-text x-tbar-page-last" qtip="最后页">&nbsp;</BUTTON></EM></TD>
<TD class=x-btn-right><I>&nbsp;</I></TD></TR></TBODY></TABLE></TD>
<TD><SPAN id=ext-gen280 class=ytb-sep></SPAN></TD>
<TD id=ext-gen281>
<TABLE style="WIDTH: auto" id=ext-comp-1029 class="x-btn-wrap x-btn x-btn-icon" border=0 cellSpacing=0 cellPadding=0>
<TBODY>
<TR>
<TD class=x-btn-left><I>&nbsp;</I></TD>
<TD class=x-btn-center><EM unselectable="on"><BUTTON id=ext-gen283 class="x-btn-text x-tbar-loading" qtip="刷新">&nbsp;</BUTTON></EM></TD>
<TD class=x-btn-right><I>&nbsp;</I></TD></TR></TBODY></TABLE></TD>
<TD><SPAN id=ext-gen290 class=ytb-sep></SPAN></TD>
<TD><SPAN id=ext-gen291 class=ytb-text>每页显示</SPAN></TD>
<TD id=ext-gen292>
<DIV style="WIDTH: 47px" id=ext-gen293 class=x-form-field-wrap><INPUT style="WIDTH: 30px" id=ext-comp-1030 class=" x-form-text x-form-field" value=5 size=24 name=ext-comp-1030 autocomplete="off" qtip><IMG id=ext-gen294 class="x-form-trigger x-form-arrow-trigger" src="http://10.17.255.140:8080/houseProject/resources/images/default/s.gif"></DIV></TD>
<TD><SPAN id=ext-gen306 class=ytb-text>条</SPAN></TD></TR></TBODY></TABLE>
<DIV id=ext-gen289 class=x-paging-info>显示第 1 条到 5 条记录，一共 338 条</DIV></DIV></DIV></DIV></DIV>
<DIV style="Z-INDEX: 15000; POSITION: absolute; VISIBILITY: hidden; TOP: -10000px; LEFT: -10000px" id=ext-gen335 class="x-dd-drag-proxy x-dd-drop-nodrop x-grid3-col-dd">
<DIV class=x-dd-drop-icon></DIV>
<DIV id=ext-gen337 class=x-dd-drag-ghost></DIV></DIV>
<DIV id=ext-gen340 class=col-move-top>&nbsp;</DIV>
<DIV id=ext-gen341 class=col-move-bottom>&nbsp;</DIV></BODY></HTML>  