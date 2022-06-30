<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">
<title>Taping</title>
<link href="https://fonts.googleapis.com/css2?family=Sawarabi+Mincho&display=swap" rel="stylesheet">
<!--==============レイアウトを制御する独自のCSSを読み込み===============-->
<!--自作のCSS-->
<link rel="stylesheet" type="text/css" href="../css/origin.css">
<link rel="stylesheet" type="text/css" href="../css/parts.css">
<link rel="stylesheet" type="text/css" href="../css/layout.css">
<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css">
<link rel="stylesheet" type="text/css" href="../css/6-1-7.css">
</head>

<body>
<div id="container">
<header id="header">
<h1><a href="home.jsp">Taping</a></h1>

<div class="g-nav-openbtn"><div class="openbtn-area"><span></span><span></span><span></span></div></div>
<nav id="g-nav">
<div id="g-nav-list">
		<ul id="g-navi" class="nav01c">
			<li><a href="<%= request.getContextPath() + "/views/home.jsp" %>">Top</a></li>
			<li><a href="../Item.action">Items</a></li>
			<li><a href="<%= request.getContextPath() + "/views/cart.jsp" %>">Cart</a></li>
			<li><a href="<%= request.getContextPath() + "/views/member_info.jsp" %>">Member</a></li>
			<li><a href="../Preview.action">Purchase</a></li>
			<li><a href="<%= request.getContextPath() + "/views/login.jsp" %>">Login</a></li>
		</ul>
</div>
</nav>
</header>
</div>



<div class="main">
<ul class="slider">
<li><img src="../img/main.jpg" alt=""></li>
<li><img src="../img/main6.jpg" alt=""></li>
<li><img src="../img/main3.jpg" alt=""></li>
<li><img src="../img/main4.jpg" alt=""></li>
<li><img src="../img/main5.jpg" alt=""></li>
<!--/slider--></ul>
<h2><span class="js_typing">NBA and COMIC</span></h2>
	<header>
	<h3>自分に似た選手・キャラクターを見つけませんか？</h3>
	<a href="#" class="btnlinestretches2">タイプ診断</a>
	</header>
	<h2>NBA Player</h2>
	<header>
     <h3>Lebron James</h3>
     <p>NBA歴代NO.1選手候補の一人</p>
     </header>
     <p>全てに優れたオールラウンダー<br>
     ポジション：SF</p>
     <a href="#" class="btnlinestretches2">More</a>
     <h2>Comic Character</h2>
     <h3>桜木花道</h3>
     <p>漫画「スラムダンク」の主人公
     <p>リバウンドとディフェンスの鬼<br>
     ポジション：PF
     </p>
      <a href="#" class="btnlinestretches2">More</a>
</div>
<footer id="footer">
    <div class="footer-info">
    <p class="footer-logo">Taping</p>
    <address>〒111-111 東京都中央区 1-1-1</address>
    <ul>
        <li><dl><dt>TEL</dt><dd><a href="tel:03-1234-5678">03-1234-5678</a></dd></dl></li>
        <li><dl><dt>営業時間</dt><dd>平日 9:30～18:00</dd><dd>土・日・祝日 10:30～19：00</dd></dl></li>
    </ul>
    </div>

    <div class="footer-link">
       <ul>
			<li><a href="<%= request.getContextPath() + "/views/home.jsp" %>">Top</a></li>
			<li><a href="../Item.action">Items</a></li>
			<li><a href="<%= request.getContextPath() + "/views/cart.jsp" %>">Cart</a></li>
			<li><a href="<%= request.getContextPath() + "/views/member_info.jsp" %>">Member</a></li>
			<li><a href="../Preview.action">Purchase</a></li>
			<li><a href="<%= request.getContextPath() + "/views/login.jsp" %>">Login</a></li>
		</ul>
	<ul>
        <li><a href="#"><img src="img/ico_fb.svg" alt=""></a></li>
        <li><a href="#"><img src="img/ico_tw.svg" alt=""></a></li>
        <li><a href="#"><img src="img/ico_insta.svg" alt=""></a></li>
   </ul>
        <small>Copyright &copy; carking All rights Reserved.</small>
    </div>
	<p id="page-top" class="hide-btn"><a href="#"><span></span></a></p>
</footer>
<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>
<!--自作のJS-->
<script src="../js/6-1-7.js"></script>
</body>
</html>