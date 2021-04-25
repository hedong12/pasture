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
    <title>视频饲料管理</title>

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

        .addlabel{
            width: 106px;
            float: left;
            clear: left;
            height: 36px;
            line-height: 36px;
            margin-top: 10px;
        }
        .addinput{
            width: 300px;
            height: 36px;
            line-height: 36px;
            margin-top: 10px;
            text-indent: 8px;
            font-size: 16px;
            font-family: "微软雅黑";
            border: 1px solid #ccc;
            float: left;
        }

        .addinputtypefile{
            width: 300px;
            height: 36px;
            line-height: 36px;
            margin-top: 10px;
            font-size: 16px;
            font-family: "微软雅黑";
            float: left;
        }

        .sub{
            width: 150px;
            height: 40px;
            border: 1px solid #ccc;
            float: left;
            margin-top: 60px;
            color: #fff;
            font-size: 18px;
            text-indent: 0;
        }
        .spa{
            height: 36px;
            line-height: 36px;
            width: 134px;
            display: inline-block;
            float: left;
            font-size: 12px;
            color: #BD362F;
            text-indent: 10px;
            margin-top: 10px;
        }

        .pic{
            cursor: pointer;
        }

        .onLoadImage img{
            width: 130px;
            float: right;
        }


        .table td{
            text-align: center;
            vertical-align: middle !important;
        }
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
                    <div class="col-sm-12" style="margin: 0;padding: 0">
                        <div class="box">
                            <div class="box-head">
                                <h2>视频饲料列表</h2>
                            </div><!--/.box-head-->
                            <input type="button"  class="modalLink btn btn-success" value="添加视频饲料">


                        <%--                            弹窗遮罩--%>
                            <div class="overlay"></div>
