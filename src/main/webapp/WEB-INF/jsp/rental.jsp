<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>
<h1>Rental</h1>

<ul>
    <c:forEach var="f" items="${films}">
        <li> ${f.title} </li>
    </c:forEach>
</ul>

</body>
</html>