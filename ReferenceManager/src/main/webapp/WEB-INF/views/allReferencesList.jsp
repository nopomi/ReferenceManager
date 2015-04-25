<div class="panel panel-default">
    <div class="panel-heading"><h4 class="panel-title">Reference list</h4></div>
    <div class="panel-body">
        <table class="table table-striped">  
            <thead>                          
                <tr>       
                    <th>Label</th>
                    <th>Type</th>

                    <th>Author</th>
                    <th>Title</th>
                    <th>Year</th>
                </tr>
            </thead>
            <tbody>
            <c:choose>
                <c:when test="${not empty articles or not empty books or not empty inps or not empty conferences or not empty incollections or not empty booklets}">
                    <c:forEach var="article" items="${articles}">
                        <tr>
                            <td><a href="/references/${article.label}">${article.label}</td>
                            <td>Article Reference</td>

                            <td>${article.author}</td>
                            <td>${article.title}</td>
                            <td>${article.year}</td>
                        </tr>
                    </c:forEach>

                    <c:forEach var="book" items="${books}">
                        <tr>
                            <td><a href="/references/${book.label}">${book.label}</td>
                            <td>Book Reference</td>

                            <td>${book.author}</td>
                            <td>${book.title}</td>
                            <td>${book.year}</td>

                        </tr>
                    </c:forEach>
                            
                    <c:forEach var="inp" items="${inps}">
                        <tr>
                            <td><a href="/references/${inp.label}">${inp.label}</td>
                            <td>Inproceedings Reference</td>

                            <td>${inp.author}</td>
                            <td>${inp.title}</td>
                            <td>${inp.year}</td>

                        </tr>
                    </c:forEach>
                                 
                    <c:forEach var="conference" items="${conferences}">
                        <tr>
                            <td><a href="/references/${conference.label}">${conference.label}</td>
                            <td>Conference Reference</td>

                            <td>${conference.author}</td>
                            <td>${conference.title}</td>
                            <td>${conference.year}</td>

                        </tr>
                    </c:forEach>
                            
                            <c:forEach var="incollection" items="${incollections}">
                        <tr>
                            <td><a href="/references/${incollection.label}">${incollection.label}</td>
                            <td>Incollection Reference</td>

                            <td>${incollection.author}</td>
                            <td>${incollection.title}</td>
                            <td>${incollection.year}</td>

                        </tr>
                    </c:forEach>
       
                            <c:forEach var="booklet" items="${booklets}">
                        <tr>
                            <td><a href="/references/${booklet.label}">${booklet.label}</td>
                            <td>Booklet Reference</td>

                            <td>${booklet.author}</td>
                            <td>${booklet.title}</td>
                            <td>${booklet.year}</td>

                        </tr>
                    </c:forEach>           
                            
                </c:when>
                <c:otherwise>
                    <tr>
                        <td>No references yet!</a</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                </c:otherwise>
            </c:choose>
            </tbody>
        </table>
        <a class="btn btn-default" href="/references/download">Download all references in BibTex format</a>                
    </div>
</div>