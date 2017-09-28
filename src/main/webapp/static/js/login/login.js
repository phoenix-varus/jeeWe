function login() {
    if ($.trim($("#username").val()) == "") {
        $("#i-error-div").show();
        return;
    }
    if ($.trim($("#password").val) == "") {
        $("#i-error-div").show();
        return;
    }

    $.ajax({
        type: 'post',
        data: {
            username: $("#username").val(),
            password: $("#password").val()
        },
        url: "../l/login",
        contenttype: "application/x-www-form-urlencoded;charset=utf-8",
        success: function (data) {
            data = JSON.parse(data);
            if (data.status == "success") {
                window.location.href = "../a/index";
            } else {
                $("#i-error-div").html(data.msg + $("#i-error-div").html());
                $("#i-error-div").show();
            }
        },
        error: function (e) {
            $("#i-error-div").html("登录失败！" + $("#i-error-div").html());
            $("#i-error-div").show();
        }
    });

}

function toregister() {
    window.location.href = "../l/register.action";
}

function register() {
    if ($.trim($("#username").val()) == "") {
        $("#i-error-div").show();
        return;
    }
    if ($.trim($("#password").val) == "") {
        $("#i-error-div").show();
        return;
    }
    if ($.trim($("#cpassword").val) == "") {
        $("#i-error-div").show();
        return;
    }

    $.ajax({
        data: {
            username: $("username").val(),
            password: $("password").val()
        },
        url: "../l/register.action",
        contenttype: "application/x-www-form-urlencoded;charset=utf-8",
        success: function (data) {
            if (data.status == "success") {
                location.href = "../s/index";
            }
        },
        error: function (e) {
            $("#i-error-div").html("注册失败！" + $("#i-error-div").html());
            $("#i-error-div").show();
        }
    });

}