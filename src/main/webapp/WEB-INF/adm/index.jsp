<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>管理</title>
<%--Taglib--%>
<%@include file="../sys/taglib.jsp"%>

<style type="text/css">
html, body, .page {
    margin: 0px;
    height: 100%;
}

html, body, .page {
    margin: 0px;
    height: 100%;
}

.navbar {
    margin: 0px;
}

.i-menu-div, .i-content-div {
    margin: 0px;
    padding: 0px;
}

.i-panel-group .panel+.panel {
    margin: 0px;
}
</style>
</head>
<body>
    <div class="page">
        <div class="i-navbar-div">
            <nav class="navbar navbar-default" role="navigation">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="#">JeeSky</a>
                    </div>
                    <div>
                        <ul class="nav navbar-nav">
                            <li class="active">
                                <a href="#">系统管理</a>
                            </li>
                            <li>
                                <a href="#">内容管理</a>
                            </li>
                            <li>
                                <a href="#">论坛管理</a>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                    布袋戏 <b class="caret"></b>
                                </a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <a href="#">金光布袋戏</a>
                                    </li>
                                    <li>
                                        <a href="#">霹雳布袋戏</a>
                                    </li>
                                    <li>
                                        <a href="#">神魔布袋戏</a>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <a href="#">东离剑游记</a>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <a href="#">江湖救援团</a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                    <div class="navbar-right">
                        <span class="fa fa-user-circle-o" style="font-size: 30px; margin: 10px;"></span>
                    </div>
                </div>
            </nav>
        </div>
        <div class="col-lg-2 text-center i-menu-div">
            <div class="panel-group i-panel-group" id="accordion">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne"> 个人管理 </a>
                        </h4>
                    </div>
                    <div id="collapseOne" class="panel-collapse collapse in">
                        <div class="panel-body">
                            <button class="btn btn-link btn-group-justified">个人信息</button>
                            <button class="btn btn-link btn-group-justified">头像设置</button>
                        </div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo"> 用户管理 </a>
                        </h4>
                    </div>
                    <div id="collapseTwo" class="panel-collapse collapse in">
                        <div class="panel-body">
                            <button class="btn btn-link btn-group-justified">用户信息</button>
                            <button class="btn btn-link btn-group-justified">角色信息</button>
                        </div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseThree"> 系统管理 </a>
                        </h4>
                    </div>
                    <div id="collapseThree" class="panel-collapse collapse in">
                        <div class="panel-body">
                            <button class="btn btn-link btn-group-justified">菜单信息</button>
                            <button class="btn btn-link btn-group-justified">权限信息</button>
                            <button class="btn btn-link btn-group-justified">文件信息</button>
                        </div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseFour"> 机构管理 </a>
                        </h4>
                    </div>
                    <div id="collapseFour" class="panel-collapse collapse in">
                        <div class="panel-body">
                            <button class="btn btn-link btn-group-justified">个人信息</button>
                            <button class="btn btn-link btn-group-justified">头像设置</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-lg-10 i-content-div">
            <div class="panel panel-default">
                <div class="panel-heading text-center">
                    <h3 class="panel-title">个人信息</h3>
                </div>
                <div class="panel-body">
                    <input id="fileupload" type="file" multiple class="">
                </div>
                <div class="panel-footer">这里是个脚注的说</div>
            </div>
        </div>
    </div>
    <script>
					$("#fileupload").fileinput({
						language : 'zh',
						msgZoomModalHeading : "文件预览"
					});
				</script>
</body>
</html>