//获取页面元素
$(function(){
	component = {
		dataGrid:$('#mainDataGrid'),
		addBtn:$('#addBtn'),
		addWindow:$('#addWindow'),
		delBtn:$('#delBtn'),
		columnName:$('#columnName'),
		columnValue:$('#columnValue'),
		searchBtn:$('#searchBtn'),
		updateBtn:$('#updateBtn'),
		updateWindow:$('#updateWindow'),
		updateWindowForm:$('#updateWindow form')
	}
});

$(function(){
	
	component.dataGrid.baseDatagrid({
	    url:'/accountcodeRest/list',
		method:'get',
	    columns:[[
	    	{field:'ck',checkbox:true},
        	{field:'id',title:'id',hidden:true},
        	{field:'accountCode',title:'账号',width:100},
	        {field:'realName',title:'真实姓名',width:100},
	        {field:'loginTime',title:'登陆时间',width:100},
	        {field:'resourceTotal',title:'发布资源',width:100},
	        {field:'funsTotal',title:'粉丝总数',width:100},
	        {field:'downloadTotal',title:'下载次数',width:100},
	        {field:'userIntro',title:'用户介绍',width:100}
	    ]]
	});
	
	//添加操作
	component.addWindow.baseDialog({
		title: '添加用户',
        width: 500,
        height: 480,
        url:"/accountcodeRest/saveOrUpdate"
	});
	component.addBtn.click(function(){
		component.addWindow.dialog("open");
	});
	//删除操作
	component.delBtn.click(function(){
		$.delData(component,{
			url:"/accountcodeRest/deleteByIds"
		});
	});
	//查询操作
	component.searchBtn.click(function(){
		component.dataGrid.datagrid('reload',{
			columnName:component.columnName.combobox('getValue'),
			columnValue:component.columnValue.textbox('getValue')	
		});
	});
	//更新操作
	component.updateWindow.baseDialog({
		title: '修改广告',
        width: 500,
        height: 480,
        url:"/accountcodeRest/saveOrUpdate"
	});
	component.updateBtn.click(function(){
		var rows = component.dataGrid.datagrid('getSelections');
	 	if($.isAllowUpdate(component)){
	 		//获取数据详情
			var id = rows[0].id;
			$.fillForm({
				url:"/accountcodeRest/findById",
				data:{
					"po.id":id
				},
				currentForm:component.updateWindowForm
			});
			
			component.updateWindow.dialog("open");
	 	}
	});
});