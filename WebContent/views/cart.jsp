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
			<li><a href="<%= request.getContextPath() + "/Preview.action" %>">Purchase</a></li>
			<li><a href="<%= request.getContextPath() + "/views/login.jsp" %>">Login</a></li>
		</ul>
</div>
</nav>
</header>
</div>
<c:choose>
	<c:when test="${cart.size()>0}">
	<div class="cart">
		<p>${cart.size()}種類の商品があります。</p>
		<hr>
	</div>
	</c:when>
	<c:otherwise>
	<div class="cart">
		<p class="error_message">カートに商品がありません。</p>
	</div>
	</c:otherwise>
</c:choose>

<table class="cart_table">
<c:forEach var="i" items="${cart}">
	<tr>
	<td>商品${i.itemBean.itemId}</td>
	<td><img src="<%= request.getContextPath()%>/img/${i.itemBean.itemId}.jpg "height="96"></td>
	<td>${i.itemBean.itemName}</td>
	<td>${i.itemBean.itemPrice}円</td>
	<td>${i.count}個</td>
	<td><a href="<%= request.getContextPath() + "/CartRemove.action" %>?itemid=${i.itemBean.itemId}">カートから削除</a></td>
	</tr>
	<!-- <img src="<%= request.getContextPath() + "/img/${i.itemBean.itemId}.jpg" %>" height="96"> -->
</c:forEach>
</table>

</body>
</html>