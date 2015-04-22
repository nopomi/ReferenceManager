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
    <body onload="javascript:disableForm()">
        <h1></h1>

        <div class="container">

            <c:choose>
                <c:when test="${reference.type == 'ARTICLE'}">
                    <jsp:include page="articleForm.jsp" >   
                        <jsp:param name="articlepath" value="/article/update" />
                    </jsp:include>
                </c:when>
                
                <c:when test="${reference.type == 'BOOK'}">
                    <jsp:include page="bookForm.jsp" >   
                        <jsp:param name="bookpath" value="/book/update" />
                    </jsp:include>
                </c:when>
                
                <c:when test="${reference.type == 'INPROCEEDINGS'}">
                    <jsp:include page="inproceedingsForm.jsp" >   
                        <jsp:param name="inproceedingspath" value="/inproceedings/update" />
                    </jsp:include>                 
                </c:when>
                
                
                <%--<c:when test="${reference.type == 'CONFERENCE'}">--%>
                    <%--<jsp:include page="conferenceForm.jsp" >--%>   
                        <%--<jsp:param name="conferencepath" value="/conference/update" />--%>
                    <%--</jsp:include>--%>
                <%--</c:when>--%>
                
                <%--<c:when test="${reference.type == 'INCOLLECTION'}">--%>
                    <%--<jsp:include page="incollectionForm.jsp" >--%>   
                        <%--<jsp:param name="incollectionpath" value="/incollection/update" />--%>
                    <%--</jsp:include>--%>
                <%--</c:when>--%>
                
                <c:otherwise>
                    <jsp:include page="bookletForm.jsp" >   
                        <jsp:param name="bookletpath" value="/booklet/update" />
                    </jsp:include>
                </c:otherwise>
            </c:choose>

            <button class="btn btn-default" onclick="undisableForm()">Edit</button>
            <a class="btn btn-danger" href="/references/delete/${reference.label}">Delete</a>
        </div>
    </div>
</div>

<!--javascript-->
<script>
    function disableForm() {
        var form = document.getElementById("referenceForm");
        var elements = form.elements;
        for (var i = 0, len = elements.length; i < len; ++i) {
            elements[i].disabled = true;
        }
    }
</script>

<script>
    function undisableForm() {
        var form = document.getElementById("referenceForm");
        var elements = form.elements;
        for (var i = 0, len = elements.length; i < len; ++i) {
            elements[i].disabled = false;
        }
    }
</script>

</body>
</html>