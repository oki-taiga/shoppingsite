<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Taping</title>
<link href="https://fonts.googleapis.com/css2?family=Sawarabi+Mincho&display=swap" rel="stylesheet">
<!--==============レイアウトを制御する独自のCSSを読み込み===============-->
<!--自作のCSS-->

<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() + "/css/origin.css" %>">
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() + "/css/parts.css" %>">
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() + "/css/layout.css" %>">

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
			<li><a href="<%= request.getContextPath() + "/Item.action" %>">Items</a></li>
			<li><a href="<%= request.getContextPath() + "/views/cart.jsp" %>">Cart</a></li>
			<li><a href="<%= request.getContextPath() + "/views/member_info.jsp" %>">Member</a></li>
			<li><a href="Preview.action">Purchase</a></li>
			<li><a href="<%= request.getContextPath() + "/views/login.jsp" %>">Login</a></li>
		</ul>
</div>
</nav>
</header>
</div>

<div class="main">
<h2>購入画面</h2>

<p>${cart.size()}種類の商品があります。</p>
<hr>

<table style="border-collapse:separate;border-spacing:10px;" class="purchase_table">
<c:forEach var="i" items="${cart}">
	<tr>
	<td>商品${i.itemBean.itemId}</td>
	<td><img src="img/${i.itemBean.itemId}.jpg" height="96"></td>
	<td>${i.itemBean.itemName}</td>
	<td>${i.itemBean.itemPrice}円</td>
	<td>${i.count}個</td>
	</tr>
</c:forEach>
</table>
</hr>

<div class="format">
<form action="Purchase.action" method="post">
<p>お支払方法：
	<select name="purchase_method">
	<option value="" selected hidden></option>
	<option value="credit">クレジット</option>
	<option value="bank_transfar">銀行振込</option>
	<option value="gift_token">ギフト券</option>
	<option value="point">ポイント</option>
	</select>
</p>
<p>お届け先郵便番号：<input type="text" name="zip_code"></p>
<p>お届け先住所：<input type="text" name="address"></p>
<p>日時指定：
	<select name="date">
	<option value="" selected hidden></option>
	<option value="today">本日</option>
	<option value="tommorow">明日</option>
	<option value="day_after_tommorow">明後日</option>
	</select>
</p>
<p><input type="submit" value="購入"></p>
</form>
</div>
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
</head>
</html>