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
    <link rel="stylesheet" type="text/css" href="css/battle.css">
</head>
<body class="body">
    <section class="hpmp">
        <div class="hpmp__window">
            <p class="name">ロト</p>
            <p>HP：</p style="margin-left: 3vw;">52
            <p style="margin-left: 3vw;">MP：</p>20
            <p style="margin-left: 3vw;">LV：</p>8
        </div>
    </section>
    <section class="enemy">
        <img src="img/enemy__01.gif">
    </section>
    <section class="command">
        <div class="command__window">
            <ul>
                <li>たたかう</li>
                <li>まほう</li>
                <li>ぼうぎょ</li>
                <li><a href="home" class="link">にげる</a></li>
            </ul>
        </div>
    </section>
    <section class="message">
        <div class="message__window">
            <ul>
                <li>スライムがあらわれた！</li>
            </ul>
        </div>
    </section>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script type="text/javascript" src="js/fadeInOut.js"></script>
</body>
</html>