//こうげき
$(function(){
    $('.attack').on('click',function(){
        $.ajax({
            url:'./attack',
            type:'POST',
            data:{"magicId":'0'},
            dataType:"json",
            success: function(bi){
            	console.log(bi);
            }
        })
    });
});

//まほう
$(function(){
    $('.magic').on('click',function(){
    	var magicId =  $(this).attr("id");
        $.ajax({
            url:'./attack',
            type:'POST',
            data:{"magicId":magicId},
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
            	$('.magics').hide();
        		$(".messages").html("<p>" + bi.context[0] +"<p>");
            	for (var i = 1, l = bi.context.length; i < l; ++i) {
        			$(".messages").append("<p>" + bi.context[i] +"<p>");
            	}

            	//ユーザーHP表示
            	$(".userHp").html(bi.userHp);

            	if(bi.status == "continue"){
            		//戦闘続行
            		setTimeout(function(){
            			$(".messages").html("<p>どうする？<p>");
            		},1500);
            	}else{
            		//戦闘不能
            		setTimeout(function(){
            			$(".messages").html("<p>まけてしまった...<p>");
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



//まほう一覧表示
$(function(){
    $('.magicList').on("click",function() {
      $(".messages").html("");
      $('.magics').show();
   });
});



//ボタン連打防止
//function button() {
//
//	$(".attack").toggleClass("attack");
//	$(".magicList").toggleClass("magicList");
//	$(".defense").toggleClass("defense");
//
//}
