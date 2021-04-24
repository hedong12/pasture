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
    <title>用户地址修改</title>

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
                                <h2>用户地址修改</h2>
                            </div><!--/.box-head-->

                            <div class="item">
                                <div class="item-responsive ">
                                    <form action="${pageContext.request.contextPath}/address/doUpdateAddressById" method="post" enctype="multipart/form-data">
                                        <input type="hidden" name="id" value="${address.addressId}">
                                        <div class="form-group">
                                            <label for="exampleInputPassword1">牧场Id</label>
                                            <input type="text" name="showId" class="form-control" id="exampleInputPassword1" value="${address.showId}" placeholder="请输入种类名称"/>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword5">用户名称</label>
                                            <input type="text" name="username" class="form-control" id="exampleInputPassword5" value="${address.username}" placeholder="请输入种类名称"/>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword2">地址信息</label>
                                            <input type="text" name="addressInfo" class="form-control" id="exampleInputPassword2" value="${address.addressInfo}" placeholder="请输入种类名称"/>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword3">手机号</label>
                                            <input type="text" name="phone" class="form-control" id="exampleInputPassword3" value="${address.addressPhone}" placeholder="请输入种类名称"/>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword4">状态</label>
                                            <select name="addressStatus" class="form-control" id="exampleInputPassword4">
                                                <c:if test="${address.addressStatus == 0}">
                                                    <option value="0" selected>正常</option>
                                                    <option value="1">禁用</option>
                                                </c:if>
                                                <c:if test="${address.addressStatus == 1}">
                                                    <option value="0">正常</option>
                                                    <option value="1" selected>禁用</option>
                                                </c:if>
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

    //检查图片
    function checkImage() {
        var fileName=$("#filename").val();
        fileName=fileName.replace("D:\\Code-idea-projects\\54\\springboot-project\\PASTURE\\src\\main\\resources\\static\\uploaded","");
        var flag=true;
        if(fileName==""){
            flag=false;
            $("#onLoadImage").html('');
            alert("请选择图片");
        }
        else{
            var size = $("#filename")[0].files[0].size;
            if(size/1000>10000){
                flag=false;
                alert("图片大小不能超过100MB");
            }
        }
        if(flag){
            onLoadImage();
        }
        else{//清除input type=file的显示内容
            $("#filename").val("");
        }
        return flag;
    }


    //预览图片
    function onLoadImage() {
        var file=$('#filename').get(0).files[0];
        var reader = new FileReader();
        //将文件以Data URL形式读入页面
        reader.readAsDataURL(file);
        reader.onload = function(){
            //显示文件
            $(".spa5").text("");
            $("#onLoadImage").html('<img src="' + this.result +'" alt="" />');
        }
    }

</script>
</html>
