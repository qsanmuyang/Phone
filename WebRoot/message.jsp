<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>详细信息</title>
    <link rel="stylesheet" href="style/font-awesome.css">
    <link rel="stylesheet" href="css/message.css">
    <script src="script/jquery-3.1.1.js" type="text/javascript"></script>
    <script type="text/javascript" src="script/message.js"></script>
    <style>
        a{
            text-decoration: none;
            color: #000;
        }
        .clearfix{
            content:'';
            display: table;
            clear: both;
        }
        .container{
            background-color: #F1F2F3;
            height: 646px;
        }
         .detail{
            float: left;
            /*border:1px solid #eee;*/
            padding: 20px 20px;
            margin-left: 30px;
        }
        .content{
            background-color: #fff;
            margin: 50px auto;
            font-size: 14px;          
            padding: 20px;
        }
        .content img{
            border:1px solid #eee;
            float: left;
        }
        ul{
            list-style-type: none;
            content:'';
            display: table;
            clear: both;
        }
        dl{
            list-style-type: none;
            line-height: 30px;
            margin-bottom: 10px;
        }
        dd{
            float: left;
        }
        dt{
            float: left;
            width: 66px;
        }
        h3{
            font-size: 18px;
        }
        h4{
            font-size: 16px;
            font-weight: normal;
            color: #f00;
            margin-top: 10px;
        }
        p{
            color: #f00;
            font-size: 25px;
            padding: 10px 0px;
        }
        p span{
            color: #666;
            font-size: 14px;
        }
        .num{
            margin-bottom: 10px;
        }
        .num li{
            float: left;
            line-height: 20px;
            color: #666;
        }
        .num li span{
            color: #f00;
            padding: 0px 10px;
        }
        dd li{
            float: left;
            padding: 0 8px;
            border:1px solid #eee;
            margin-right: 10px;
        }
        .buy{
            display: inline-block;
            background-color: #e00;
            padding: 10px 20px;
            color: #fff;
            margin-top: 20px;
        }
        .tocar{
            display: inline-block;
            background-color: #e00;
            padding: 10px 20px;
            color: #fff;
            margin-top: 20px;
            margin-left: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
    <div class="nav">
        <div class="header">
                <a href="#" class="logo">logo</a>
                <div class="search">
                    <form action="#" class="search-form">
                        <input type="text" class="search-text" placeholder="搜索">
                        <a href="#" class="search-btn"></a>
                    </form>
                </div>
                <ul class="nav-list">
                    <li><a href="#" class="reg-btn"><i class="fa fa-registered"></i>注册</a></li>
                    <li><a href="#" class="login-btn"><i class="fa fa-user"></i>登录</a></li>
                    <li><a href="#"><i class="fa fa-shopping-cart"></i>购物车</a></li>
                    <li><a href="#"><i class="fa fa-star-o"></i>收藏</a></li>
                </ul>
            </div>
            </div>
            <div class="content clearfix">
                <img src="${pInfo.pimage }" alt="${pInfo.pintro }">
                <div class="detail">
                    <h3>${pInfo.pmodel }</h3>
                    <h4>${pInfo.pintro } </h4>
                    <p><span>价格</span>￥${pInfo.price }</p>
                    <ul class="num clearfix">
                        <li>月销量<span>4215</span></li>
                        <li>累计评价<span>2125</span></li>
                    </ul>
                    <dl class="clearfix">
                        <dt>版本</dt>
                        <dd>
                            <ul>
                                <li><a href="#">X9</a></li>
                                <li><a href="#">X9星空灰</a></li>
                                <li><a href="#">X9plus</a></li>
                            </ul>
                        </dd>
                    </dl>
                    <dl class="clearfix">
                        <dt>机身颜色</dt>
                        <dd>
                            <ul>
                                <li><a href="#">金色</a></li>
                                <li><a href="#">玫瑰金</a></li>
                            </ul>
                        </dd>
                    </dl>
                    <dl class="clearfix">
                        <dt>存储容量</dt>
                        <dd>
                            <ul>
                                <li><a href="#">64GB</a></li>
                            </ul>
                        </dd>
                    </dl>
                    <dl class="clearfix">
                        <dt>版本类型</dt>
                        <dd>
                            <ul>
                                <li><a href="#">中国大陆</a></li>
                            </ul>
                        </dd>
                    </dl>
                    <a href="servlet/phone.do?pid="+${pInfo.pid } class="buy">立即购买</a>
                    <a href="#" class="tocar">加入购物车</a>
                </div>
            </div>
    </div>
</body>
</html>