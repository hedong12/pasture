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
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- TITLE OF SITE -->
    <title>视频饲料修改</title>

    <!-- favicon -->
    <!--<link rel="shortcat icon" href="/favicon.ico" type="image/x-icon">-->

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

    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/message.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/diaform.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <style>
        .fanhui:hover{text-decoration:none;}
    </style>
</head>

<body>

<!-- wrapper -->
<div>



    <!-- MAIN -->
    <div class="main" style="background-color: white">

        <!-- MAIN CONTENT -->
        <div id="userList" class="main-content">
            <div >
                <div class="row">
                    <div class="col-sm-3" >
                    </div>
                    <div class="col-sm-6" style="margin: 0;padding: 0">
                        <div class="box">
                            <div class="box-head" style="margin-bottom: 20px;">
                                <h2>视频饲料修改</h2>
                            </div><!--/.box-head-->
                            <div class="item">
                                <div class="item-responsive ">
                                    <form action="${pageContext.request.contextPath}/videoFodder/doUpdateVideoFodderById" method="post">
                                        <input type="hidden" name="vfId" value="${videoFodder.vfId}">
                                        <div class="form-group">
                                            <label for="exampleInputEmail1">牧场ID</label>
                                            <input type="text" name="showId" id="exampleInputEmail1" class="form-control" value="${videoFodder.showId}" placeholder="请输入牧场ID"/>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputEmail12">视频饲料名称</label>
                                            <input type="text" name="videoFodderName" id="exampleInputEmail12" class="form-control" value="${videoFodder.videoFodderName}" placeholder="请输入视频饲料名称"/>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputEmail13">视频饲料数量</label>
                                            <input type="text" name="num" id="exampleInputEmail13" class="form-control" value="${videoFodder.num}" placeholder="请输入视频饲料数量"/>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword2">饲料</label>
                                            <select name="fodderId" class="form-control" id="exampleInputPassword2">
                                                <c:forEach items="${fodderList}" var="fodder">
                                                    <option value="${fodder.fodderId}" <c:if test="${fodder.fodderId == videoFodder.fodderId}">selected</c:if>>${fodder.fodderName}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword4">饲料图片</label>
                                            <img style="width: 100px;" id="exampleInputPassword4" src="${pageContext.request.contextPath}/uploaded/${videoFodder.fodderImg}">
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword23">宠物</label>
                                            <select name="petsId" class="form-control" id="exampleInputPassword23">
                                                <c:forEach items="${petsList}" var="pets">
                                                    <option value="${pets.petsId}" <c:if test="${pets.petsId == videoFodder.petsId}">selected</c:if>>${pets.petsName}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                        <div class="form-group" style="text-align: center;">
                                            <a class="btn btn-link fanhui"  href="javascript:history.go(-1)">
                                                返回
                                            </a>
                                            <input type="submit" class="btn btn-primary" value="修改" />
                                        </div>

                                    </form>
                                </div><!--/.table-responsive-->
                            </div><!--/.item-->
                        </div><!--/.box-->
                    </div><!--/.col-->


                </div><!--/.row-->
                <div class="col-sm-3" >
                </div>


            </div><!--/.container-fluid-->;

        </div><!--/.main-content-->

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

<!--Custom JS-->

<script src="${pageContext.request.contextPath}/assets/js/message.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jquery-1.10.2.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jquery.modal.js"></script>

</body>
<script>


</script>
</html>
