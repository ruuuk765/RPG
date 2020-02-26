<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>勇者の冒険</title>
    <link rel="stylesheet" type="text/css" href="css/changeRole.css">
    <link href="https://fonts.googleapis.com/css?family=Noto+Sans+JP:400,700&amp;subset=japanese" rel="stylesheet">
</head>
<body class="body">
    <section class="main">
        <h1>しょくぎょうをえらんでください</h1>
        <form action="home" method="post" id="changeRole">
	        <ul>
	            <li>
	                <label>
	                    <input type="radio" name="role" id="role" value="1" checked>
	                    せんし
	                    <img src="img/weapon_01.png" width="72px" height="72px">
	                 </label>
	            </li>
	            <li>
	                <label>
	                    <input type="radio" name="role" id="role" value="2">
	                    まほうつかい
	                    <img src="img/weapon_02.png" width="72px" height="75px" class="cane">
	                </label>
	            </li>
	            <c:choose>
	            	<c:when test="${user.lv < 5}">
			            <li class="disabled">
			                <input type="radio" name="role" id="role" value="0" disabled>
			                <label class="disabled">ゆうしゃ</label>
			                <img src="img/weapon_09.png" width="72px" height="75px" class="sord">
			                <p style="margin:2vh 0 0 0.3vw;">※ LV5以上</p>
			            </li>
		            </c:when>
		            <c:otherwise>
					    <li>
						    <label>
			                    <input type="radio" name="role" id="role" value="3">
			                    ゆうしゃ
			                    <img src="img/weapon_03.png" width="72px" height="75px" class="sord">
			                </label>
		                </li>
				  </c:otherwise>
	            </c:choose>
	            <a class="return" href="home" class="link" name="changeRole">
	                <img src="img/return.png" alt="#" width="50px" height="50px">
	                <p>もどる</p>
	            </a>
	             <div class="confirm" class="link">
					<button type="submit" form="changeRole" name="changeRole">
						<img src="img/confirm.png" alt="#" width="50px" height="50px">
						<p>きまり</p>
					</button>
				</div>
	        </ul>
        </form>
    </section>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script type="text/javascript" src="js/fadeInOut.js"></script>
</body>
</html>