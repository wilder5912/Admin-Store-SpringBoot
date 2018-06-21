$(document).ready(function () {


    console.log("holaaaaaaaaaaaaa wilder ");

    $("#search-form").submit(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();

        fire_ajax_submit();

    });

});


function fire_ajax_submit() {

    var user = {}
    user["emailUser"] = $("#emailU").val();
    user["passwordUser"] = $("#passwordU").val();


    $("#btn-search").prop("disabled", true);

    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/searchUser",
        data: JSON.stringify(user),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {
console.log(data,"okkkk");
           /* var json = "<h4>Ajax Response</h4><pre>"
                + JSON.stringify(data, null, 4) + "</pre>";
            $('#feedback').html(json);

            console.log("SUCCESS : ", data);
            $("#btn-search").prop("disabled", false);*/

        },
        error: function (e) {
            console.log(e,"error");

/*
            var json = "<h4>Ajax Response</h4><pre>"
                + e.responseText + "</pre>";
            $('#feedback').html(json);

            console.log("ERROR : ", e);
            $("#btn-search").prop("disabled", false);*/

        }
    });

}
