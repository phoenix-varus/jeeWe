<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!-- JQuery -->
<script src="<%=basePath%>static/js/jquery.min.js"></script>

<%--Popper--%>
<script src="<%=basePath%>static/plugin/popper/js/popper.min.js"></script>

<!-- Bootstrap -->
<script src="<%=basePath%>static/plugin/bootstrap/js/bootstrap.min.js"></script>

<!--FileUpload-->
<script src="<%=basePath%>static/js/fileinput.js"></script>

<!-- Bootstrap -->
<link rel="stylesheet" href="<%=basePath%>static/plugin/bootstrap/css/bootstrap-theme.min.css"/>
<link rel="stylesheet" href="<%=basePath%>static/plugin/bootstrap/css/bootstrap.min.css"/>

<!--FileUpload-->
<link rel="stylesheet" href="<%=basePath%>static/css/fileinput.min.css"/>

<!-- Icon -->
<link rel="shortcut icon" href=""/>

<!-- Font Awesome -->
<link rel="stylesheet" href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.css"/>

<!-- Font -->
<style>
    @font-face {
        font-family: 'dnmbxsxd';
        src: url('<%=basePath%>static/fonts/duanningmaobixingshuxiuding.ttf');
    }
</style>