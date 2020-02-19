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
            	$(".messageWindow").html("<p>" + bi.context[0] +"<p>");
            	$(".messageWindow").append("<p>" + bi.context[1] +"<p>");
            }
        })
    });
});