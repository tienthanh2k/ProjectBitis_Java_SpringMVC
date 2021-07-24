$(document).ready(function() {
    $('#divsign').hide();
    $("#btn_signin").click(function() {
        $('#divlogin').hide();
        $('#divsign').show();
    });

    $("#btn_login").click(function() {
        $('#divsign').hide();
        $('#divlogin').show();
    });

    function showSignInForm() {
        $("#divlogin").removeClass("hide");
    }
});
