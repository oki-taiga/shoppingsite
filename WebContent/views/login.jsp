<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Taping</title>
<link href="https://fonts.googleapis.com/css2?family=Sawarabi+Mincho&display=swap" rel="stylesheet">
<!--==============レイアウトを制御する独自のCSSを読み込み===============-->
<!--自作のCSS-->
<link rel="stylesheet" type="text/css" href="../css/origin.css">
<link rel="stylesheet" type="text/css" href="../css/parts.css">
<link rel="stylesheet" type="text/css" href="../css/layout.css">
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
<h2>Login</h2>
<form action="../jp.co.aforce/login" method="post">
	<p>${error}</p>
	<p>会員番号：<input type="text" name="member_id"></p>
	<p>パスワード：<input type="password" name="password"></p>
	<input type="submit" value="ログイン">
	<p><a class="link" href="regist.jsp">会員登録がお済出ない方はこちらへ</a> <p>
</form>
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
        <small>Copyright &copy; carking All rights Reserved.</small>
    </div>
	<p id="page-top" class="hide-btn"><a href="#"><span></span></a></p>
</footer>

</body>
</html>
