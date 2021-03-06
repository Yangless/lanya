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
	    url:'/addvertisementRest/list',
		method:'get',
	    columns:[[
	    	{field:'ck',checkbox:true},
        	{field:'id',title:'id',hidden:true},
	        {field:'imgName',title:'图片名称',width:100},
	        {field:'imgUrl',title:'图片路径',width:100},
	        {field:'addIntro',title:'图片介绍',width:100}
	    ]]
	});
	
	//添加操作
	component.addWindow.baseDialog({
		title: '添加广告',
        width: 500,
        height: 280,
        url:"/addvertisementRest/saveOrUpdate"
	});
	component.addBtn.click(function(){
		component.addWindow.dialog("open");
	});
	//删除操作
	component.delBtn.click(function(){
		$.delData(component,{
			url:"/addvertisementRest/deleteByIds"
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
        height: 280,
        url:"/addvertisementRest/saveOrUpdate"
	});
	component.updateBtn.click(function(){
		var rows = component.dataGrid.datagrid('getSelections');
	 	if($.isAllowUpdate(component)){
	 		//获取数据详情
			var id = rows[0].id;
			$.fillForm({
				url:"/addvertisementRest/findById",
				data:{
					"po.id":id
				},
				currentForm:component.updateWindowForm
			});
			
			component.updateWindow.dialog("open");
	 	}
	});
	//图片上传
	$('#uploadImg').dialog({
	    title: '上传图片',
	    width: 300,
	    height: 160,
	    closed: true,
	    cache: false,
	    modal: true,
	    buttons:[{
			text:'上传',
			iconCls:'icon-ok',
			handler:function(){
				uploadFile();
			}
		}]
	});
});