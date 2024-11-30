<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>${message}</h1>
<h1>Hello hello hello and welcome to yet another recreational programming session</h1>
<ul>
    <c:forEach var="book" items="${books}">
        <li>${book.title} - ${book.description}</li>
    </c:forEach>
</ul>
</body>
</html>
