<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="../../css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../../css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>

        <title>Reference</title>
    </head>
    <body>
        <h1></h1>


        <div class="container">

            <div class="panel panel-default">
                <div class="panel-heading"><h4 class="panel-title">Reference</h4></div>
                <div class="panel-body">   

                    <c:choose>
                        <c:when test="${reference.type = article}">
                            Id: ${reference.refId} <br>
                            Author: ${reference.author} <br>
                            Title: ${reference.title} <br>
                            Year: ${reference.year} <br>
                            Journal: ${reference.journal} <br>
                            Volume: ${reference.volume} <br>
                            Number: ${reference.number} <br>
                            Pages: ${reference.pages} <br>
                            Publisher: ${reference.publisher} <br>
                            Address: ${reference.address} <br> 
                        </c:when>
                        <c:when test="${reference.type = book}">
                            Id: ${reference.refId} <br>
                            Author: ${reference.author} <br>
                            Title: ${reference.title} <br>
                            Year: ${reference.year} <br>          
                            Address: ${reference.address} <br>                  
                        </c:when>
                        <c:otherwise>
                            Id: ${reference.refId} <br>
                            Author: ${reference.author} <br>
                            Title: ${reference.title} <br>
                            Year: ${reference.year} <br>
                            Booktitle: ${reference.booktitle} <br> 
                            Pages: ${reference.pages} <br>
                            Publisher: ${reference.publisher} <br>
                            Address: ${reference.address} <br>                
                        </c:otherwise>
                    </c:choose>

                    <br>


                    <a href="path_to_file" download>Download reference in BibTex format</a>

                </div>
            </div>
        </div>

        <!--javascript source-->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="../../js/bootstrap.js" type="text/javascript"></script>
    </body>
</html>
