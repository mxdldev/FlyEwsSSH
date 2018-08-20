Ext.onReady(function(){	
    var win;    
    Ext.QuickTips.init(); 
    Ext.form.Field.prototype.msgTarget = 'side';   
	// Toolbar start
        if(!win){        	
        	northToolbar = new Ext.Toolbar({
        		id:"toolbarNorthToolbar",
				items:[
				{
					id:"tbbuttonLogout",
					text:"退出系统",
					icon:"ewssite/images/board_manager.gif",
					cls:"x-btn-text-icon",
					tooltip:"<b>退出系统</b><br/>退EWS内容管理系统",
					enableToggle:false,
					pressed:false,
					
					handler:function(){
						Ext.MessageBox.confirm("退出系统", "你确定你要退出系统吗？", 
							function(btn, text)
							{
								if (btn == 'yes')
								{
									A = Ext.MessageBox.wait("请等待...","退出...",{
										text:"退出..."
									});
							
									Ext.Ajax.request({
										url:"ajxrpc/logout.logout",
										method:"GET",
										success:function(B,C){
											var D=Ext.util.JSON.decode(B.responseText);
											if(D.success){
												A.hide();
												window.location.href = 'index.html';
											}
										},
										failure:function(B,C){
											A.hide();
											Ext.Msg.alert("错误","现在不能退出!")
										},
										scope:this
									})
								}
							}
						,this);
					},
					scope:this
				},
				{
					id:"tbbuttonPreferences",
					text:"个人设置",
					icon:"ewssite/images/board_manager.gif",
					cls:"x-btn-text-icon",
					tooltip:"<b>个人设置</b><br/>修改用户的个人设置",
					enableToggle:false,
					pressed:false
				}
				]
			});
			
		
			//tree3 ==============================================================================			 		
    		function onClickMenuItem(a,b,c) {    	
			var n = centerTabPanel.getComponent(a);				
			if (!n) {
				//	alert(a);
					n = centerTabPanel.add({
					'id' : a,
					'title' : b,
					iconCls : 'tabs',
					closable : true,
					autoLoad : {
					url : 'ewssite/inc/tabFrame.jsp?url=' + c,
					callback : this.initSearch,
					scope : this,
					scripts : true
					} 
				});
			}
			centerTabPanel.setActiveTab(n);
			}
			var arrTree=new Array();		   	   
			var arrtree0 = new Array();   
    		var arrtree5 = new Array(); 
    		var arrtree6 = new Array(); 
    		var arrtree7 = new Array(); 
    		var arrtree8 = new Array(); 
    		var allTree = 0;
    		var allTreeNum = 1;
    		
    		function getTree(){
				DWREngine.setAsync(false);	
				tree.getTree("tree", callback);			
			}		
			function callback(data){
				arrTree = data;							
			}
			getTree(); 
    		for(i=0;i<arrTree.length;i++){    	
    			var arrtree1 = new Array();
    			var arrtree2 = new Array();
    			var arrtree3 = new Array();
    			var arrtree4 = new Array();
				arrtree1 = arrTree[i].split("$");
				arrtree2 = arrtree1[0].split("#");
				arrtree3 = arrtree1[1].split("#");								
				arrtree2[0] = new Ext.tree.AsyncTreeNode({
			        text: '',
			        draggable:true
			    });
				for(j=0;j<arrtree3.length;j++){						
					arrtree4 =	arrtree3[j].split("|");	
					arrtree6[allTree] = arrtree4[0];
					arrtree7[allTree] = arrtree4[1];	
					arrtree5[allTree] = arrtree2[0].appendChild(new Ext.tree.TreeNode({
					id:allTree+"|"+arrtree3[j],
					icon:"ewssite/images/"+allTreeNum+".gif",					
					text:arrtree6[allTree]
					//href:arrtree4[1],//
        			//hrefTarget:"main"//
				}));	
					allTree = allTree + 1;
					if(allTreeNum<11){
						allTreeNum = allTreeNum + 1;
					}else{
						allTreeNum = 1;
					}
					
				}	
				    
				arrtree2[1] = new Ext.tree.TreePanel({
						    title:"",
							titleCollapse   :false,
					        rootVisible:false,
							root:arrtree2[0],
							useArrows:true,
        					autoScroll:true
					});
					
				arrtree0[i] = new Ext.Panel({
				id:arrtree2[2],
				title:arrtree2[3],
				iconCls:"contacts-icon-cls",
				autoShow:true,
				hideMode:"visibility",				
				bodyStyle:"background-color: white",
				items:[
					arrtree2[1]
				]
				});		
    		}
    		//===================================================
    		if(arrtree0[8]==""||arrtree0[8]==null){
    			arrtree0[8] = new Ext.Panel({
				id:arrtree2[2],				
				items:[
					arrtree2[1]
				]
				});	
    		}
    		if(arrtree0[9]==""||arrtree0[9]==null){
    			arrtree0[9] = new Ext.Panel({
				id:arrtree2[2],
				items:[
					arrtree2[1]
				]
				});	
    		}
    		if(arrtree0[10]==""||arrtree0[10]==null){
    			arrtree0[10] = new Ext.Panel({
				id:arrtree2[2],				
				items:[
					arrtree2[1]
				]
				});	
    		}
    		if(arrtree0[11]==""||arrtree0[11]==null){
    			arrtree0[11] = new Ext.Panel({
				id:arrtree2[2],
				title:arrtree2[3],
				iconCls:"contacts-icon-cls",
				autoShow:true,
				hideMode:"visibility",				
				bodyStyle:"background-color: white",
				items:[
					arrtree2[1]
				]
				});	
    		}    		
    		//================================    		
   			for(k=0;k<allTree;k++){   			
    			arrtree5[k].on("click", function(node)
						{	    					
    					var id=node.id;    					
    					arrtree8 =	id.split("|");	 
						onClickMenuItem("ews"+arrtree8[0],arrtree8[1],arrtree8[2]);						
						}
				)
    		}
			//alert(allTree);
			// Center panel===============================================================================
			var centerTabPanel = new Ext.TabPanel({
				id:"centerTabPanel",
				frameElement:"main",
				autoShow:true,
				deferredRender:false,
				enableTabScroll:true,
				monitorResize:true,
				border:true,
				activeTab:0,
				hideMode:"offsets",
				items:[		
				new Ext.Panel({
					baseCls:"x-plain",
					'id' : 'ews0',
					'title' :arrtree6[0],
					iconCls : 'tabs',
					closable : false,
					autoLoad : {
					url : 'ewssite/inc/tabFrame.jsp?url='+arrtree7[0],
					callback : this.initSearch,
					scope : this,
					scripts : true
					} 
					})
				]
			});
			
			centerPanel = new Ext.Panel({
				id:"panelCenterPanel",
				baseCls:"x-plain",
				deferredRender:false,
				region:"center",
				autoShow:true,
				activeItem:0,
				border:false,
				layout:"card",
				hideMode:"offsets",
				items:[
					centerTabPanel
				]
			});			
			// LeftPanel ======================================================================================
			accordion = new Ext.Panel({
				region:'west',
                id:'panelAccordion',
                title:'主菜单',
                //split:true,    不可以拖动           
                maxSize: 300,
                frame:false,
                collapsible: true,
                margins:'0 5 0 3',
                layout:'accordion',                
				width:210,
				minSize:150,
				defaults:{
					bodyStyle:"background: transparent;",
					border:true,
					frame:true
				},
                layoutConfig:{
                	titleCollapse:true,
                	renderHidden:false,
                	hideCollapseTool:false,
                	//activeOnTop:true,
					renderHidden:false,
					border:true,
					collapseFirst:false,
                    animate:true
                },bbar : [{
					text : '开始',
					iconCls : 'icon-plugin',
					icon:"ewssite/images/plugin.gif",
					menu : new Ext.menu.Menu({
						items : [{
							text : '关于系统',
							iconCls : 'icon-info',
							handler : function() {
								new Ext.Window({
									closeAction : 'close',
									resizable : false,
									bodyStyle : 'padding: 7',
									modal : true,
									title : '关于本系统',
									html : 'EWS 内容管理系统<br>' +
											'数&nbsp;&nbsp;据&nbsp;&nbsp;库: MYSQL5.2',
									width : 300,
									height : 200
								}).show();
							}
						}, {
							text : '退出系统',
							iconCls : 'icon-delete',
							handler : function() {
								Ext.Msg.confirm('操作提示', '您确定要退出本系统?', function(btn) {
									if ('yes' == btn) {
										Ext.Ajax.request({
											url : 'logout.action',
											success : function() {
												location = '/bmsh/index.jsp';
											},
											failure : function() {
												Ext.Msg.show({
													title : '错误提示',
													msg : '退出系统失败!',
													icon : Ext.Msg.ERROR,
													buttons : Ext.Msg.OK
												});
											}
										});
									}
								});
							}
						}]
					})
				}],				
                items: [
               arrtree0[0],arrtree0[1],arrtree0[2],arrtree0[3],arrtree0[4],arrtree0[5],arrtree0[6],arrtree0[7],arrtree0[8],arrtree0[9],arrtree0[10],arrtree0[11]
                ]
			});
		
			//Main view page============================================================================= 
       		win = new Ext.Viewport({
       			title: 'Layout Window',
        		id:'viewportMain',
        		cls:"x-plain",
        		monitorResize:true,	        		
	            layout: 'border',
	            items:[
	            {
					id:"panelNorth",
					region:"north",
					autoShow:true,
					contentEl:"header",
					split:false,
					height:71,
					minSize:71,
					maxSize:71,
					border:false,
					collapsible:false,
					margins:"0 0 0 0",
					bbar:northToolbar
				},
				{
					id:"panelSouth",
					region:"south",
					contentEl:"footer",
					split:false,
					height:24,
					minSize:24,
					maxSize:24,
					border:false,
					collapsible:false,
					margins:"0 0 0 0"
				},
	            centerPanel, 
		        accordion
		    	]
			});			
			delete accordion;			
			delete centerContactsPanel;
			delete centerPanel;
			delete centerTabPanel;		
			delete northToolbar;				
			delete arrtree0[0];
			delete arrtree0[1];
			delete arrtree0[2];
			delete arrtree0[3];
			delete arrtree0[4];
			delete arrtree0[5];
			delete arrtree0[6];
			delete arrtree0[7];
        }
});