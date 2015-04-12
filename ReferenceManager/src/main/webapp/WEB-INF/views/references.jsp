<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>References</title>
    </head>
    <body>
        <h1>References</h1>

        <h2>Existing references</h2>

        <ol>
            <c:forEach var="reference" items="${references}">
                <li>${reference.refId} --- ${reference.reference}</li>
            </c:forEach>
        </ol>
    </body>
</html>
