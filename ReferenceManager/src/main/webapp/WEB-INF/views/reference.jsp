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
                <div class="panel-heading"><h4 class="panel-title">${reference.title}</h4></div>
                <div class="panel-body">   

                    <c:choose>
                        <c:when test="${reference.type == 'ARTICLE'}">
                            Label: ${reference.label} <br>
                            Author: ${reference.author} <br>
                            Title: ${reference.title} <br>
                            Year: ${reference.year} <br>
                            Journal: ${reference.journal} <br>
                            Volume: ${reference.volume} <br>
                            Number: ${reference.number} <br>
                            Pages: ${reference.pages} <br>
                            Month: ${reference.month} <br>
                            Note: ${reference.note} <br>
                            Key: ${reference.key} <br>
                            
                        </c:when>
                        <c:when test="${reference.type == 'BOOK'}">
                            Label: ${reference.label} <br>
                            Author: ${reference.author} <br>
                            Title: ${reference.title} <br>
                            Year: ${reference.year} <br>
                            Publisher: ${reference.publisher} <br>
                            Volume: ${reference.volume} <br> 
                            Series: ${reference.series} <br> 
                            Edition: ${reference.edition} <br>
                            Address: ${reference.address} <br> 
                            Month: ${reference.month} <br> 
                            Note: ${reference.note} <br> 
                            Key: ${reference.key} <br>
                        </c:when>
                        <c:otherwise>
                            Label: ${reference.label} <br>
                            Author: ${reference.author} <br>
                            Title: ${reference.title} <br>
                            Year: ${reference.year} <br>
                            Editor: ${reference.editor} <br>
                            Volume: ${reference.volume} <br> 
                            Series: ${reference.series} <br> 
                            Pages: ${reference.pages} <br>
                            Address: ${reference.address} <br> 
                            Month: ${reference.month} <br> 
                            Organization: ${reference.organization} <br> 
                            Publisher: ${reference.publisher} <br> 
                            Note: ${reference.note} <br> 
                            Key: ${reference.key} <br> 
                        </c:otherwise>
                    </c:choose>

                </div>
            </div>
        </div>

        <!--javascript source-->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="../../js/bootstrap.js" type="text/javascript"></script>
    </body>
</html>