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
<h1>診断画面</h1>
<form action="" method="post">
	<p>質問①:質問内容</p>
	<p><input type="radio" name="question1" value="5">はい<input type="radio" name="question1" value="0">いいえ<input type="radio" name="question1" value="2">どちらでもない</p>
	<p>質問②:質問内容</p>
	<p><input type="radio" name="question2" value="5">はい<input type="radio" name="question2" value="0">いいえ<input type="radio" name="question2" value="2">どちらでもない
	<p>質問③:質問内容</p>
	<p><input type="radio" name="question3" value="5">はい<input type="radio" name="question3" value="0">いいえ<input type="radio" name="question3" value="2">どちらでもない</p>
	<p>質問④:質問内容</p>
	<p><input type="radio" name="question4" value="5">はい<input type="radio" name="question4" value="0">いいえ<input type="radio" name="question4" value="2">どちらでもない</p>
	<p>質問⑤:質問内容</p>
	<p><input type="radio" name="question5" value="5">はい<input type="radio" name="question5" value="0">いいえ<input type="radio" name="question5" value="2">どちらでもない</p>
	<input type="submit" value="診断完了">
	<p style="color:red">${error }<p>
</form>
</body>
</html>