<%--                             添加表单 --%>
                            <div id="modal1" class="modal">
                                <div>
                                    <h2 style="margin: 15px;text-align: center;color: black">添加视频饲料</h2>
                                </div>
                                <form id="form0" enctype="multipart/form-data">
                                    <label class="addlabel">牧场id：</label><input class="addinput" type="text" id="showId" placeholder="请输入牧场ID" /><span class="spa spa1"></span><br />
                                    <label class="addlabel">视频饲料名称：</label><input class="addinput" type="text"  id="videoFodderName" placeholder="请输入视频饲料名称" /><span class="spa spa2"></span><br />
                                    <label class="addlabel">视频饲料数量：</label><input class="addinput" type="text"  id="num" placeholder="请输入视频饲料数量" /><span class="spa spa3"></span><br />
                                    <label class="addlabel">选择饲料：</label>
                                    <select class="addinput" id="fodderId">
                                        <option value="">
                                            请选择饲料
                                        </option>
                                        <c:forEach items="${fodderList}" var="fodder">
                                            <option value="${fodder.fodderId}">${fodder.fodderName}</option>
                                        </c:forEach>
                                    </select>
                                    <span class="spa spa4"></span><br />
                                    <label class="addlabel">选择宠物：</label>
                                        <select class="addinput" id="petsId">
                                            <option value="">
                                                请选择宠物
                                            </option>
                                            <c:forEach items="${petsList}" var="pets">
                                                <option value="${pets.petsId}">${pets.petsName}</option>
                                            </c:forEach>
                                        </select>
                                    <span class="spa spa5"></span><br />
                                    <div >
                                    <input type="button" class="closeBtn sub btn btn-info" value="取消" />
                                    <input type="button" class="btn sub btn-success" onclick="subForm()" value="提交" />
                                    </div>
                                </form>

                            </div>

                            <!-- 模糊搜索 -->
                            <div style="width: 75%;float: right;text-align: center;">
                                <form method="post" action="${pageContext.request.contextPath}/videoFodder/videoFodderList">
                                    <input name="videoFodderName" value="${videoFodderName}" placeholder="请输入视频饲料名">
                                    <input name="fodderName" value="${fodderName}" placeholder="请输入饲料名">
                                    <input name="petsName" value="${petsName}" placeholder="请输入宠物名">
                                    <input type="submit" class="btn bg-primary" value="搜索">
                                </form>
                            </div>
                            <div class="item">
                                <div class="item-responsive ">
                                    <table class="table">
                                        <thead>
                                        <tr>
                                            <th>视频饲料名称</th>
                                            <th>视频饲料数量</th>
                                            <th>饲料名称</th>
                                            <th>饲料图片</th>
                                            <th>宠物名称</th>
                                            <th>宠物等级</th>
                                            <th>操作</th>
                                        </tr>
                                        </thead><!--/thead-->
                                        <tbody>
                                        <c:forEach items="${pageInfo.list}" var="videoFodder">
                                            <tr>
                                                <td>${videoFodder.videoFodderName}</td>
                                                <td>${videoFodder.num}</td>
                                                <td>${videoFodder.fodderName}</td>
                                                <td>
                                                    <img class="pic" height="40" width="60"  title="${pageContext.request.contextPath}/uploaded/${videoFodder.fodderName}" src="${pageContext.request.contextPath}/uploaded/${videoFodder.fodderImg}">
                                                </td>
                                                <td>${videoFodder.petsName}</td>
                                                <td>${videoFodder.petsLevel}</td>
                                                <td>
                                                     <a onclick="delVideoFodderById('${videoFodder.vfId}')" href="javascript:;">
                                                         <span class="item-status delivered">删除</span>
                                                     </a>
                                                     <a id="updatePetsById" href="${pageContext.request.contextPath}/videoFodder/toUpdateVideoFodderById?id=${videoFodder.vfId}"><span class="item-status delivered">修改</span></a>

                                                </td>
                                            </tr>
                                        </c:forEach>
                                        </tbody><!--/tbody-->
                                    </table><!--/.table-->
                                    <div id="outerdiv" style="position:fixed;top:0;left:0;background:rgba(0,0,0,0.7);z-index:999999;width:100%;height:100%;display:none;">
                                        <div id="innerdiv" style="position:absolute;">
                                            <img id="bigimg" style="border:5px solid #fff;" src="" />
                                        </div>
                                    </div>
                                </div><!--/.table-responsive-->
                            </div><!--/.item-->

                            <!--显示分页信息-->
                            <div class="row">
                                <!--文字信息-->
                                <div class="col-md-6">
                                    当前第 ${pageInfo.pageNum} 页.总共 ${pageInfo.pages} 页.一共 ${pageInfo.total} 条记录
                                </div>
                                <!--点击分页-->
                                <div class="col-md-6">
                                    <nav aria-label="Page navigation">
                                        <ul class="pagination">
                                            <li><a href="${pageContext.request.contextPath}/videoFodder/videoFodderList?pn=1">首页</a></li>
                                            <!--上一页-->
                                            <li>
                                                <c:if test="${pageInfo.hasPreviousPage}">
                                                    <a href="${pageContext.request.contextPath}/videoFodder/videoFodderList?pn=${pageInfo.pageNum-1}" aria-label="Previous">
                                                        <span aria-hidden="true">«</span>
                                                    </a>
                                                </c:if>
                                            </li>
                                            <!--循环遍历连续显示的页面，若是当前页就高亮显示，并且没有链接-->
                                            <c:forEach items="${pageInfo.navigatepageNums}" var="page_num">
                                                <c:if test="${page_num == pageInfo.pageNum}">
                                                    <li class="active"><a href="#">${page_num}</a></li>
                                                </c:if>
                                                <c:if test="${page_num != pageInfo.pageNum}">
                                                    <li><a href="${pageContext.request.contextPath}/videoFodder/videoFodderList?pn=${page_num}">${page_num}</a></li>
                                                </c:if>
                                            </c:forEach>
                                            <!--下一页-->
                                            <li>
                                                <c:if test="${pageInfo.hasNextPage}">
                                                    <a href="${pageContext.request.contextPath}/videoFodder/videoFodderList?pn=${pageInfo.pageNum+1}"
                                                       aria-label="Next">
                                                        <span aria-hidden="true">»</span>
                                                    </a>
                                                </c:if>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/videoFodder/videoFodderList?pn=${pageInfo.pages}">尾页</a></li>
                                        </ul>
                                    </nav>
                                </div>
                            </div>
                            <!-- /显示分页信息-->
                        </div><!--/.box-->
                    </div><!--/.col-->


                </div><!--/.row-->



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

