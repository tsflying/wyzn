<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String jspPath = path+"/WEB-INF/jsp/";
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
String newLocn = "/wyzn/index.do";
response.setHeader("Location",newLocn);
%>
<!DOCTYPE html>
<html lang="en">
<head>
  	<title>万友智能</title>
  	<meta charset="utf-8" />
</head>
<body>

</body>
</html>