//こうげき
$(function(){
    $('.attack').on('click',function(){
        $.ajax({
            url:'./attack',
            type:'POST',
            dataType:"json",
            success: function(bi){
            	console.log(bi);
            }
        })
    });
});



//ぼうぎょ
$(function(){
    $('.defense').on('click',function(){
        $.ajax({
            url:'./defense',
            type:'POST',
            dataType:"json",
            success: function(bi){
            	//メッセージ表示
        		$(".messageWindow").html("<p>" + bi.context[0] +"<p>");
            	for (var i = 1, l = bi.context.length; i < l; ++i) {
        			$(".messageWindow").append("<p>" + bi.context[i] +"<p>");
            	}

            	//ユーザーHP表示
            	$(".userHp").html(bi.userHp);

            	if(bi.isContinue){
            		//戦闘続行
            		setTimeout(function(){
            			$(".messageWindow").html("<p>どうする？<p>");
            		},1500);
            	}else{
            		//戦闘不能
            		setTimeout(function(){
            			$(".messageWindow").html("<p>まけてしまった...<p>");
            		},1500);
            		setTimeout(function(){
            			//ホームへ遷移
            			window.location.href = "/home";
            		},4000);
            	}
            }
        })
    });
});
