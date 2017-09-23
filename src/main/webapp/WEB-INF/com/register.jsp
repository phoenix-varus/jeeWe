<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<title>注册</title>
<!-- TLDs -->
<%@ taglib prefix="jk" uri="../tlds/jeesky.tld"%>
<%--Taglib--%>
<jsp:include page="../sys/taglib.jsp"></jsp:include>
<script type="application/javascript" src="<%=basePath%>static/js/login/login.js"></script>
<script type="application/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.17.0/jquery.validate.min.js"></script>
<style type="text/css">
html, body, .page {
    margin: 0px;
    height: 100%;
}

.i-login-div {
    display: table;
    margin: auto;
    position: absolute;
    top: 0;
    left: 0;
    bottom: 200px;
    right: 0;
    width: 350px;
    padding: 20px;
    text-align: center;
}

.i-error-div {
    display: none;
}

h2 {
    font-family: dnmbxsxd;
}

.i-btn-group {
    width: 100%;
}

.i-login-copyright {
    position: absolute;
    bottom: 20px;
    width: 100%;
    text-align: center;
}
</style>
</head>
<body>
    <div class="page">
        <div class="i-login-div">
            <div class="alert alert-danger alert-dismissable i-error-div" id="i-error-div">
                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
            </div>
            <h2>注册一下，开始修仙</h2>
            <br />
            <form class="i-login-form" role="form">
                <div class="input-group">
                    <span class="input-group-addon">
                        <i class="glyphicon glyphicon-user" aria-hidden="true"></i>
                    </span>
                    <input class="form-control" id="username" name="username" type="text" placeholder="用户名" required="required" />
                </div>
                <br />
                <div class="input-group">
                    <span class="input-group-addon">
                        <i class="glyphicon glyphicon-lock"></i>
                    </span>
                    <input class="form-control" id="password" name="password" type="password" placeholder="密码" required="required" />
                </div>
                <br />
                <div class="input-group">
                    <span class="input-group-addon">
                        <i class="glyphicon glyphicon-ok-sign"></i>
                    </span>
                    <input class="form-control" id="cpassword" name="cpassword" type="password" placeholder="确认密码" required="required" />
                </div>
                <br />
                <div class="btn-group i-btn-group">
                    <button class="btn btn-default btn-block" onclick="register();">提交</button>
                </div>
            </form>
            <br>
        </div>
        <div class="i-login-copyright">
            <jk:copyright></jk:copyright>
        </div>
    </div>
</body>
</html>
