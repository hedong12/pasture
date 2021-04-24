<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <!-- META DATA -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>牧场总后台</title>


    <link rel="shortcat icon" href="${pageContext.request.contextPath}/images/cow.png" type="image/x-icon">

    <!--font-awesome.min.css-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/font-awesome.min.css">

    <!--linear icon css-->
    <link rel="stylesheet" href="https://cdn.linearicons.com/free/1.0.0/icon-font.min.css">

    <!--chartist.min.css-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/chartist/css/chartist.min.css">

    <!--bootstrap.min.css-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css">

    <!--style.css-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/style.css">

    <!--responsive.css-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/responsive.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

<!-- wrapper -->
<div id="wrapper">

    <!-- navbar -->
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="brand">
            <a href="#  ">
                牧场<span>总后台</span>
            </a>
        </div><!--/.brand -->
        <div class="container-fluid">
            <div class="navbar-btn">
                <button type="button" class="btn-toggle-fullwidth">
                    <i class="lnr lnr-arrow-left-circle"></i>
                </button>
            </div>
            <div class="navbar-menu">
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img src="${pageContext.request.contextPath}/images/cow.png" class="img-circle" alt="parson-img">
                            <i class="icon-submenu fa fa-angle-down"></i>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="${pageContext.request.contextPath}/admin/toMyInfo?adminId=${adminUser.adminId}"><i class="lnr lnr-user"></i> <span>我的资料</span></a></li>
                            <li><a href="#"><i class="lnr lnr-envelope"></i> <span>消息</span></a></li>
                            <li><a href="#"><i class="lnr lnr-cog"></i> <span>设置</span></a></li>
                            <li><a href="${pageContext.request.contextPath}/admin/loginout"><i class="lnr lnr-exit"></i> <span>退出</span></a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div><!--/.container-fluid -->

    </nav><!--/nav -->
    <!-- END NAVBAR -->

    <!-- LEFT SIDEBAR -->
    <div id="sidebar-nav" class="sidebar">
        <div class="sidebar-scroll">
            <nav>
                <ul id="ulnav" class="nav">

                    <li onclick="getIframeList('/admin/toHome')" class="active">
                        <a href="#" >
                            <i data-feather="home"></i> <span>用户管理</span>
                        </a>
                    </li>

                    <li onclick="getIframeList('/pets/petsList')">
                        <a href="#">
                            <i data-feather="package"></i> <span>宠物管理</span>
                        </a>
                    </li>

                    <li onclick="getIframeList('/fodder/fodderList')">
                        <a href="#">
                            <i data-feather="file-text"></i> <span>饲料管理</span>
                        </a>
                    </li>

                    <li onclick="getIframeList('/expprize/expPrizeList')">
                        <a href="#">
                            <i data-feather="grid"></i> <span>经验奖励管理</span>
                        </a>
                    </li>

                    <li onclick="getIframeList('/imgcache/imgCacheList')">
                        <a href="#">
                            <i data-feather="map"></i> <span>宠物图片管理</span>
                        </a>
                    </li>

                    <li onclick="getIframeList('/prize/prizeList')">
                        <a href="#">
                            <i data-feather="bar-chart"></i> <span>奖品管理</span>
                        </a>
                    </li>

                    <li onclick="getIframeList('/userFodder/userFodderList')">
                        <a href="#">
                            <i data-feather="calendar"></i> <span>用户饲料管理</span>
                        </a>
                    </li>

                    <li onclick="getIframeList('/userFodderRecord/userFodderRecordList')">
                        <a href="#">
                            <i data-feather="layout"></i> <span>用户饲料记录</span>
                        </a>
                    </li>

                    <li onclick="getIframeList('/videoFodder/videoFodderList')">
                        <a href="#">
                            <i data-feather="layout"></i> <span>视频饲料管理</span>
                        </a>
                    </li>

                    <li onclick="getIframeList('/videoRecord/videoRecordList')">
                        <a href="#">
                            <i data-feather="bar-chart"></i> <span>视频记录</span>
                        </a>
                    </li>

                    <li onclick="getIframeList('/sign/signList')">
                        <a href="#">
                            <i data-feather="bell"></i> <span>签到管理</span>
                        </a>
                    </li>

