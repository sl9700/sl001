function searchRecycleByName(){
	var searchByName=$("#searchByName").val();
	$("#dgRecycleStatistics").datagrid("load",{
		searchByName:searchByName
	});
}