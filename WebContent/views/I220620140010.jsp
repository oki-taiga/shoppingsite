<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Taping</title>
<link
	href="https://fonts.googleapis.com/css2?family=Sawarabi+Mincho&display=swap"
	rel="stylesheet">
<!--==============レイアウトを制御する独自のCSSを読み込み===============-->
<!--自作のCSS-->

<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath() + "/css/origin.css"%>">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath() + "/css/parts.css"%>">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath() + "/css/layout.css"%>">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.7.1/css/lightbox.css"
	rel="stylesheet">

</head>
<body>
	<div id="container">
		<header id="header">
			<h1>
				<a href="<%=request.getContextPath() + "/views/home.jsp"%>">Taping</a>
			</h1>


			<div class="g-nav-openbtn">
				<div class="openbtn-area">
					<span></span><span></span><span></span>
				</div>
			</div>
			<nav id="g-nav">
				<div id="g-nav-list">
					<ul id="g-navi" class="nav01c">
						<li><a
							href="<%=request.getContextPath() + "/views/home.jsp"%>">Top</a></li>
						<li><a href="../Item.action">Items</a></li>
						<li><a
							href="<%=request.getContextPath() + "/views/cart.jsp"%>">Cart</a></li>
						<li><a
							href="<%=request.getContextPath() + "/views/member_info.jsp"%>">Member</a></li>
						<li><a href="../Preview.action">Purchase</a></li>
						<li><a
							href="<%=request.getContextPath() + "/views/login.jsp"%>">Login</a></li>
					</ul>
				</div>
			</nav>
		</header>
	</div>

	<div class="detail_main">
	<p>レブロン19</p>
		<div class="detail_img">
			<div class="slider">
				<img id="view" src="../img/I220620140010.jpg">
				<i id="prev"class="fas fa-arrow-circle-left"></i>
				 <i id="next"class="fas fa-arrow-circle-right"></i>
			</div>
			<nav class="thumbnail">
				<ul id="thumbnailList">
				</ul>
			</nav>
			<h3>15000円(税込)</h3>
			<p>レブロン・ジェームズは、プレッシャーがのしかかる、いちかばちかのときに本領を発揮します。<br>
			レブロン 19は、安定したフィット感と最新のクッションシステムで、エネルギーをコントロール。<br>
			快適なインナースリーブと、シューレースを通す立体的なオーバーレイの組み合わせにより、シューズの中で足が動くのを防ぎます。<br>
			シュータンと履き口にポッドを埋め込むことで軽量化を実現し、足首のずれを防止。<br>
			しっかりとした履き心地で安心感があるため、際どい試合で全力を尽くすことができます。<p>

			<p>他のおすすめ商品</p>
			<table class="recommend_table">
				<tr>
					<th><img src="../img/I220620165255.jpg"><a href="I220620165255.jsp"></a></th>
					<th><img src="../img/I220628114413.jpg"><a href="I220628114413.jsp"></a></th>
					<th><img src="../img/I220628150845.jpg"></th>
				</tr>
				<tr>
					<td><a href="I220620165255.jsp">カリー ホバー スプラッシュ</a></td>
					<td><a href="I220628114413.jsp">SLAMDUNK スラムダンク Tシャツ 花道</a></td>
					<td>ウォリアーズ 優勝記念パーカー</td>
				</tr>
				<tr>
					<td>12100円</td>
					<td>4070円</td>
					<td>26400円</td>
				</tr>

			</table>

		</div>

	</div>
<div class="bottom">
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
</div>
<script src="../js/img_slider1.js"></script>
</body>
</html>