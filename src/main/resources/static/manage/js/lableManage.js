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
	    url:'/lableinfoRest/list',
		method:'get',
	    columns:[[
	    	{field:'ck',checkbox:true},
        	{field:'id',title:'id',hidden:true},
	        {field:'lableName',title:'标签名称',width:100}
	    ]]
	});
	
	//添加操作
	component.addWindow.baseDialog({
		title: '添加广告',
        width: 350,
        height: 250,
        url:"/lableinfoRest/saveOrUpdate"
	});
	component.addBtn.click(function(){
		component.addWindow.dialog("open");
	});
	//删除操作
	component.delBtn.click(function(){
		$.delData(component,{
			url:"/lableinfoRest/deleteByIds"
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
		title: '修改标签',
        width: 500,
        height: 280,
        url:"/lableinfoRest/saveOrUpdate"
	});
	component.updateBtn.click(function(){
		var rows = component.dataGrid.datagrid('getSelections');
	 	if($.isAllowUpdate(component)){
	 		//获取数据详情
			var id = rows[0].id;
			$.fillForm({
				url:"/lableinfoRest/findById",
				data:{
					"po.id":id
				},
				currentForm:component.updateWindowForm
			});
			
			component.updateWindow.dialog("open");
	 	}
	});
});