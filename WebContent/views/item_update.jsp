<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.html" %>
<h2>商品更新</h2>
<form action="../jp.co.aforce/item_update" method="post">
	<p>商品番号:<input type="text" name="item_id"></p>
	<p>商品名：<input type="text" name="item_name" maxlength="20">${error }</p>
	<p>価格：<input type="number" name="item_price" maxlength="9">${error }</p>
	<p>分類：<input type="text" name="category" maxlength="9">${error }</p>
	<p>商品説明：<textarea name="explanation" cols="20" rows="10" maxlength="200" >${error }</textarea></p>
	<input type="submit" value="更新">
</form>
<%@include file="footer.html" %>