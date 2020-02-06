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
    <link rel="stylesheet" type="text/css" href="css/input.css">
</head>
<body class="body">
    <section class="main">
        <div class="textArea">
            <div class="flex">
                <p>なまえ</p><input type="text" name="" id="" maxlength="6">
            </div>
            <div class="flex">
                <p>あんごう</p><input type="text" name="" id="" maxlength="10">
            </div>
            <a class="return" href="index" class="link">
                <img src="img/return.png" alt="#" width="50px" height="50px">
                <p>もどる</p>
            </a>
            <a class="confirm" href="selectRole" class="link">
                <img src="img/confirm.png" alt="#" width="50px" height="50px">
                <p>きまり</p>
            </a>
        </div>
    </section>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script type="text/javascript" src="js/fadeInOut.js"></script>
</body>
</html>