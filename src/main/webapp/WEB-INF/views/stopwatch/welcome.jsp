<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<title>ストップウォッチ</title>
	<link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/themes/default/css/base.css"></link>
</head>
<body>
	<div id="container">
		<h1>ストップウォッチ</h1>
		<div id="body">
			<p>ストップウォッチを開始してください.</p>
			<form method="post" action="start">
				<fieldset>
					<input type="submit" value="開始"/>
				</fieldset>
			</form>
		</div>
		<p class="footer"></p>
	</div>
</body>
</html>