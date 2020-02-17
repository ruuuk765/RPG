<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="ja">
  <head>
    <meta charset="UTF-8" />
    <title>勇者の冒険</title>
    <link rel="stylesheet" type="text/css" href="css/home.css" />
    <link
      href="https://fonts.googleapis.com/css?family=Noto+Sans+JP:400,700&amp;subset=japanese"
      rel="stylesheet"
    />
  </head>
  <body class="body">
    <section>
        <ul>
            <li>
                <div class="hpmpWindow">
                    <ul>
                        <li>
                          <p>HP：52</p>
                        </li>
                        <li>
                          <p>MP：20</p>
                        </li>
                    </ul>
                </div>
                <div class="iconWindow">
                  <img
                    src="img/weapon_01.png"
                    width="130px"
                    height="160px"
                    class="weapon"
                  />
                  <img src="img/person.png" width="200px" height="200px" />
                </div>
                <div class="menuWindow">
                    <ul>
                      <li><a href="battle">せんとう</a></li>
                      <li>ボス</li>
                      <li>やすむ</li>
                      <li><a href="changeRole">てんしょく</a></li>
                      <li>セーブ</li>
                      <li>へんしゅう</li>
                      <li><a href="index">おわる</a></li>
                    </ul>
                  </div>
            </li>
            <li>
                <div class="statusWindow">
                  <ul>
                    <li><p>なまえ</p></li>
                    <li><p>しょくぎょう</p></li>
                    <li><p>LV</p></li>
                    <li><p>さいだいHP</p></li>
                    <li><p>さいだいMP</p></li>
                    <li><p>ちから</p></li>
                    <li><p>ぼうぎょ</p></li>
                    <li><p>すばやさ</p></li>
                    <li><p>おかね</p></li>
                    <li><p>つぎのLVまで</p></li>
                  </ul>
                  <ul>
                    <li><p>こんどう</p></li>
                    <li><p>せんし</p></li>
                    <li><p>8</p></li>
                    <li><p>80</p></li>
                    <li><p>30</p></li>
                    <li><p>26</p></li>
                    <li><p>18</p></li>
                    <li><p>19</p></li>
                    <li><p>600G</p></li>
                    <li><p>1300XP</p></li>
                  </ul>
                </div>
            </li>
        </ul>
    </section>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script type="text/javascript" src="js/fadeInOut.js"></script>
  </body>
</html>