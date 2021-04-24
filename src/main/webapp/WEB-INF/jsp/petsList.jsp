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
    <title>宠物列表</title>

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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/xuanzhong.css">
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


        .addimgctr{
            width: 300px;
            margin-top: 10px;
            float: left;
        }


        .sub{
            width: 150px;
            height: 40px;
            border: 1px solid #ccc;
            float: right;
            margin-top: 30px;
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

        .table td{
            text-align: center;
            vertical-align: middle !important;
        }


        .petsImgCache{
            list-style: none;
            width: 26%;
            float: left;
            margin: 10px;
        }

        .petsImgCache img{
            width: 80px;

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
                                <h2>宠物列表</h2>
                            </div><!--/.box-head-->

                            <input type="button" id="alertForm"  class="modalLink btn btn-success" value="添加宠物">

                        <%--                            弹窗遮罩--%>
                            <div class="overlay"></div>
<%--                             添加表单 --%>
                            <div id="modal1" class="modal">
                                <div>
                                    <h2 style="margin: 15px;text-align: center;color: black">添 加 宠 物</h2>
                                </div>
                                <label class="addlabel">牧场id：</label><input class="addinput" type="text" id="showId" placeholder="请输入牧场ID" /><span class="spa spa1"></span><br />
                                <label class="addlabel">宠物名称：</label><input class="addinput" type="text"  id="petsNametxt" placeholder="请输入宠物名称" /><span class="spa spa2"></span><br />
                                <label class="addlabel">宠物等级：</label><input class="addinput" type="text"  id="petsLevel" placeholder="请输入宠物等级" /><span class="spa spa3"></span><br />
                                <label class="addlabel">经验值：</label><input class="addinput" type="text" id="petsExp" placeholder="请输入经验值" /><span class="spa spa4"></span><br />
                                <label class="addlabel">经验奖品：</label>
                                <select class="addinput" id="hotelNo">
                                    <option value="0">请选择经验奖品</option>
                                </select><span class="spa spa5"></span><br />
                                <label class="addlabel">状态：</label>
                                    <select class="addinput" id="petsStatus">
                                        <option value="0">
                                            正常
                                        </option>
                                        <option value="1">
                                            禁用
                                        </option>
                                    </select>
                                 <br />
                                <label class="addlabel">宠物图片：</label>
                                <div class="addimgctr">
                                    <div class="grid">
                                        <c:forEach items="${imgCacheList}" varStatus="xh" var="imgCache">
                                            <label class="card">
                                                <c:if test="${xh.index == 0}">
                                                    <input name="plan" value="${imgCache.imgCacheId}" class="radio" type="radio" checked>
                                                </c:if>
                                                <c:if test="${xh.index != 0}">
                                                    <input name="plan" value="${imgCache.imgCacheId}" class="radio" type="radio">
                                                </c:if>
                                                <span class="plan-details">
                                                  <span class="plan-cost">
                                                     <img src="${pageContext.request.contextPath}/uploaded/${imgCache.imgCacheUrl}">
                                                  </span>
                                                </span>
                                            </label>
                                        </c:forEach>
                                    </div>
                                </div><br />
                                <div style="width: 400px;">
                                    <input type="button" class="btn sub btn-success" onclick="subForm()" value="提交" />
                                    <input type="button" class="closeBtn sub btn btn-info" value="取消" />
                                </div>
                            </div>

                            <!-- 模糊搜索 -->
                            <div style="width: 50%;float: right;text-align: center;">
                                <form method="post" action="${pageContext.request.contextPath}/pets/petsList">
                                    <input id="petsName" name="petsName" value="${petsName}" placeholder="请输入宠物名...">
                                    <input type="submit" class="btn bg-primary" value="搜索">
                                </form>
                            </div>
                            <div class="item">
                                <div class="item-responsive ">
                                    <table class="table">
                                        <thead>
                                        <tr>
                                            <th>宠物名称</th>
                                            <th>宠物图片</th>
                                            <th>宠物等级</th>
                                            <th>状态</th>
                                            <th>经验奖品名称</th>
                                            <th>操作</th>
                                        </tr>
                                        </thead><!--/thead-->
                                        <tbody>
                                        <c:forEach items="${pageInfo.list}" var="pets">
                                            <tr>
                                                <td>${pets.petsName}</td>
                                                <td>
                                                    <img class="pic" height="40" width="60"  title="${pets.petsName}" src="${pageContext.request.contextPath}/uploaded/${pets.petsImgUrl}">
                                                </td>
                                                <td>${pets.petsLevel}</td>
                                                <td>
                                                    <c:if test="${pets.petsStatus == 0}">
                                                        正常
                                                    </c:if>
                                                    <c:if test="${pets.petsStatus == 1}">
                                                        禁用
                                                    </c:if>

                                                </td>
                                                <td>${pets.petsExpPrizeName}</td>
                                                <td>
                                                     <a  onclick="delPetsById('${pets.petsId}')" href="javascript:;">
                                                         <span class="item-status delivered">删除</span>
                                                     </a>
                                                     <a id="updatePetsById" href="${pageContext.request.contextPath}/pets/queryPetsById?id=${pets.petsId}"><span class="item-status delivered">修改</span></a>
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

                                            <li><a href="${pageContext.request.contextPath}/pets/petsList?pn=1">首页</a></li>

                                            <!--上一页-->
                                            <li>
                                                <c:if test="${pageInfo.hasPreviousPage}">
                                                    <a href="${pageContext.request.contextPath}/pets/petsList?pn=${pageInfo.pageNum-1}" aria-label="Previous">
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
                                                    <li><a href="${pageContext.request.contextPath}/pets/petsList?pn=${page_num}">${page_num}</a></li>
                                                </c:if>
                                            </c:forEach>

                                            <!--下一页-->
                                            <li>
                                                <c:if test="${pageInfo.hasNextPage}">
                                                    <a href="${pageContext.request.contextPath}/pets/petsList?pn=${pageInfo.pageNum+1}"
                                                       aria-label="Next">
                                                        <span aria-hidden="true">»</span>
                                                    </a>
                                                </c:if>
                                            </li>

                                            <li><a href="${pageContext.request.contextPath}/pets/petsList?pn=${pageInfo.pages}">尾页</a></li>
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

        $("#alertForm").click(function(){
            // 查询饲料列表
            $.ajax({
                type: "POST",
                data: {},
                url: "${pageContext.request.contextPath}/pets/getPetsExpPrizeList",
                dataType: "json",
                success: function(data){
                    loadData(data.expPrizeList);
                }

            });
            var loadData=function(list){
                for (var i = 0; i < list.length; i++) {
                    $("#hotelNo").append("<option value="+list[i].eId+">"+list[i].expPrizeName+"</option>")
                }
            }
            
        });

        //删除
        function delPetsById(e) {
            var $this = $(this);
            $.ajax({
                type: "POST",
                url: "${pageContext.request.contextPath}/pets/delPetsBypetsId",
                data: {"petsIdval" : e},
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
                            message:'对不起，该宠物不存在!',
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
                    $(".spa1").text("请输入0-10位的整数");
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


        if($(this).is("#petsLevel")){            // 宠物等级判断
            var ps = /^\d{1,10}$/;
            if($("#petsLevel").val()!=""){
                if(!(ps.test($("#petsLevel").val()))){
                    $(".spa3").text("请输入0-10位的整数");
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


        if($(this).is("#hotelNo")){            // 宠物经验奖品判断
            if($("#hotelNo").val()!="0"){
                    $(".spa5").text("");
                    return true;
            }
        }

        if($(this).is("#petsExp")){            // 宠物经验值判断
            var pe = /^\d{1,10}$/;
            if($("#petsExp").val()!=""){
                if(!(pe.test($("#petsExp").val()))){
                    $(".spa4").text("请输入0-10位的整数");
                    $(this).css("border","1px solid #BD362F")
                    return false;
                }else if(pe){
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

        if($(this).is("#petsLevel")){
            $(".spa3").text("只允许输入数字").css("color","#aaa")
            $(this).css("border","1px solid #aaa")
        }
        if($(this).is("#petsExp")){
            $(".spa4").text("只允许输入数字").css("color","#aaa")
            $(this).css("border","1px solid #aaa")
        }
    })
    /*********************** 提交验证 ***************************/

    function subForm() {
        var ph = /^\d{1,10}$/;
        if (ph.test($("#showId").val()) && ph.test($("#petsLevel").val()) && ph.test($("#petsExp").val()) && $("#petsNametxt").val() != "" && $("#hotelNo").val() != "0") {
            var showId = document.getElementById('showId').value;
            var petsNametxt = document.getElementById('petsNametxt').value;
            var petsLevel = document.getElementById('petsLevel').value;
            var petsExp = document.getElementById('petsExp').value;
            var petsStatus = document.getElementById('petsStatus').value;
            var expPrizeEId = $("#hotelNo").val();
            var imgCacheId = $("input[name='plan']:checked").val();
            $.ajax({
                url:"${pageContext.request.contextPath}/pets/addPets", //要处理的页面
                data:{"showId":showId,"petsNametxt":petsNametxt,"petsLevel":petsLevel,"petsExp":petsExp,"petsStatus":petsStatus,"expPrizeEId":expPrizeEId,"imgCacheId":imgCacheId},  //要传过去的数据
                type:"POST",  //提交方式
                dataType:"json", //返回的数据类型，TEXT字符串 JSON返回JSON XML返回XML；dataType中T要大写！！
                success: function(data){ //回调函数，data为形参，是从login-cl.php页面返回的值
                    if (data.result == "true"){
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
            if($("#petsNametxt").val() == ""){
                $(".spa2").text('请你填写宠物名称')
            }
            if($("#petsLevel").val() == ""){
                $(".spa3").text('请你填写宠物等级')
            }
            if($("#petsExp").val() == ""){
                $(".spa4").text('请你填写经验值')

            }
            if($("#hotelNo").val() == "0"){
                $(".spa5").text('请选择奖品')

            }
            return false;
        }

    }

</script>
</html>
