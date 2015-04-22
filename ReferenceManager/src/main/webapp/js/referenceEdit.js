
function disableEdit() {
    disableForm();
    disableAddButton();
}

function disableForm() {
    var form = document.getElementById("referenceForm");
    var elements = form.elements;
    for (var i = 0, len = elements.length; i < len; ++i) {
        elements[i].disabled = true;
    }
}

function disableAddButton() {
    var button = document.getElementById("add");
    button.style.visibility = "hidden";
}

function undisableEdit() {
    undisableForm();
    undisableAddButton();
}

function undisableForm() {
    var form = document.getElementById("referenceForm");
    var elements = form.elements;
    for (var i = 1, len = elements.length; i < len; ++i) {
        elements[i].disabled = false;
    }
}

function undisableAddButton() {
    var button = document.getElementById("add");
    button.style.visibility = "visible";
}
     