<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>E2</title>
<link rel="stylesheet" href="../css/shopping_site.css">
</head>
<body>
<form action="../jp.co.aforce/administrator" method="post">
<div class="menu">
<h1>管理者画面</h1>
<p><button type="submit" value="商品登録" name="item_regist">商品登録</button></p>
<p><button type="submit" value="商品更新" name="item_update">商品更新</button></p>
<p><button type="submit" value="商品削除" name="item_delete">商品削除</button></p>
<p><a href="<%= request.getContextPath() + "/views/home.jsp" %>">サイトへ戻る</a>
</div>
</form>
</body>
</html>