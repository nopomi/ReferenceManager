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


            <!--buttons to open reference form-->

            <div class ="row">
                <a class="btn btn-default" data-toggle="collapse" href="#articleReference" aria-expanded="false" aria-controls="collapseExample">
                    New article reference
                </a>
                <a class="btn btn-default" data-toggle="collapse" href="#bookReference" aria-expanded="false" aria-controls="collapseExample">
                    New book reference
                </a>
                <a class="btn btn-default" data-toggle="collapse" href="#inproceedingsReference" aria-expanded="false" aria-controls="collapseExample">
                    New inproceedings reference
                </a>
            </div>

            <br>

            <!--article reference form-->

            <div class="collapse" id="articleReference">

                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            New Article Reference
                        </h4>
                    </div> 

                    <div class="panel-body">
                        <form class="form-horizontal" role="form" action="/article" method="POST" >

                            <div class="form-group">
                                <label class="col-xs-1 control-label" for="id">Id</label>
                                <div class ="col-xs-11">
                                    <input class="form-control" type="text" id ="id" name="id">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-1 control-label" for="author">Author</label>
                                <div class="col-xs-11">
                                    <input class="form-control" type="text" name="author" id="author">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-1 control-label" for="title">Title</label> 
                                <div class="col-xs-11">
                                    <input class="form-control" type="text" name="tilte" id="title">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-1 control-label" for="journal">Journal</label> 
                                <div class="col-xs-11">
                                    <input class="form-control" type="text" name="journal" id="journal">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-1 control-label" for="volume">Volume</label>  
                                <div class="col-xs-11">
                                    <input class="form-control" type="text" name="volume" id="volume">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-1 control-label" for="number">Number</label>   
                                <div class="col-xs-11">
                                    <input class="form-control" type="text" name="number" id="number">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-1 control-label" for="year">Year</label>     
                                <div class="col-xs-11">  
                                    <input class="form-control" type="text" name="year" id="year"></div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-1 control-label" for="pages">Pages</label>                    
                                <div class="col-xs-11">                    
                                    <input class="form-control" type="text" name="pages" id="pages"></div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-1 control-label" for="publisher">Publisher</label>                    
                                <div class="col-xs-11">                                       
                                    <input class="form-control" type="text" name="publisher" id="publisher"></div>
                            </div>

                            <div class="form-group">
                                <label class="col-xs-1 control-label" for="address">Address</label> 
                                <div class="col-xs-11">                                       
                                    <input class="form-control" type="text" name="address" id="address">
                                </div>
                            </div>

                            <button type="submit" class="btn btn-default">Add reference</button>

                        </form>
                    </div>
                </div>
            </div>

            <!--book reference form-->

            <div class="collapse" id="bookReference">

                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">New Book Reference</h4>
                    </div>
                    <div class="panel-body">
                        <form class="form-horizontal" role="form" action="/book" method="POST" >

                            <div class="form-group">
                                <label for="id" class="col-xs-1 control-label">Id</label>
                                <div class ="col-xs-11">
                                    <input class="form-control" type="text" id ="id" name="id"> 
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="author" class="col-xs-1 control-label">Author</label>   
                                <div class ="col-xs-11">
                                    <input class="form-control" type="text" name="author" id="author">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="title" class="col-xs-1 control-label">Title</label>    
                                <div class ="col-xs-11">
                                    <input class="form-control" type="text" name="title" id="title">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="year" class="col-xs-1 control-label">Year</label>   
                                <div class ="col-xs-11">
                                    <input class="form-control" type="text" name="year" id="year">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="address" class="col-xs-1 control-label">Address</label>        
                                <div class ="col-xs-11">
                                    <input class="form-control" type="text" name="address" id="address">
                                </div>
                            </div>

                            <button type="submit" class="btn btn-default">Add reference</button>
                        </form>
                    </div>
                </div>
            </div>

            <!--inproceedings reference form-->

            <div class="collapse" id="inproceedingsReference">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">New Inproceedings Reference</h4>
                    </div>
                    <div class="panel-body">
                        <form class="form-horizontal" role="form" action="/inproceedings" method="POST" >

                            <div class="form-group">
                                <label for="id" class="col-xs-1 control-label">Id</label>
                                <div class ="col-xs-11">
                                    <input class="form-control" type="text" id ="id" name="id">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="author" class="col-xs-1 control-label">Author</label>
                                <div class ="col-xs-11">
                                    <input class="form-control" type="text" name="author" id="author">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="title" class="col-xs-1 control-label">Title</label>
                                <div class ="col-xs-11">
                                    <input class="form-control" type="text" name="title" id="title">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="booktitle" class="col-xs-1 control-label">Booktitle</label>
                                <div class ="col-xs-11">
                                    <input class="form-control" type="text" name="booktitle" id="booktitle">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="year" class="col-xs-1 control-label">Year</label> 
                                <div class ="col-xs-11">
                                    <input class="form-control" type="text" name="year" id="year">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="pages" class="col-xs-1 control-label">Pages</label>               
                                <div class ="col-xs-11">
                                    <input class="form-control" type="text" name="pages" id="pages">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="publisher" class="col-xs-1 control-label">Publisher</label>  
                                <div class ="col-xs-11">
                                    <input class="form-control" type="text" name="publisher" id="publisher">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="address" class="col-xs-1 control-label">Address</label>  
                                <div class ="col-xs-11">
                                    <input class="form-control" type="text" name="address" id="address">
                                </div>
                            </div>

                            <button type="submit" class="btn btn-default">Add reference</button>
                        </form>
                    </div>
                </div>
            </div>


            <!--all references in list-->

            <div class="panel panel-default">
                <div class="panel-heading"><h4 class="panel-title">Reference list</h4></div>
                <div class="panel-body">
                    <table class="table table-striped">  
                        <thead>                          
                            <tr>                               
                                <th>Id</th>
                                <th>Author</th>
                                <th>Title</th>
                                <th>Year</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:choose>
                                <c:when test="${not empty references}">
                                    <c:forEach var="reference" items="${references}">
                                        <tr>
                                            <td>${reference.refId}</td>
                                            <td>${reference.author}</td>
                                            <td>${reference.title}</td>
                                            <td>${reference.year}</td>

                                        </tr>
                                    </c:forEach>    
                                </c:when>
                                <c:otherwise>
                                    <tr>
                                        <td>No references yet!</td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                    </tr>
                                </c:otherwise>
                            </c:choose>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>


        <!--javascript source-->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="../../js/bootstrap.js" type="text/javascript"></script>
    </body>
</html>

