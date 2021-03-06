<div class="panel panel-default">
    <div class="panel-heading">
        <h4 class="panel-title">Incollection Reference</h4>
    </div>
    <div class="panel-body">
        <form class="form-horizontal" role="form" id="referenceForm" action=${param.incollectionpath} method="POST" >

            <div class="form-group">
                <label for="label" class="col-xs-1 control-label">Label*</label>
                <div class ="col-xs-11">
                    <input class="form-control" type="text" id ="label" name="label" value="${reference.label}">
                </div>
            </div>

            <div class="form-group">
                <label for="author" class="col-xs-1 control-label">Author*</label>   
                <div class ="col-xs-11">
                    <input class="form-control" type="text" name="author" id="author" value="${reference.author}">
                </div>
            </div>

            <div class="form-group">
                <label for="title" class="col-xs-1 control-label">Title*</label>    
                <div class ="col-xs-11">
                    <input class="form-control" type="text" name="title" id="title" value="${reference.title}">
                </div>
            </div>

            <div class="form-group">
                <label for="booktitle" class="col-xs-1 control-label">Booktitle*</label>    
                <div class ="col-xs-11">
                    <input class="form-control" type="text" name="booktitle" id="booktitle" value="${reference.booktitle}">
                </div>
            </div>

            <div class="form-group">
                <label for="year" class="col-xs-1 control-label">Year*</label>   
                <div class ="col-xs-11">
                    <input class="form-control" type="text" name="year" id="year" value="${reference.year}">
                </div>
            </div>

            <div class="form-group">
                <label for="editor" class="col-xs-1 control-label">Editor</label>        
                <div class ="col-xs-11">
                    <input class="form-control" type="text" name="editor" id="editor" value="${reference.editor}">
                </div>
            </div>

            <div class="form-group">
                <label for="volume" class="col-xs-1 control-label">Volume</label>        
                <div class ="col-xs-11">
                    <input class="form-control" type="text" name="volume" id="volume" value="${reference.volume}">
                </div>
            </div>
            <div class="form-group">
                <label for="series" class="col-xs-1 control-label">Series</label>        
                <div class ="col-xs-11">
                    <input class="form-control" type="text" name="series" id="series" value="${reference.series}">
                </div>
            </div>

            <div class="form-group">
                <label for="pages" class="col-xs-1 control-label">Pages</label>
                <div class="col-xs-11">
                    <input class="form-control" type="text" name="pages" id="pages" value="${reference.pages}">
                </div>
            </div>

            <div class="form-group">
                <label for="address" class="col-xs-1 control-label">Address</label>        
                <div class ="col-xs-11">
                    <input class="form-control" type="text" name="address" id="address" value="${reference.address}">
                </div>
            </div>

            <div class="form-group">
                <label for="month" class="col-xs-1 control-label">Month</label>        
                <div class ="col-xs-11">
                    <input class="form-control" type="text" name="month" id="month" value="${reference.month}">
                </div>
            </div>

            <div class="form-group">
                <label for="publisher" class="col-xs-1 control-label">Publisher*</label>        
                <div class ="col-xs-11">
                    <input class="form-control" type="text" name="publisher" id="publisher" value="${reference.publisher}">
                </div>
            </div>

            <div class="form-group">
                <label for="note" class="col-xs-1 control-label">Note</label>        
                <div class ="col-xs-11">
                    <input class="form-control" type="text" name="note" id="note" value="${reference.note}">
                </div>
            </div>

            <div class="form-group">
                <label for="key" class="col-xs-1 control-label">Key</label>        
                <div class ="col-xs-11">
                    <input class="form-control" type="text" name="key" id="key" value="${reference.key}">
                </div>
            </div>

            <button type="submit" id ="add" class="btn btn-default">Add reference</button>
        </form>
    </div>
</div>