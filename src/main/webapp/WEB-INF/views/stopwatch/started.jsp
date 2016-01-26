<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<title>ストップウォッチ計測中</title>
	<link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/themes/default/css/base.css"></link>
</head>
<body>
	<div id="container">
		<h1>ストップウォッチ計測中</h1>
		<div id="body">
			<p>ストップウォッチで計測しています...</p>
			<code>
				開始: ${it.startTime}
			</code>
			<form method="post" action="stop">
				<fieldset>
					<input type="hidden" name="startTime" value="${it.startTime}"/>
					<input type="submit" value="停止" />
				</fieldset>
			</form>
		</div>
		<p class="footer"></p>
	</div>
</body>
</html>