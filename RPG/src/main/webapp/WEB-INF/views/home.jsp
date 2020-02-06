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
    <link rel="stylesheet" type="text/css" href="css/home.css">
</head>
<body class="body">
    <section class="hpmp">
        <div class="hpmp__window">
            <p>HP：</p>52<p style="margin-left: 3vw;">MP：</p>20
        </div>
    </section>
    <section class="icon">
        <img src="img/axe.png" width="130px" height="160px" class="weapon">
        <img src="img/person.png" width="200px" height="200px">
    </section>
    <section class="status">
        <div class="status__window">
            <ul>
                <li>なまえ</li>
                <li>しょくぎょう</li>
                <li>LV</li>
                <li>さいだいHP</li>
                <li>さいだいMP</li>
                <li>ちから</li>
                <li>ぼうぎょ</li>
                <li>すばやさ</li>
                <li>おかね</li>
                <li>つぎのLVまで</li>
            </ul>
            <ul style="margin-left: 4.5vw;">
                <li>ロト</li>
                <li>せんし</li>
                <li>8</li>
                <li>80</li>
                <li>30</li>
                <li>26</li>
                <li>18</li>
                <li>19</li>
                <li>600G</li>
                <li>1300XP</li>
            </ul>
        </div>
    </section>
    <section class="menu">
        <div class="menu_window">
            <ul>
                <li><a href="battle">せんとう</a></li>
                <li>ボス</li>
                <li>やすむ</li>
                <li><a href="changeRole">てんしょく</a></li>
                <li>セーブ</li>
                <li><a href="index">おわる</a></li>
            </ul>
        </div>
    </section>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script type="text/javascript" src="js/fadeInOut.js"></script>
</body>
</html>