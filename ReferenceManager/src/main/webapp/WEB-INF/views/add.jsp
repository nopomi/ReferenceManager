<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ReferenceManager</title>
    </head>
    <body>
        <h1>References</h1>

        <h2>Add new reference</h2>

        <div>
            Enter reference information:<br/>
            <form action="/add" method="POST">
                ID: <input type="text" name="id" id="id"/><br/>
                Reference text: <input type="text" name="reference" id="reference"/><br/>
                <input type="submit"/>            
            </form>
        </div>

    </body>
</html>
