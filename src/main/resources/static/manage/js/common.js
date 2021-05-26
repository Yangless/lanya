$(function(){
	//获取当前窗口大小并且减去head和foot的高度
	var winHeight = $(window).height()-50-45;
	$(".span10").css("min-height",winHeight+"px");
});