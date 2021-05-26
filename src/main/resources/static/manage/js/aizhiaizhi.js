//获取页面元素
$(function(){
	component = {
		dataGrid:$('#mainDataGrid')
	}
});

$(function(){
	
	component.dataGrid.baseDatagrid({
	    url:'datagrid_data1.json',
		method:'get',
	    columns:[[
	        {field:'itemid',title:'itemid',width:100},
	        {field:'productid',title:'productid',width:100},
	        {field:'listprice',title:'listprice',width:100},
			{field:'unitcost',title:'unitcost',width:100},
			{field:'attr1',title:'attr1',width:100},
			{field:'status',title:'status',width:100}
	    ]]
	});
	
});