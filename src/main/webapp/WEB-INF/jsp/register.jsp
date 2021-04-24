<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html  lang="en">

<head>
    <!-- meta data -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!--font-family-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,200,300,400,500,600,700,800,900&amp;subset=devanagari,latin-ext" rel="stylesheet">

    <!-- title of site -->
    <title>注 册</title>

    <!-- For favicon png -->
    <link rel="shortcut icon" type="image/icon" href="assets/logo/favicon.png"/>

    <!--font-awesome.min.css-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/register/css/font-awesome.min.css">

    <!--animate.css-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/register/css/animate.css">

    <!--bootstrap.min.css-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/register/css/bootstrap.min.css">

    <!-- bootsnav -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/register/css/bootsnav.css" >

    <!--style.css-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/register/css/style.css">

    <!--responsive.css-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/register/css/responsive.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->

    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
<!--[if lte IE 9]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
<![endif]-->

<!-- signin end -->
<section class="signin signup">
    <div class="container">

        <div class="sign-content">
            <h2>注 册 账 号</h2>

            <div class="row">
                <div class="col-sm-12">
                    <div class="signin-form">
                        <form id="registerForm" action="${pageContext.request.contextPath}/admin/doregister" method="post" onsubmit="return register()">
<%--                           禁止input输入空格 添加代码：oninput="this.value=this.value.replace(/\s+/g,'')" --%>
                            <div class="form-group">
                                <div class="form-group">
                                    <label for="adminUser">用 户 名</label>
                                    <input type="text" class="form-control" name="adminUser" oninput="this.value=this.value.replace(/\s+/g,'')" id="adminUser" placeholder="用 户 名">
                                </div><!--/.form-group -->
                            </div><!--/.form-col -->
                            <div class="form-group">
                                <div class="form-group">
                                    <label for="password">密 码</label>
                                    <input type="text" class="form-control" name="password" id="password" placeholder="密码(不少于6位)" oninput="this.value=this.value.replace(/\s+/g,'')">
                                    <span id="passwordscuess" style="display: none">
                                        <img style="width: 20px;height: 20px;float: right;margin-right: -35px;margin-top: -32px;" src="${pageContext.request.contextPath}/images/scuess.png">
                                    </span>
                                    <span id="passworderror" style="display: none;color: #ff0000;float: right;margin-right: -135px;margin-top: -32px;">
                                        <img style="width: 20px;height: 20px" src="${pageContext.request.contextPath}/images/error.png">
                                        密码需要6-16位
                                    </span>
                                </div><!--/.form-group -->
                            </div><!--/.form-col1 -->
                            <div class="form-group">
                                <div class="form-group">
                                    <label for="confirmPassword">确认密码</label>
                                    <input type="text" class="form-control" id="confirmPassword" oninput="this.value=this.value.replace(/\s+/g,'')" placeholder="确认密码">
                                    <span id="confirmPasswordscuess" style="display: none">
                                        <img style="width: 20px;height: 20px;float: right;margin-right: -35px;margin-top: -32px;" src="${pageContext.request.contextPath}/images/scuess.png">
                                    </span>
                                    <span id="confirmPasswordmsg"></span>
                                    <span id="confirmPassworderror" style="display: none;color: #ff0000;float: right;margin-right: -170px;margin-top: -32px;">
                                        <img style="width: 20px;height: 20px" src="${pageContext.request.contextPath}/images/error.png">
                                        两次输入密码不一致!
                                    </span>
                                </div><!--/.form-group -->
                            </div><!--/.form-col1 -->

                            <div class="form-group">
                                <label for="phone">手机号</label>
                                <input type="text" class="form-control" name="phone" id="phone" oninput="this.value=this.value.replace(/\s+/g,'')" placeholder="手机号">
                                <span id="phonemsg"></span>
                            </div><!--/.form-group -->

                            <div class="form-group">
                                <label for="authcode">验证码</label>
                                <input style="width: 60%;" type="text" class="form-control" id="authcode" oninput="this.value=this.value.replace(/\s+/g,'')" placeholder="请输入验证码">
                                <input type="button" onclick="settime(this)" id="authcodebtn" class="btn btn-success authcodebtn" value="获取验证码">

                                <span id="authcodemsg"></span>
                            </div><!--/.form-group -->


                            <div class="form-group">
                                <label for="pasture_name">牧场名称</label>
                                <input type="text" class="form-control" name="pasture_name" id="pasture_name" oninput="this.value=this.value.replace(/\s+/g,'')" placeholder="牧场名称">
                            </div><!--/.form-group -->
                            <input type="submit" class="btn signin_btn" value="注 册" data-toggle="modal" data-target=".signin_modal"/>

                        </form><!--/form -->
                    </div><!--/.signin-form -->
                </div><!--/.col -->
            </div><!--/.row -->

            <div class="row">
                <div class="col-sm-12">
                    <div class="signin-password">
                        <div class="awesome-checkbox-list">