<!--Custom JS-->

<script src="${pageContext.request.contextPath}/assets/js/message.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jquery-1.10.2.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery-1.12.4.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jquery.modal.js"></script>

</body>
<script>
        // 新增弹窗 必须存在的执行
        $(function(){
            $("#showId").focus();
            $('.modalLink').modal({

            });

            $(".pic").click(function () {
                var _this = $(this);//将当前的pimg元素作为_this传入函数
                imgShow("#outerdiv", "#innerdiv", "#bigimg", _this);
            });

            function imgShow(outerdiv, innerdiv, bigimg, _this) {
                var src = _this.attr("src");//获取当前点击的pimg元素中的src属性
                $(bigimg).attr("src", src);//设置#bigimg元素的src属性
                /*获取当前点击图片的真实大小，并显示弹出层及大图*/
                $("<img/>").attr("src", src).load(function () {
                    var windowW = $(window).width();//获取当前窗口宽度
                    var windowH = $(window).height();//获取当前窗口高度
                    var realWidth = this.width;//获取图片真实宽度
                    var realHeight = this.height;//获取图片真实高度
                    var imgWidth, imgHeight;
                    var scale = 0.5;//缩放尺寸，当图片真实宽度和高度大于窗口宽度和高度时进行缩放
                    if (realHeight > windowH * scale) {//判断图片高度
                        imgHeight = windowH * scale;//如大于窗口高度，图片高度进行缩放
                        imgWidth = imgHeight / realHeight * realWidth;//等比例缩放宽度
                        if (imgWidth > windowW * scale) {//如宽度扔大于窗口宽度
                            imgWidth = windowW * scale;//再对宽度进行缩放
                        }
                    } else if (realWidth > windowW * scale) {//如图片高度合适，判断图片宽度
                        imgWidth = windowW * scale;//如大于窗口宽度，图片宽度进行缩放
                        imgHeight = imgWidth / realWidth * realHeight;//等比例缩放高度
                    } else {//如果图片真实高度和宽度都符合要求，高宽不变
                        imgWidth = realWidth;
                        imgHeight = realHeight;
                    }
                    $(bigimg).css("width", imgWidth);//以最终的宽度对图片缩放
                    var w = (windowW - imgWidth) / 2;//计算图片与窗口左边距
                    var h = (windowH - imgHeight) / 4;//计算图片与窗口上边距
                    $(innerdiv).css({"top": h, "left": w});//设置#innerdiv的top和left属性
                    $(outerdiv).fadeIn("fast");//淡入显示#outerdiv及.pimg
                });
                $(outerdiv).click(function () {//再次点击淡出消失弹出层
                    $(this).fadeOut("fast");
                });

            }

        });


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


        //删除
        function delVideoFodderById(e) {
            var $this = $(this);
            $.ajax({
                type: "POST",
                url: "${pageContext.request.contextPath}/videoFodder/delVideoFodderById",
                data: {"id" : e},
                dataType: "json",
                success: function(data){
                    if (data.result == "true"){
                        // $this.parent().parent().remove();
                        window.location.reload();
                        $.message('删除成功!');
                    }else if (data.result == "false"){
                        $.message({
                            message:'删除失败!',
                            type:'error'
                        });
                    }else if (data.result == "notexist"){
                        $.message({
                            message:'对不起，该饲料不存在!',
                            type:'error'
                        });
                    }

                },
                error: function() {
                    $.message({
                        message:'不起，删除失败!',
                        type:'error'
                    });
                }

            });

        }



    /************************  失焦判断  **********************************/
    $(".addinput").blur(function(){
        $(".spa").css("color","#BD362F")
        if($(this).is("#showId")){            // 牧场ID判断
            var ph = /^\d{1,10}$/;
            if($("#showId").val()!=""){
                if(!(ph.test($("#showId").val()))){
                    $(".spa1").text("请输入1-10位的整数");
                    $(this).css("border","1px solid #BD362F")
                    return false;
                }else if(ph){
                    $(".spa1").text("");
                    return true;
                }
            }else{
                $(".spa1").text("");
            }
        }

        if($(this).is("#num")){            // 宠物等级判断
            var ps = /^\d{1,10}$/;
            if($("#num").val()!=""){
                if(!(ps.test($("#num").val()))){
                    $(".spa3").text("请输入1-10位的整数");
                    $(this).css("border","1px solid #BD362F")
                    return false;
                }else if(ps){
                    $(".spa3").text("");
                    return true;
                }
            }else{
                $(".spa3").text("");
            }
        }

        if($(this).is("#videoFodderName")){
            if($("#videoFodderName").val()!=""){
                $(".spa2").text("");
                return true;
            }
        }

        if($(this).is("#fodderId")){
            if($("#fodderId").val()!=""){
                $(".spa4").text("");
                return true;
            }
        }

        if($(this).is("#petsId")){
            if($("#petsId").val()!=""){
                $(".spa5").text("");
                return true;
            }
        }


    })
    /********************** 聚焦提示 ************************/
    $("input").focus(function(){
        if($(this).is("#showId")){
            $(".spa1").text("只允许输入数字").css("color","#aaa")
            $(this).css("border","1px solid #aaa")
        }
        if($(this).is("#num")){
            $(".spa3").text("只允许输入数字").css("color","#aaa")
            $(this).css("border","1px solid #aaa")
        }
    })
    /*********************** 提交验证 ***************************/

    function subForm() {
        var ph = /^\d{1,10}$/;
        if (ph.test($("#showId").val()) && ph.test($("#num").val()) && $("#videoFodderName").val() != "" && $("#fodderId").val() != "" && $("#petsId").val() != "") {
            var formData=new FormData($("#form0")[0]);
            formData.append('showId',$("#showId").val());
            formData.append('num',$("#num").val());
            formData.append('videoFodderName',$("#videoFodderName").val());
            formData.append('fodderId',$("#fodderId").val());
            formData.append('petsId',$("#petsId").val());
            $.ajax({
                url:"${pageContext.request.contextPath}/videoFodder/addVideoFodder", //要处理的页面
                data: formData,  //要传过去的数据
                contentType:false,//ajax上传图片需要添加
                processData:false,//ajax上传图片需要添加
                type:"POST",  //提交方式
                dataType:"json",
                success: function(data){
                    if (data.result == "true"){
                        location.reload();
                        //执行表单关闭
                        $('.modalLink').modal({
                            close:'.closeBtn'
                        });
                        $.message('添加成功!');
                    }else {
                        $.message({
                            message:'添加失败!',
                            type:'error'
                        });
                    }

                },
                error: function () {
                    $.message({
                        message:'添加错误!',
                        type:'error'
                    });
                }

            });

            return true;
        }else {
            if($("#showId").val() == ""){
                $(".spa1").text('请你填写牧场ID')
            }
            if($("#videoFodderName").val() == ""){
                $(".spa2").text('请你填写视频饲料名称')
            }
            if($("#num").val() == ""){
                $(".spa3").text('请你填写视频饲料数量')
            }
            if($("#fodderId").val() == ""){
                $(".spa4").text('请选择饲料')
            }
            if($("#petsId").val() == ""){
                $(".spa5").text('请选择宠物')
            }
            return false;
        }

    }

</script>
</html>
