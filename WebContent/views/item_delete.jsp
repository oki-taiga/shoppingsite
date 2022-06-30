<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.html" %>
<h2>商品削除</h2>
<form action="../jp.co.aforce/item_delete" method="post">
	<p>商品番号：<input type="text" name="item_id" maxlength="20">${error }</p>

	<input type="submit" value="削除">
</form>
<%@include file="footer.html" %>