<%--                            <ul class="unstyled centered">--%>
<%--                                <li>--%>
<%--                                    <input class="styled-checkbox" id="styled-checkbox-2" type="checkbox" value="value2">--%>
<%--                                    <label for="styled-checkbox-2">accept our terms & condition</label>--%>
<%--                                </li>--%>

<%--                                <li></li>--%>

<%--                            </ul>--%>
                        </div><!--/.awesome-checkbox-list -->
                    </div><!--/.signin-password -->
                </div><!--/.col -->
            </div><!--/.row -->


            <div class="row">
                <div class="col-sm-12">
                    <div class="signin-footer">

                        <p>
                            已有账号 ?
                            <a href="${pageContext.request.contextPath}/toadmin">登 陆</a>
                        </p>
                    </div><!--/.signin-footer -->
                </div><!--/.col-->
            </div><!--/.row -->

        </div><!--/.sign-content -->

        <!-- modal part end -->
    </div><!--/.container -->

</section><!--/.signin -->

<!-- signin end -->

<!--footer copyright start -->
<footer class="footer-copyright">
    <div id="scroll-Top">
        <i class="fa fa-angle-double-up return-to-top" id="scroll-top" data-toggle="tooltip" data-placement="top" title="" data-original-title="Back to Top" aria-hidden="true"></i>
    </div><!--/.scroll-Top-->

</footer><!--/.hm-footer-copyright-->
<!--footer copyright  end -->


<!-- Include all js compiled plugins (below), or include individual files as needed -->

<script src="${pageContext.request.contextPath}/register/js/jquery.js"></script>

<!--modernizr.min.js-->
<script src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js"></script>

<!--bootstrap.min.js-->
<script src="${pageContext.request.contextPath}/register/js/bootstrap.min.js"></script>

<!-- bootsnav js -->
<script src="${pageContext.request.contextPath}/register/js/bootsnav.js"></script>

<!-- jquery.sticky.js -->
<script src="${pageContext.request.contextPath}/register/js/jquery.sticky.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>


<!--Custom JS-->
<script src="${pageContext.request.contextPath}/register/js/custom.js"></script>

</body>

