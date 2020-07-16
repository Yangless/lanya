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
	    url:'/resourcecommentRest/list',
		method:'get',
	    columns:[[
	    	{field:'ck',checkbox:true},
        	{field:'id',title:'id',hidden:true},
        	{field:'accountId',title:'账号',width:100},
	        {field:'commentDate',title:'评论日期',width:100},
	        {field:'commentScore',title:'评论分数',width:100},
	        {field:'content',title:'评论内容',width:100},
	        {field:'resourceId',title:'资源',width:100},
	        {field:'parentId',title:'所属评论',width:100}
	    ]]
	});
	
	//添加操作
	component.addWindow.baseDialog({
		title: '添加评论',
        width: 400,
        height: 300,
        url:"/resourcecommentRest/saveOrUpdate"
	});
	component.addBtn.click(function(){
		component.addWindow.dialog("open");
	});
	//删除操作
	component.delBtn.click(function(){
		$.delData(component,{
			url:"/resourcecommentRest/deleteByIds"
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
        url:"/resourcecommentRest/saveOrUpdate"
	});
	component.updateBtn.click(function(){
		var rows = component.dataGrid.datagrid('getSelections');
	 	if($.isAllowUpdate(component)){
	 		//获取数据详情
			var id = rows[0].id;
			$.fillForm({
				url:"/resourcecommentRest/findById",
				data:{
					"po.id":id
				},
				currentForm:component.updateWindowForm
			});
			
			component.updateWindow.dialog("open");
	 	}
	});
});