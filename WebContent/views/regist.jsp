<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ALL Basket</title>
<link href="https://fonts.googleapis.com/css2?family=Sawarabi+Mincho&display=swap" rel="stylesheet">
<!--==============レイアウトを制御する独自のCSSを読み込み===============-->
<!--自作のCSS-->
<link rel="stylesheet" type="text/css" href="../css/origin.css">
<link rel="stylesheet" type="text/css" href="../css/parts.css">
<link rel="stylesheet" type="text/css" href="../css/layout.css">
</head>
<h2>会員登録</h2>
<form action="../jp.co.aforce/member_regist" method="post">
	<p style="color:red">${error }<p>
	<label for="name">■名前</label>
	<p>姓　<input type="text" name="last_name" id="name" maxlength="32">
	名　<input type="text" name="first_name" id="name"></p>

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
	</p>

	<label for="phone_number">■電話番号</label>
	<p><input type="number" name="phone_number" id="phone_number" maxlength="11"></p>

	<label for="mail_address">■メールアドレス</label>
	<p><input type="text" name="mail_address" id="mail_address" maxlength="32"></p>

	<label for="password">■パスワード</label>
	<p><input type="password" name="password" id="password" maxlength="20"></p>

<button type="reset" value="リセット">リセット</button>
<button type="submit" value="登録">登録</button>
</form>
<script type="text/javascript" src="../js/date-input-control.js"></script>
</body>
</html>