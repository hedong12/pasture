<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>

    Hello Word!

</body>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script>
    function queryUser() {
        $.ajax({
            type: "GET",
            url: "user/getUserList",
            data: {},
            dataType: "json",
            success: function(data){
                alert("查询成功!");
            },
            error: function () {
                alert("查询错误!")
            }
        });
    }
</script>
</html>
