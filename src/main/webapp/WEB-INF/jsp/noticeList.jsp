<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html lang="en">

<head>
    <!-- META DATA -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- TITLE OF SITE -->
    <title>公告管理</title>

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
            width: 84px;
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

        .addtextarea{
            width: 300px;
            height: 110px;
            margin-top: 10px;
            text-indent: 8px;
            font-size: 16px;
            font-family: "微软雅黑";
            border: 1px solid #ccc;
            resize: none;
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

        .table{
            table-layout: fixed;
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
                                <h2>公告列表</h2>
                            </div><!--/.box-head-->

                            <input type="button"  class="modalLink btn btn-success" value="添加公告">

                        <%--                            弹窗遮罩--%>
                            <div class="overlay"></div>
<%--                             添加表单 --%>
                            <div id="modal1" class="modal">
                                <div>
                                    <h2 style="margin: 15px;text-align: center;color: black">添 加 公 告</h2>
                                </div>
                                <form id="form0" enctype="multipart/form-data">
                                    <label class="addlabel">牧场ID：</label><input class="addinput" type="text"  id="showId" placeholder="请输入牧场ID" /><span class="spa spa1"></span><br />
                                    <label class="addlabel">公告名称：</label><input class="addinput" type="text"  id="noticeName" placeholder="请输入公告名称" /><span class="spa spa2"></span><br />
                                    <label class="addlabel">公告内容：</label>
                                        <textarea class="addtextarea addinput" type="text"  id="noticeContent" placeholder="请输入公告内容"></textarea>
                                    <span class="spa spa3"></span><br />
                                    <label class="addlabel">状态：</label>
                                        <select class="addinput" id="status">
                                            <option value="0">
                                                未发布
                                            </option>
                                            <option value="1">
                                                已发布
                                            </option>
                                        </select>
                                     <br />
                                    <label class="addlabel">排序：</label>
                                    <input class="addinput" type="text"  id="sort" placeholder="请输入排序" />
                                    <span class="spa spa4"></span><br />
                                    <div style="width: 400px;">
                                    <input type="button" class="closeBtn sub btn btn-info" value="取消" />
                                    <input type="button" class="btn sub btn-success" onclick="subForm()" value="提交" />
                                    </div>
                                </form>

                            </div>

                            <!-- 模糊搜索 -->
                            <div style="width: 50%;float: right;text-align: center;">
                                <form method="post" action="${pageContext.request.contextPath}/notice/noticeList">
                                    <input name="noticeName" value="${noticeName}" placeholder="请输入公告名">
                                    <input type="submit" class="btn bg-primary" value="搜索">
                                </form>
                            </div>
                            <div class="item">
                                <div class="item-responsive ">
                                    <table class="table">
                                        <thead>
                                        <tr>
                                            <th>公告名称</th>
                                            <th width="25%">公告内容</th>
                                            <th>状态</th>
                                            <th>排序</th>
                                            <th>添加时间</th>
                                            <th>操作</th>
                                        </tr>
                                        </thead><!--/thead-->
                                        <tbody>
                                        <c:forEach items="${pageInfo.list}" var="notice">
                                            <tr>
                                                <td>${notice.noticeName}</td>
                                                <td title="${notice.noticeContent}" style="white-space:nowrap;text-overflow:ellipsis;overflow:hidden;">
                                                        ${notice.noticeContent}
                                                </td>
                                                <td>
                                                    <c:if test="${notice.status == 0}">
                                                        未发布
                                                    </c:if>
                                                    <c:if test="${notice.status == 1}">
                                                        已发布
                                                    </c:if>
                                                </td>
                                                <td>${notice.sort}</td>
                                                <td>
                                                    <fmt:formatDate value="${notice.addTime}" pattern="yyyy-MM-dd" />
                                                </td>
                                                <td>
                                                     <a onclick="delNoticeById('${notice.nId}')" href="javascript:;">
                                                         <span class="item-status delivered">删除</span>
                                                     </a>
                                                     <a id="updatePetsById" href="${pageContext.request.contextPath}/notice/toUpdateNoticeById/${notice.nId}"><span class="item-status delivered">修改</span></a>
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
                                            <li><a href="${pageContext.request.contextPath}/notice/noticeList?pn=1">首页</a></li>
                                            <!--上一页-->
                                            <li>
                                                <c:if test="${pageInfo.hasPreviousPage}">
                                                    <a href="${pageContext.request.contextPath}/notice/noticeList?pn=${pageInfo.pageNum-1}" aria-label="Previous">
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
                                                    <li><a href="${pageContext.request.contextPath}/notice/noticeList?pn=${page_num}">${page_num}</a></li>
                                                </c:if>
                                            </c:forEach>
                                            <!--下一页-->
                                            <li>
                                                <c:if test="${pageInfo.hasNextPage}">
                                                    <a href="${pageContext.request.contextPath}/notice/noticeList?pn=${pageInfo.pageNum+1}"
                                                       aria-label="Next">
                                                        <span aria-hidden="true">»</span>
                                                    </a>
                                                </c:if>
                                            </li>
                                            <li><a href="${pageContext.request.contextPath}/notice/noticeList?pn=${pageInfo.pages}">尾页</a></li>
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
        function delNoticeById(e) {
            var $this = $(this);
            $.ajax({
                type: "POST",
                url: "${pageContext.request.contextPath}/notice/delNoticeById",
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


        if($(this).is("#noticeName")){
            if($("#noticeName").val()!=""){
                $(".spa2").text("");
                return true;
            }
        }

        if($(this).is("#noticeContent")){
            if($("#noticeContent").val()!=""){
                $(".spa3").text("");
                return true;
            }
        }



        if($(this).is("#sort")){            // 排序判断
            var ph = /^\d{1,10}$/;
            if($("#sort").val()!=""){
                if(!(ph.test($("#sort").val()))){
                    $(".spa4").text("请输入1-10位的整数");
                    $(this).css("border","1px solid #BD362F")
                    return false;
                }else if(ph){
                    $(".spa4").text("");
                    return true;
                }
            }else{
                $(".spa4").text("");
            }
        }



    })


        /********************** 聚焦提示 ************************/
        $("input").focus(function(){
            if($(this).is("#showId")){
                $(".spa1").text("只允许输入数字").css("color","#aaa")
                $(this).css("border","1px solid #aaa")
            }
            if($(this).is("#sort")){
                $(".spa4").text("只允许输入数字").css("color","#aaa")
                $(this).css("border","1px solid #aaa")
            }
        })


    /*********************** 提交验证 ***************************/

    function subForm() {
        var ph = /^\d{1,10}$/;
        if (ph.test($("#showId").val()) && $("#noticeName").val() != "" && $("#noticeContent").val() != "" && ph.test($("#sort").val())) {
            var formData=new FormData($("#form0")[0]);
            formData.append('showId',$("#showId").val());
            formData.append('noticeName',$("#noticeName").val());
            formData.append('noticeContent',$("#noticeContent").val());
            formData.append('status',$("#status").val());
            formData.append('sort',$("#sort").val());
            $.ajax({
                url:"${pageContext.request.contextPath}/notice/addNotice", //要处理的页面
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
            if($("#noticeName").val() == ""){
                $(".spa2").text('请你填写公告名称')
            }
            if($("#noticeContent").val() == ""){
                $(".spa3").text('请你填写公告内容')
            }
            if($("#sort").val() == ""){
                $(".spa4").text('请填写排序')
            }
            return false;
        }

    }

</script>
</html>
