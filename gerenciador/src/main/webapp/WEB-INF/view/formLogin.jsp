<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkEntradaServlet"></c:url>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<form action="${linkEntradaServlet }" method="post"> 

	Login: <input type="text" name="login"/> <br>
	Senha: <input type="password" name="senha"/>
	
	<input type="hidden" name="acao" value="Login">
	
	<br>
	<input type="submit" /> 


</form>

</body>
</html>