  
   $(function(){
	     var rot=0;
	     var prefix=$('.tire').css('-o-transform')?'-o-transform':($('.tire').css('-ms-transform')?'-ms-transform':($('.tire').css('-moz-transform')?'-moz-transform':($('.tire').css('-webkit-transform')?'-webkit-transform':'transform')));

	     var origin={		/*设置我们的起始点*/
		 left:-400
	     };

	     var animation={		/*该动画由jQuery执行*/
		 left:1600		/*设置我们将移动到的最终位置*/
	 };

	     var rotate=function(){	/*该方法将被旋转的轮子调用*/
		 rot+=2;
		 $('.tire').css(prefix,'rotate('+rot+'deg)');
	 };

	     var options={		/*将要被jQuery使用的参数*/
		 easing:'linear',	/*指定速度，此处只是线性，即为匀速*/
		 duration:10000,	/*指定动画持续时间*/
		 complete:function(){
		    $('#car').css(origin).animate(animation,options);
		 },
		 step:rotate
	 };

	     options.complete();
	  });