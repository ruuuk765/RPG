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
    <link
      href="https://fonts.googleapis.com/css?family=Noto+Sans+JP:400,700&amp;subset=japanese"
      rel="stylesheet"
    />
</head>
<body class="body">
    <section id="section">
        <div class="hpmpWindow">
            <ul>
                <li>${fn:escapeXml(user.name)}</li>
                <li>HP：<div class="userHp">${fn:escapeXml(user.hp)}</div></li>
                <li>MP：<div class="userMp">${fn:escapeXml(user.mp)}</div></li>
                <li>LV：<div class="userLv">${fn:escapeXml(user.lv)}</div></li>
            </ul>
        </div>
        <div class="enemyWindow">
            <img src="img/enemy_0${fn:escapeXml(enemy.id)}.gif">
        </div>
        <div class="footer">
            <div class="commandWindow">
                <ul>
                    <li><p class="attack">たたかう</p></li>
                    <li><p>まほう</p></li>
                    <li><p class="defense">ぼうぎょ</p></li>
                    <li><p><a href="home">にげる</a></p></li>
                </ul>
            </div>
            <div class="messageWindow">
                <p>${fn:escapeXml(enemy.name)}があらわれた！</p>
            </div>
        </div>
</section>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<script type="text/javascript" src="js/jquery.jrumble.1.3.js"></script>
    <script type="text/javascript" src="js/fadeInOut.js"></script>
    <script type="text/javascript" src="js/battle.js"></script>
</body>
</html>