<script>
    //验证码时间
    var counts = 60;
    var code;
    var isPhone = false;

    function settime(val) {
        if (isPhone){
            if(counts == 0) {
                val.removeAttribute("disabled");
                val.value = "获取验证码";
                counts = 60;
                return false;
            } else {
                val.setAttribute("disabled", true);
                val.value = "重新发送（" + counts + "）";
                counts--;
            }
            setTimeout(function() {
                settime(val);
            }, 1000);

        }
        return false;
    }


    $(function(){
        //获取验证码
            $("#authcodebtn").click(function() {
                if (isPhone){
                    code = "";
                    var codeLength = 4;//验证码的长度
                    var authcode = document.getElementById("authcode");
                    var random = new Array(0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R',
                        'S','T','U','V','W','X','Y','Z');//随机数
                    for(var i = 0; i < codeLength; i++) {//循环操作
                        var index = Math.floor(Math.random()*36);//取得随机数的索引（0~35）
                        code += random[index];//根据索引取得随机数加到code上
                    }
                    authcode.value = code;//把code值赋给验证码
                    console.log(code);
                    return true;
                }
                return false;

            });

    })



    $(document).ready(function () {
        // 密码 失去焦点
        $("#password").blur(function () {
            var password = $("#password").val();
            if (password.length > 5 && password.length < 17){
                document.getElementById("passwordscuess").style.display="block";
                document.getElementById("passworderror").style.display="none";
                return true;
            }else {
                document.getElementById("passwordscuess").style.display="none";
                document.getElementById("passworderror").style.display="block";
                return false;
            }
        })

        // 确认密码 失去焦点
        $("#confirmPassword").blur(function () {
            var password = $("#password").val();
            var confirmPassword = $("#confirmPassword").val();
            if (confirmPassword.length > 5 && confirmPassword.length < 17){
                if(password == confirmPassword){
                    document.getElementById('confirmPasswordmsg').style = 'display: none;';
                    document.getElementById("confirmPasswordscuess").style.display="block";
                    document.getElementById("confirmPassworderror").style.display="none";
                    return true;
                }else {
                    document.getElementById('confirmPasswordmsg').style = 'display: none;';
                    document.getElementById("confirmPasswordscuess").style.display="none";
                    document.getElementById("confirmPassworderror").style.display="block";
                    return false;
                }
            }else {
                document.getElementById('confirmPasswordmsg').style = 'float: right;color: red;margin-right: -170px;margin-top: -32px';
                document.getElementById('confirmPasswordmsg').innerHTML = '<img style="width: 20px;height: 20px;" src="${pageContext.request.contextPath}/images/error.png"> 确认密码需要6-16位!';
                return false;
            }

        })

        // 手机号 失去焦点
        $("#phone").blur(function () {
            var phone  = document.getElementById("phone").value;
            if (phone.length == 11){
                var myreg = /^[1][3,4,5,7,8,9][0-9]{9}$/;
                if(myreg.test(phone)){ //正确的手机号
                    isPhone = true;
                    //ajax查询
                    $.ajax({
                        type: "POST",
                        url: "${pageContext.request.contextPath}/admin/getAdminByPhone",
                        data: {phone : $("#phone").val()},
                        dataType : "json",
                        success: function(data){
                            if (data.res == "scuess"){ // 新手机号不存在
                                document.getElementById('phonemsg').style = 'float: right;color: red;margin-right: -35px;margin-top: -32px';
                                document.getElementById('phonemsg').innerHTML = '<img style="width: 20px;height: 20px" src="${pageContext.request.contextPath}/images/scuess.png">';
                                return true;
                            }else { //手机号已存在
                                document.getElementById('phonemsg').style = 'float: right;color: red;margin-right: -125px;margin-top: -32px';
                                document.getElementById('phonemsg').innerHTML = '<img style="width: 20px;height: 20px;" src="${pageContext.request.contextPath}/images/error.png"> 手机号已存在!';
                                return false;
                            }
                        },
                        error: function () {
                            document.getElementById('phonemsg').style = 'float: right;color: red;margin-right: -100px;margin-top: -32px';
                            document.getElementById('phonemsg').innerHTML = '<img style="width: 20px;height: 20px;" src="${pageContext.request.contextPath}/images/error.png"> 异常错误!';
                            return false;
                        }
                    });
                }else {
                    document.getElementById('phonemsg').style = 'float: right;color: red;margin-right: -150px;margin-top: -32px';
                    document.getElementById('phonemsg').innerHTML = '<img style="width: 20px;height: 20px;" src="${pageContext.request.contextPath}/images/error.png"> 手机号格式不正确!';
                    return false;
                }
            }else {
                document.getElementById('phonemsg').style = 'float: right;color: red;margin-right: -190px;margin-top: -32px';
                document.getElementById('phonemsg').innerHTML = '<img style="width: 20px;height: 20px;" src="${pageContext.request.contextPath}/images/error.png"> 手机号必须为11位的数字!';
                return false;
            }

        })



    })



    function register() {
        var adminUser  = document.getElementById("adminUser").value;
        var password  = document.getElementById("password").value;
        var confirmPassword  = document.getElementById("confirmPassword").value;
        var phone  = document.getElementById("phone").value;
        var pasture_name = document.getElementById("pasture_name").value;
        var authcode = document.getElementById("authcode").value;
        // 表单非空
        if (adminUser == null || adminUser == ""){
            alert("请输入用户名");
            return false;
        }
        if (password == null || password == ""){
            alert("请输入密码");
            return false;
        }
        if (password.length > 5 && password.length < 17){
            document.getElementById("passwordscuess").style.display="block";
            document.getElementById("passworderror").style.display="none";
        }else {
            document.getElementById("passwordscuess").style.display="none";
            document.getElementById("passworderror").style.display="block";
            return false;
        }
        if (confirmPassword == null || confirmPassword == ""){
            alert("请输入确认密码");
            return false;
        }

        if (confirmPassword.length > 5 && confirmPassword.length < 17){
            if(password != confirmPassword){
                document.getElementById('confirmPasswordmsg').style = 'display: none;';
                document.getElementById("confirmPasswordscuess").style.display="none";
                document.getElementById("confirmPassworderror").style.display="block";
                return false;
            }
        }else {
            document.getElementById('confirmPasswordmsg').style = 'float: right;color: red;margin-right: -170px;margin-top: -32px';
            document.getElementById('confirmPasswordmsg').innerHTML = '<img style="width: 20px;height: 20px;" src="${pageContext.request.contextPath}/images/error.png"> 确认密码需要6-16位!';
            return false;
        }

        if (phone == null || phone == ""){
            alert("请输入手机号");
            return false;
        }
        if (phone.length == 11){
            var myreg = /^[1][3,4,5,7,8,9][0-9]{9}$/;
            if(myreg.test(phone)){ //正确的手机号
                isPhone = true;
                //ajax查询
                $.ajax({
                    type: "POST",
                    url: "${pageContext.request.contextPath}/admin/getAdminByPhone",
                    data: {phone : $("#phone").val()},
                    dataType : "json",
                    success: function(data){
                        if (data.res == "error"){ // 新手机号不存在
                            document.getElementById('phonemsg').style = 'float: right;color: red;margin-right: -125px;margin-top: -32px';
                            document.getElementById('phonemsg').innerHTML = '<img style="width: 20px;height: 20px;" src="${pageContext.request.contextPath}/images/error.png"> 手机号已存在!';
                            return false;
                        }
                    },
                    error: function () {
                        document.getElementById('phonemsg').style = 'float: right;color: red;margin-right: -100px;margin-top: -32px';
                        document.getElementById('phonemsg').innerHTML = '<img style="width: 20px;height: 20px;" src="${pageContext.request.contextPath}/images/error.png"> 异常错误!';
                        return false;
                    }
                });
            }else {
                document.getElementById('phonemsg').style = 'float: right;color: red;margin-right: -150px;margin-top: -32px';
                document.getElementById('phonemsg').innerHTML = '<img style="width: 20px;height: 20px;" src="${pageContext.request.contextPath}/images/error.png"> 手机号格式不正确!';
                return false;
            }
        }else {
            document.getElementById('phonemsg').style = 'float: right;color: red;margin-right: -190px;margin-top: -32px';
            document.getElementById('phonemsg').innerHTML = '<img style="width: 20px;height: 20px;" src="${pageContext.request.contextPath}/images/error.png"> 手机号必须为11位的数字!';
            return false;
        }

        if (authcode == null || authcode == ""){
            alert("请先获取验证码");
            return false;
        }

        if (authcode.length != 4){
            alert("验证码必须是4位数");
            return false;
        }

        // if (authcode != code){ 输入的验证密码和获取到的验证码
        //     return false;
        // }

        if (pasture_name == null || pasture_name == ""){
            alert("请输入牧场名称");
            return false;
        }
        var registerForm = document.getElementById('registerForm');
        return true;

    }
</script>

</html>