<%--                    新--%>
                    <li onclick="getIframeList('/signRecord/signRecordList')">
                        <a href="#">
                            <i data-feather="file-text"></i> <span>签到记录</span>
                        </a>
                    </li>

                    <li onclick="getIframeList('/getRecord/getRecordList')">
                        <a href="#">
                            <i data-feather="grid"></i> <span>领取记录</span>
                        </a>
                    </li>

                    <li onclick="getIframeList('/upgradeRecord/upgradeRecordList')">
                        <a href="#">
                            <i data-feather="map"></i> <span>升级记录</span>
                        </a>
                    </li>

                    <li onclick="getIframeList('/scene/sceneList')">
                        <a href="#">
                            <i data-feather="map"></i> <span>场景管理</span>
                        </a>
                    </li>

                    <li onclick="getIframeList('/notice/noticeList')">
                        <a href="#">
                            <i data-feather="map"></i> <span>公告管理</span>
                        </a>
                    </li>

                    <li onclick="getIframeList('/revenueType/revenueTypeList')">
                        <a href="#">
                            <i data-feather="package"></i> <span>收益种类管理</span>
                        </a>
                    </li>

                    <li onclick="getIframeList('/revenueLiushui/revenueLiushuiList')">
                        <a href="#">
                            <i data-feather="grid"></i> <span>收益流水</span>
                        </a>
                    </li>


                    <li onclick="getIframeList('/address/addressList')">
                        <a href="#">
                            <i data-feather="grid"></i> <span>用户地址管理</span>
                        </a>
                    </li>


                    <li onclick="getIframeList('/adminSceneRecord/adminSceneRecordList')">
                        <a href="#">
                            <i data-feather="grid"></i> <span>管理场景记录</span>
                        </a>
                    </li>

                    <li onclick="getIframeList('/cashRule/cashRuleList')">
                        <a href="#">
                            <i data-feather="grid"></i> <span>兑换规则管理</span>
                        </a>
                    </li>

                    <li onclick="getIframeList('/cashRecord/cashRecordList')">
                        <a href="#">
                            <i data-feather="grid"></i> <span>兑换记录</span>
                        </a>
                    </li>


                    <li onclick="getIframeList('/task/taskList')">
                        <a href="#">
                            <i data-feather="grid"></i> <span>任务管理</span>
                        </a>
                    </li>


                    <li onclick="getIframeList('/taskRecord/taskRecordList')">
                        <a href="#">
                            <i data-feather="grid"></i> <span>任务记录</span>
                        </a>
                    </li>

                    <li onclick="getIframeList('/shouyiRule/shouyiRuleList')">
                        <a href="#">
                            <i data-feather="grid"></i> <span>任务记录</span>
                        </a>
                    </li>
<<<<<<< HEAD


<%--                    <li onclick="getIframeList('/shouyiLedger/shouyiLedgerList')">--%>
<%--                        <a href="#">--%>
<%--                            <i data-feather="grid"></i> <span>收益总账</span>--%>
<%--                        </a>--%>
<%--                    </li>--%>
=======
>>>>>>> 22668223364caae28f5c9fc0cd08bcf25ed1f183
            </nav>
        </div>

    </div>
    <!-- END LEFT SIDEBAR -->




    <!-- MAIN -->
    <div style="height: 100%" class="main">
        <iframe id="iframeContent"  src="${pageContext.request.contextPath}/admin/toHome" width="100%" height="100%" scrolling="yes"></iframe>
    </div>
    <!-- END MAIN -->




    <div class="clearfix"></div>

    <footer>
        <div class="container-fluid">
            <%--            <p>Copyright &copy; 2019.Company name All rights reserved.</p>--%>
        </div>

    </footer>

</div>
<!-- END WRAPPER -->


<!--jquery-1.12.4.min.js-->
<script  src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>

<!--chartist.min.js-->
<script src="${pageContext.request.contextPath}/assets/chartist/js/chartist.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/chartist/js/chartist-tooltip-plugin.js"></script>
<script src="${pageContext.request.contextPath}/assets/chartist/js/chartist-custom.js"></script>

<!--bootstrap.min.js-->
<script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>

<!--jquery.slimscroll.min.js-->
<script src="${pageContext.request.contextPath}/assets/js/jquery.slimscroll.min.js"></script>

<!--feather.min.js-->
<script src="${pageContext.request.contextPath}/assets/js/feather.min.js"></script>

<!-- DataMaps Plugin Js -->
<script src="${pageContext.request.contextPath}/assets/js/d3.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/topojson.js"></script>

<!--fontawesome-all.min.js-->
<script src="${pageContext.request.contextPath}/assets/js/fontawesome-all.min.js"></script>

<!--Custom JS -->
<script src="${pageContext.request.contextPath}/assets/js/custom.js"></script>

</body>
<script>
    function getIframeList(e) {
        var iframeContent = document.getElementById('iframeContent');
        iframeContent.src = "${pageContext.request.contextPath}"+e;
    }

    $('body').on('click','#ulnav li',function(){
        $(this).addClass("active").siblings().removeClass("active");
    });

</script>
</html>
