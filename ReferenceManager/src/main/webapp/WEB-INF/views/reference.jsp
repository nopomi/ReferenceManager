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
    <body 
        <c:if test="${empty message}">
            onload="javascript:disableEdit()">
        </c:if>

        <h1></h1>

        <div class="container">

            <c:choose>
                <c:when test="${!empty messageUpdated}">
                    <div class="alert alert-success" role="alert">${messageUpdated}</div>
                </c:when>
                <c:when test="${!empty message}">
                    <br>
                    <div class="alert alert-danger" role="alert">${message}</div>
                </c:when>
            </c:choose>

            <c:choose>
                <c:when test="${reference.type == 'ARTICLE'}">
                    <jsp:include page="articleForm.jsp" >   
                        <jsp:param name="articlepath" value="/article/${reference.label}/update" />
                    </jsp:include>
                </c:when>

                <c:when test="${reference.type == 'BOOK'}">
                    <jsp:include page="bookForm.jsp" >   
                        <jsp:param name="bookpath" value="/book/${reference.label}/update" />
                    </jsp:include>
                </c:when>

                <c:when test="${reference.type == 'INPROCEEDINGS'}">
                    <jsp:include page="inproceedingsForm.jsp" >   
                        <jsp:param name="inproceedingspath" value="/inproceedings/${reference.label}/update" />
                    </jsp:include>                 
                </c:when>


                <c:when test="${reference.type == 'CONFERENCE'}">
                    <jsp:include page="conferenceForm.jsp" >  
                        <jsp:param name="conferencepath" value="/conference/${reference.label}/update" />
                    </jsp:include>
                </c:when>

                <c:when test="${reference.type == 'INCOLLECTION'}">
                    <jsp:include page="incollectionForm.jsp" >  
                        <jsp:param name="incollectionpath" value="/incollection/${reference.label}/update" />
                    </jsp:include>
                </c:when>

                <c:otherwise>
                    <jsp:include page="bookletForm.jsp" >   
                        <jsp:param name="bookletpath" value="/booklet/${reference.label}/update" />
                    </jsp:include>
                </c:otherwise>
            </c:choose>

            <div class="btn-toolbar" role="toolbar">
                <a class="btn btn-default" role="group "href="/references/">Back to main page</a>
                <div class="btn-group pull-right" role="group">
                    <button class="btn btn-default" onclick="undisableEdit()">Edit reference</button>
                    <a class="btn btn-danger" href="/references/delete/${reference.label}">Delete</a>
                </div>
            </div>

            <!--javascript-->
            <script src="../../js/bootstrap.js" type="text/javascript"></script>
    </body>
</html>