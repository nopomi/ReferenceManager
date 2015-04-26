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
                <c:when test="${not empty articles}">
                    <c:forEach var="article" items="${articles}">
                        <tr>
                            <td><a href="/references/${article.label}">${article.label}</td>
                            <td>Article</td>
                            <td>${article.author}</td>
                            <td>${article.title}</td>
                            <td>${article.year}</td>
                        </tr>
                    </c:forEach>
                </c:when>

                <c:when test="${not empty books}">
                    <c:forEach var="book" items="${books}">
                        <tr>
                            <td><a href="/references/${book.label}">${book.label}</td>
                            <td>Book</td>
                            <td>${book.author}</td>
                            <td>${book.title}</td>
                            <td>${book.year}</td>
                        </tr>
                    </c:forEach>
                </c:when>

                <c:when test="${not empty inps}">
                    <c:forEach var="inp" items="${inps}">
                        <tr>
                            <td><a href="/references/${inp.label}">${inp.label}</td>
                            <td>Inproceedings</td>
                            <td>${inp.author}</td>
                            <td>${inp.title}</td>
                            <td>${inp.year}</td>
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