
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>


<!DOCTYPE html>
<html>
    <head>
        <title>*ReferenceManager*</title>

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="../../resources/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../../resources/css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>

    </head>

    <body>
        <h1></h1>
        <div class="container">      

            <div class="panel panel-default">
                <div class="panel-heading"><h4 class="panel-title">Add new reference</h4></div>
                <div class="panel-body">
                    <form role="form" action="/references" method="POST" >
                        <div class="row">
                            <div class="col-xs-12"><input class="form-control" type="text" id ="reference" placeholder="new reference here"></div>

                        </div>
                        <div class="row">
                            <div class="col-xs-12">
                                <br>
                                <button type="submit" class="btn btn-default">Add reference</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>

            <div class="panel panel-default">
                <div class="panel-heading"><h4 class="panel-title">All references</h4></div>
                <div class="panel-body">
          <ol>
            <c:forEach var="reference" items="${referenceService.list()}">
                <li>${reference.text}</li>
            </c:forEach>
        </ol>            
                </div>
            </div>
        </div>
    </body>
</html>
