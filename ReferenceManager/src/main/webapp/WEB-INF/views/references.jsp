<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="../../css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../../css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>

        <title>References</title>
    </head>

    <body>
        <h1></h1>
        <div class="container">      


            <!--add reference panel-->
            <div class="panel panel-default">
                <div class="panel-heading"><h4 class="panel-title">Add new reference</h4></div>
                <div class="panel-body">
                    <form role="form" action="/references" method="POST" >

                        <div class="row">
                            <label class="col-xs-2" for="id">Id</label>
                            <label class="col-xs-10" for="reference">Reference</label>                    
                        </div>
                        <div class="row">
                            <div class="col-xs-2"><input class="form-control" type="text" id ="id" name="id" placeholder="id"></div>
                            <div class="col-xs-10"><input class="form-control" type="text" name="reference" id="reference" placeholder="reference"></div>
                        </div>

                        <div class="row">
                            <div class="col-xs-12">
                                <br>
                                <button name="add" type="submit" class="btn btn-default">Add reference</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>

            <!--reference list panel-->
            <div class="panel panel-default">
                <div class="panel-heading"><h4 class="panel-title">Reference list</h4></div>
                <div class="panel-body">
                    <table class="table table-striped">  
                        <thead>                          
                            <tr>                               
                                <th>Id</th>
                                <th>Reference</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:choose>
                                <c:when test="${not empty references}">
                                    <c:forEach var="reference" items="${references}">
                                        <tr>
                                            <td>${reference.refId}</td>
                                            <td>${reference.reference}</td>
                                        </tr>
                                    </c:forEach>    
                                </c:when>
                                <c:otherwise>
                                    <tr>
                                        <td>No references yet!</td>
                                        <td></td>
                                    </tr>
                                </c:otherwise>
                            </c:choose>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

    </body>
</html>

