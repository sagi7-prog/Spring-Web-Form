<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/alumno/save" method="post">

    <label for="apePat">Paterno</label> : <input type="text" name="apePat" id="apePat"> <br>
    <label for="apeMat">Materno</label> : <input type="text" name="apeMat" id="apeMat"> <br>
    <label for="nombre">Nombre</label> : <input type="text" name="nombre" id="nombre"> <br>

    <input type="submit" value="Guardar"></p>

</form>

<p>${FullName}</p>

</body>
</html>
