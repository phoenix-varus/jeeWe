<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>登录</title>
    <!-- TLDs -->
    <%@ taglib prefix="jk" uri="../tlds/jeewe.tld" %>
    <%--Taglib--%>
    <jsp:include page="../sys/taglib.jsp"></jsp:include>
    <script type="application/javascript" src="<%=basePath%>static/js/login/login.js"></script>
    <style>
        body {
            background-image: url("../../static/images/wms.jpg");
            background-size: cover;
        }

        .i-addon-span {
            background-color: white;
            font-size: 20px;
        }

        .i-login-card-div {
            margin-top: 150px;
            opacity: 0.8;
        }

        .i-login-title-h {
            font-family: dnmbxsxd;
            font-weight: 900;
        }

        .i-login-btn {
            width: 100%;
            color: white;
            background-color: darkcyan;
            letter-spacing: 23px;
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
<div class="py-5">
    <div class="container">
        <div class="row">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <div class="card p-5 i-login-card-div">
                    <div class="card-body">
                        <h1 class="mb-4 text-center i-login-title-h">道友今来，何不修仙</h1>
                        <form class="mt-5" role="form" action="">
                            <div class="form-group input-group">
                                <span class="input-group-addon i-addon-span"><i class="fa fa-user"></i></span>
                                <input type="text" class="form-control" id="username" name="username"
                                       placeholder="请输入用户名"></div>
                            <div class="form-group input-group">
                                <span class="input-group-addon i-addon-span"><i class="fa fa-lock"></i></span>
                                <input type="password" class="form-control" id="password" name="password"
                                       placeholder="请输入密码"></div>
                            <button type="submit" class="btn i-login-btn" onclick="login()">登录</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="i-login-copyright">
    <jk:copyright></jk:copyright>
</div>
</div>
</body>
</html>
