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
	    url:'/resourcesRest/list',
		method:'get',
	    columns:[[
	    	{field:'ck',checkbox:true},
        	{field:'id',title:'id',hidden:true},
        	{field:'resourceTitle',title:'资源标题',width:100},
	        {field:'resourceDate',title:'资源日期',width:100},
	        {field:'resourceIntro',title:'资源简介',width:100},
	        {field:'pictureUrl',title:'图片路径',width:100},
	        {field:'accountId',title:'账户',width:100},
	        {field:'downloadCount',title:'下载次数',width:100},
	        {field:'viewCount',title:'浏览次数',width:100},
	        {field:'score',title:'评价分数',width:100},
	        {field:'isBoutique',title:'是否精品',width:100}
	    ]]
	});
	
	//添加操作
	component.addWindow.baseDialog({
		title: '添加评论',
        width: 500,
        height: 280,
        url:"/resourcesRest/saveOrUpdate"
	});
	component.addBtn.click(function(){
		component.addWindow.dialog("open");
	});
	//删除操作
	component.delBtn.click(function(){
		$.delData(component,{
			url:"/resourcesRest/deleteByIds"
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
        url:"/resourcesRest/saveOrUpdate"
	});
	component.updateBtn.click(function(){
		var rows = component.dataGrid.datagrid('getSelections');
	 	if($.isAllowUpdate(component)){
	 		//获取数据详情
			var id = rows[0].id;
			$.fillForm({
				url:"/resourcesRest/findById",
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