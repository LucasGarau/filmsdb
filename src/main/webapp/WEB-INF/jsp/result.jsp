<!DOCTYPE HTML>
<html xmlns:th="https://www.thymeleaf.org">
<head>
    <title>Getting Started: Handling Form Submission</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<h1>Sucess</h1>
<p th:text="'id: ' + ${greeting.id}" />
<p th:text="'content: ' + ${greeting.content}" />
<a href="/rent">Rent other</a>
</body>
</html>