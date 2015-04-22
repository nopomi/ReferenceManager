<div class="panel panel-default">
    <div class="panel-heading">
        <h4 class="panel-title">
            Article Reference
        </h4>
    </div> 

    <div class="panel-body">      
        <form class="form-horizontal" id="referenceForm" role="form" action=${param.articlepath} method="POST" >                         
            <div class="form-group">
                <label class="col-xs-1 control-label" for="label">Label</label>
                <div class ="col-xs-11">
                    <input class="form-control" type="text" id ="label" name="label" value="${reference.label}">
                </div>
            </div>
            <div class="form-group">
                <label class="col-xs-1 control-label" for="author">Author</label>
                <div class="col-xs-11">
                    <input class="form-control" type="text" name="author" id="article-author" value="${reference.author}">
                </div>
            </div>
            <div class="form-group">
                <label class="col-xs-1 control-label" for="title">Title</label> 
                <div class="col-xs-11">
                    <input class="form-control" type="text" name="title" id="article-title" value="${reference.title}">
                </div>
            </div>
            <div class="form-group">
                <label class="col-xs-1 control-label" for="year">Year</label>     
                <div class="col-xs-11">  
                    <input class="form-control" type="text" name="year" id="article-year" value="${reference.year}">
                </div>
            </div>
            <div class="form-group">
                <label class="col-xs-1 control-label" for="journal">Journal</label> 
                <div class="col-xs-11">
                    <input class="form-control" type="text" name="journal" id="article-journal" value="${reference.journal}">
                </div>
            </div>
            <div class="form-group">
                <label class="col-xs-1 control-label" for="volume">Volume</label>  
                <div class="col-xs-11">
                    <input class="form-control" type="text" name="volume" id="volume" value="${reference.volume}">
                </div>
            </div>
            <div class="form-group">
                <label class="col-xs-1 control-label" for="number">Number</label>   
                <div class="col-xs-11">
                    <input class="form-control" type="text" name="number" id="number" value="${reference.number}">
                </div>
            </div>
            <div class="form-group">
                <label class="col-xs-1 control-label" for="pages">Pages</label>                    
                <div class="col-xs-11">                    
                    <input class="form-control" type="text" name="pages" id="pages" value="${reference.pages}">
                </div>
            </div>
            <div class="form-group">
                <label class="col-xs-1 control-label" for="month">Month</label>                    
                <div class="col-xs-11">                                       
                    <input class="form-control" type="text" name="month" id="month" value="${reference.month}">
                </div>
            </div>
            <div class="form-group">
                <label class="col-xs-1 control-label" for="note">Note</label> 
                <div class="col-xs-11">                                       
                    <input class="form-control" type="text" name="note" id="note" value="${reference.note}">
                </div>
            </div>
            <div class="form-group">
                <label class="col-xs-1 control-label" for="key">Key</label> 
                <div class="col-xs-11">                                       
                    <input class="form-control" type="text" name="key" id="key" value="${reference.key}">
                </div>
            </div>

            <button type="submit" id="add" class="btn btn-default">Add reference</button>

        </form>
    </div>
</div>