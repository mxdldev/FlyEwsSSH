Ext.onReady(function() {
	
	Ext.state.Manager.setProvider(new Ext.state.CookieProvider());
	// 使用表单提示
	Ext.QuickTips.init();
	Ext.form.Field.prototype.msgTarget = 'side';
	
	//根据Cookie里面存放的CSS style来动态改变id为text的样式
	var file = Ext.state.Manager.get('style');
	Ext.util.CSS.swapStyleSheet('test', 'resources/css/'+file);
	// 定义表单
	var loginForm = new Ext.FormPanel({
		labelAlign : 'top',
		frame : true,
		monitorValid : true,// 把有formBind:true的按钮和验证绑定
		id : 'login',
		bodyStyle : 'padding:5px 5px 0',
		width : 400,
		// 定义表单元素
		// 指定容器中的元素
		items : [{
			layout : 'table', // 把整个空间划分成两列
			items : [{
						width : 180,
						html : '<img src="resources/images/House.jpg" width=170/>' // 左边列放一个logo
					}, {
						width : 180,
						layout : 'form', // 右边列再分成上下两行
						items : [{
									xtype : 'textfield',
									// 元素的名称
									name : 'eauser.aname',
									// 指定字段的标签
									fieldLabel : '帐号',
									width : 140,
									allowBlank : false,
									// 为空时提示信息
									blankText : '帐号不能为空'
								}, {
									xtype : 'textfield',
									name : 'eauser.apass',
									fieldLabel : '密码',
									allowBlank : false,
									width : 140,
									blankText : '密码不能为空',
									inputType : 'password'
								},
								{
									items : [{
										layout : 'table', // 把整个空间划分成两列
										items : [{
											layout : 'form', // 右边列再分成上下两行
											width : 85,
											items : [{
												name : 'eauser.validateCode',
												xtype : 'textfield',
												fieldLabel : '验证码',
												regex : /^[0-9]{4}$/,
												regexText : '图片不清楚吗？请点击图片进行刷新，验证码为4位数字!',
												width : 70,
												allowBlank : false,
												blankText : '验证码不能为空!'
											}]
										}, {
											html : '<img id="photo" src="servlet/CodeServlet"  onMouseDown="changeImg(this)"/>'
										}]
									}]
								}]
					}]

		}],
		buttons : [{
			text : '登陆',
			formBind : true,
			type : 'submit',
			// 定义表单提交事件
			handler : function() {
				if (loginForm.form.isValid()) {// 验证合法后使用加载进度条
					Ext.MessageBox.show({
								title : '请稍等',
								msg : '正在登陆...',
								progressText : '',
								width : 300,
								progress : true,
								closable : false,
								animEl : 'loading'
							});
					// 控制进度速度
					var f = function(v) {
						return function() {
							var i = v / 11;
							Ext.MessageBox.updateProgress(i, '');
						};
					};

					for (var i = 1; i < 12; i++) {
						setTimeout(f(i), i * 150);
					}

					// 提交到服务器操作
					loginForm.form.doAction('submit', {
								url : 'loginEauser.aspx',// 文件路径
								method : 'post',// 提交方法post或get
								params : '',
								// 提交成功的回调函数
								success : function(form, action) {
									if(action.result.msg == 'ok') {
										window.location = 'succ.jsp';
									}else if(action.result.msg == 'noname') {
										Ext.Msg.alert('登陆失败','用户名或密码错误！');
									}else if(action.result.msg == 'nocode'){
										Ext.Msg.alert('登陆失败','验证码错误！');
									}
								},
								// 提交失败的回调函数
								failure : function() {
									Ext.Msg.alert('错误', '服务器出现错误请稍后再试！');
								}
							});
				}
			}
		}, {
			text : '取消',
			handler : function() {
				loginForm.form.reset();
			}// 重置表单
		}]
	});
	// 定义窗体

	// 构建一个窗口面板容器
	win = new Ext.Window({
		// 把该面板绑定于wins这个DIV对象上
		//el : 'wins',
		// 窗口面板标题
		title : 'EWS内容管理系统',
		// 窗口面板宽度
		width : 400,
		//不容许任意伸缩大小
		resizable:false,
		// 高度
		autoHeight : true,
		// 该面板布局类型
		layout : 'column',
		// 面板是否可以关闭及打开
		collapsible : true,
		// 窗体拖拽 默认是TRUE
		draggable : false,
		defaults : {
			// 容器内元素是否显示边框
			border : false
		},
		items : {
			// 指定内部元素所占宽度1表示100% .5表示50%
			columnWidth : 1,
			// 把表单面板容器增加入其中,使之成为窗口面板容器的子容器
			items : loginForm
		}
			// // 面板中按钮的排列方式
			// buttonAlign : 'center',
			// // 面板底部的一个或多个按钮对象
			// buttons : [ {
			// // 按钮上需显示的文本
			// text : '登陆',
			// // 单击按钮时响应的动作
			// handler : login
			// }, {
			// text : '重置',
			// handler : reset
			// }]
		});

	win.show();// 显示窗体

});
// 点击更换验证码
function changeImg(obj) {
	//alert(obj.src);
	obj.src = "servlet/CodeServlet";
//	document.getElementById('photo').src="servlet/CodeServlet";
//	alert(document.getElementById('photo').src);
}