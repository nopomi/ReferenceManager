<div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">Book Reference</h4>
                        </div>
                        <div class="panel-body">
                            <form class="form-horizontal" role="form" action=${param.bookpath} method="POST" >

                                <div class="form-group">
                                    <label class="col-xs-1 control-label" for="label">Label</label>
                                    <div class ="col-xs-11">
                                        <input class="form-control" type="text" id ="book-label" name="label">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="author" class="col-xs-1 control-label">Author</label>   
                                    <div class ="col-xs-11">
                                        <input class="form-control" type="text" name="author" id="book-author">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="title" class="col-xs-1 control-label">Title</label>    
                                    <div class ="col-xs-11">
                                        <input class="form-control" type="text" name="title" id="book-title">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="year" class="col-xs-1 control-label">Year</label>   
                                    <div class ="col-xs-11">
                                        <input class="form-control" type="text" name="year" id="book-year">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="publisher" class="col-xs-1 control-label">Publisher</label>        
                                    <div class ="col-xs-11">
                                        <input class="form-control" type="text" name="publisher" id="book-publisher">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="volume" class="col-xs-1 control-label">Volume</label>        
                                    <div class ="col-xs-11">
                                        <input class="form-control" type="text" name="volume" id="volume">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="series" class="col-xs-1 control-label">Series</label>        
                                    <div class ="col-xs-11">
                                        <input class="form-control" type="text" name="series" id="series">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="address" class="col-xs-1 control-label">Address</label>        
                                    <div class ="col-xs-11">
                                        <input class="form-control" type="text" name="address" id="address">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="edition" class="col-xs-1 control-label">Edition</label>        
                                    <div class ="col-xs-11">
                                        <input class="form-control" type="text" name="edition" id="edition">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="month" class="col-xs-1 control-label">Month</label>        
                                    <div class ="col-xs-11">
                                        <input class="form-control" type="text" name="month" id="month">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="note" class="col-xs-1 control-label">Note</label>        
                                    <div class ="col-xs-11">
                                        <input class="form-control" type="text" name="note" id="note">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="key" class="col-xs-1 control-label">Key</label>        
                                    <div class ="col-xs-11">
                                        <input class="form-control" type="text" name="key" id="key">
                                    </div>
                                </div>

                                <button type="submit" id="book-add" class="btn btn-default">Add reference</button>
                            </form>
                        </div>
                    </div>