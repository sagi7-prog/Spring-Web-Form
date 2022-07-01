<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/alumno/save" method="post">
    Paterno : <input type="text" name="apePat"> <br>
    Materno : <input type="text" name="apeMat"> <br>
    Nombre : <input type="text" name="nombre"> <br>

    <input type="submit" value="Guardar"></p>

</form>

<p>${FullName}</p>

</body>
</html>
