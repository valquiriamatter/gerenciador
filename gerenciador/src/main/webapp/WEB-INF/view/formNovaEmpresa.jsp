<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkEntradaServlet"></c:url>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:import url="logout-parcial.jsp"/>

<form action="${linkEntradaServlet}" method="post"> 

	Nome: <input type="text" name="nome"> <br>
	Data Abertura: <input type="text" name="data">
	
	<input type="hidden" name="acao" value="NovaEmpresa">
	
	<br>
	<input type="submit" /> 


</form>

</body>
</html>