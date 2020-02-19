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