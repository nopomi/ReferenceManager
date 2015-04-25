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

            <!--tabs to open reference form-->

            <div role="tabpanel">
                <ul class="nav nav-tabs" role="tablist">
                    <li role="presentation" class="active"><a href="#articleReference" aria-controls="articleReference" role="tab" data-toggle="tab">New article reference</a></li>
                    <li role="presentation"><a href="#bookReference" aria-controls="bookReference" role="tab" data-toggle="tab">New book reference</a></li>
                    <li role="presentation"><a href="#inproceedingsReference" aria-controls="inproceedingsReference" role="tab" data-toggle="tab">New inproceedings reference</a></li>
                    <li role="presentation"><a href="#conferenceReference" aria-controls="conferenceReference" role="tab" data-toggle="tab">New conference reference</a></li>
                    <li role="presentation"><a href="#inCollectionReference" aria-controls="inCollectionReference" role="tab" data-toggle="tab">New incollection reference</a></li>
                    <li role="presentation"><a href="#bookletReference" aria-controls="bookletReference" role="tab" data-toggle="tab">New booklet reference</a></li>

                </ul>

            </div>

            <!--all forms in tabpanels-->
            <div class="tab-content">
                <c:if test="${!empty message}">
                    <p>${message}</p>
                </c:if>

                <div role="tabpanel" class="tab-pane active" id="articleReference">
                    <jsp:include page="articleForm.jsp" >   
                        <jsp:param name="articlepath" value="/article" />
                    </jsp:include>
                </div>

                <div role="tabpanel" class="tab-pane" id="bookReference">
                    <jsp:include page="bookForm.jsp" >   
                        <jsp:param name="bookpath" value="/book" />
                    </jsp:include>
                </div>

                <div role="tabpanel" class="tab-pane" id="inproceedingsReference">  
                    <jsp:include page="inproceedingsForm.jsp" >   
                        <jsp:param name="inproceedingspath" value="/inproceedings" />
                    </jsp:include>
                </div>

                <div role="tabpanel" class="tab-pane" id="conferenceReference">
                    <jsp:include page="conferenceForm.jsp" >   
                        <jsp:param name="conferencepath" value="/conference" />
                    </jsp:include>
                </div>

                <div role="tabpanel" class="tab-pane" id="inCollectionReference">
                    <jsp:include page="incollectionForm.jsp" >   
                        <jsp:param name="incollectionpath" value="/incollection" />
                    </jsp:include>
                </div>

                <div role="tabpanel" class="tab-pane" id="bookletReference">
                    <jsp:include page="bookletForm.jsp" >   
                        <jsp:param name="bookletpath" value="/booklet" />
                    </jsp:include>
                </div>
            </div>

            <!--all references in list-->
            <%@ include file="allReferencesList.jsp" %>

        </div>



        <!--javascript source-->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="../../js/bootstrap.js" type="text/javascript"></script>
    </body>
</html>


