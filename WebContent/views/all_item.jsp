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
<h1><a href="<%= request.getContextPath() + "/views/home.jsp" %>">Taping</a></h1>

<div class="g-nav-openbtn"><div class="openbtn-area"><span></span><span></span><span></span></div></div>
<nav id="g-nav">
<div id="g-nav-list">
		<ul id="g-navi" class="nav01c">
			<li><a href="<%= request.getContextPath() + "/views/home.jsp" %>">Top</a></li>
			<li><a href="Item.action">Items</a></li>
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
<h3>商品一覧</h3>
	<form action="Item.action" method="post">
	<input type="text" placeholder="キーワードを入力して下さい。" name="keyword">
	<input type="submit"  name="keyword" value="検索">
	</form>
	<hr>

	<table class="item_table">
	<c:forEach items="${list}" var="i">
	<tr>
	<td>商品${i.itemId}</td>
	<td><img src="img/${i.itemId}.jpg"></td>
	<td>${i.itemName}</td>
	<td>${i.itemPrice}円</td>
	<td class="big" width="100px"><a href="views/${i.itemId}.jsp">商品詳細</a></td>
	<td class="big" width="100px"><a href="CartAdd.action?itemid=${i.itemId}">カートに追加</a></td>
	</tr>


	</c:forEach>
	</table>
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