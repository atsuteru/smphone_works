<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<title>ストップウォッチの結果</title>
	<link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/themes/default/css/base.css"></link>
</head>
<body>
	<div id="container">
		<h1>ストップウォッチの結果</h1>
		<div id="body">
			<p>ストップウォッチの結果は次の通りです。</p>
			<code>
				開始: ${it.startTime}<br/>
				停止: ${it.stopTime}<br/>
				<b>時間: ${it.spanTime}</b>
			</code>
			<form method="get" action="index">
				<fieldset>
					<input type="submit" value="戻る" />
				</fieldset>
			</form>
		</div>
		<p class="footer"></p>
	</div>
</body>
</html>