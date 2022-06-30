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



<div class="sub">
<h1>会員情報変更</h1>
<form action="../jp.co.aforce/member_update" method="post">
	<p style="color:red">${error }<p>

	<p>■会員番号<input type="text" name="member_id" maxlength="20"></p>
	<label for="name">■名前</label>
	<p>姓　<input type="text" name="last_name" id="name" maxlength="32">
	名　<input type="text" name="first_name" id="name">${error }</p>

	<label for="sex">■性別</label>
	<p><input type="radio" name="sex"  value="1">男
	<input type="radio" name="sex" value="2">女</p>


	<label for="birth">■生年月日</label>
	<p>
	<div class="form-select-wrap">
		<select name="birth_year" class="birth_year">
		</select>

		<select name="birth_month" class="birth_month">
		</select>

		<select name="birth_day" class="birth_day">
		</select>
	</div>


	<label for="phone_number">■電話番号</label>
	<p><input type="number" name="phone_number" id="phone_number" maxlength="32"></p>

	<label for="mail_address">■メールアドレス</label>
	<p><input type="text" name="mail_address" id="mail_address" maxlength="32"></p>

	<label for="password">■パスワード</label>
	<p><input type="password" name="password" id="password" maxlength="20"></p>

<button type="reset" value="リセット">リセット</button>
<button type="submit" value="変更">変更</button>
</form>
</div>
</body>
</html>
