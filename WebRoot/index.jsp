<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>诚真手机馆</title>
    <link rel="stylesheet" href="style/font-awesome.css">
    <link rel="stylesheet" href="css/main.css">
    <script src="script/jquery-3.1.1.js" type="text/javascript"></script>
    <script type="text/javascript" src="script/index.js"></script>
</head>
<body>
    <div class="container">
    <c:choose>
    <c:when test="${!empty LOGIN }">
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
                    <li><a href="servlet/user.do?opr=back" ><i class="fa fa-registered"></i>注销</a></li>
                    <li><a href="javascript:void(0)"><i class="fa fa-user"></i>${LOGIN }</a></li>
                    <li><a href="#"><i class="fa fa-shopping-cart"></i>购物车</a></li>
                    <li><a href="#"><i class="fa fa-star-o"></i>收藏</a></li>
                </ul>
            </div>
        </div>
        </c:when>
        <c:otherwise>
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
                    <li><a href="javascript:;" class="reg-btn"><i class="fa fa-registered"></i>注册</a></li>
                    <li><a href="javascript:;" class="login-btn"><i class="fa fa-user"></i>登录</a></li>
                    <li><a href="javascript:;"><i class="fa fa-shopping-cart"></i>购物车</a></li>
                    <li><a href="javascript:;"><i class="fa fa-star-o"></i>收藏</a></li>
                </ul>
            </div>
        </div>
        </c:otherwise>
        </c:choose>
        <div class="content1">
            <div class="slide">
                <div class="slide-list">
                    <a href="#"><img src="images/1.jpg" alt="1" width="1190px" height="300px"></a>
                    <a href="#"><img src="images/2.jpg" alt="2" width="1190px" height="300px"></a>
                    <a href="#"><img src="images/3.jpg" alt="3" width="1190px" height="300px"></a>
                    <a href="#"><img src="images/4.jpg" alt="4" width="1190px" height="300px"></a>
                    <a href="#"><img src="images/5.jpg" alt="5" width="1190px" height="300px"></a>
                    <a href="#"><img src="images/6.jpg" alt="6" width="1190px" height="300px"></a>
                </div>  
                <a href="#" class="arrow prev">&lt;</a>
                <a href="#" class="arrow next">&gt;</a>
                <div class="circle">
                    <a href="javascript:;" index=1 class="selected"></a>
                    <a href="javascript:;" index=2></a>
                    <a href="javascript:;" index=3></a>
                    <a href="javascript:;" index=4></a>
                    <a href="javascript:;" index=5></a>
                    <a href="javascript:;" index=6></a>
                </div>
            </div>
        </div>
        <div class="content content2">
            <h2>FOCUS<span>热门机型</span></h2>
            <div class="good-list">
                <div class="over" id="rm">
                    
                </div>
            </div>
        </div>
        <div class="content content3">
            <h2>1F<span>小米直供</span></h2>
            <div class="image">
                <div class="image1">
                    <i class="cover">
                    <p>小米</p>
                    <a href="#"><i class="fa fa-heart"></i>关注</a>
                    </i>
                    <a href="#"><img src="images/s1.jpg" alt="" width="244px" height="330px"></a>
                </div>
                <div class="image2">
                    <a href="#"><img src="images/s2.jpg" alt=""></a>
                </div>
            </div>
            <div class="good-list">
                <div class="over" id="xm">
          
                </div>
            </div>
        </div>
        <div class="content content4">
            <h2>2F<span>荣耀直供</span></h2>
            <div class="image">
                <div class="image1">
                    <i class="cover">
                    <p>荣耀</p>
                    <a href="#"><i class="fa fa-heart"></i>关注</a>
                    </i>
                    <a href="#"><img src="images/s3.jpg" alt="" width="244px" height="330px"></a>
                </div>
                <div class="image2">
                    <a href="#"><img src="images/s4.jpg" alt=""></a>
                </div>
            </div>
            <div class="good-list">
                <div class="over" id="ry">
                    
                </div>
            </div>
        </div>
        <div class="content content5">
            <h2>3F<span>华为直供</span></h2>
            <div class="image">
                <div class="image1">
                    <i class="cover">
                    <p>华为</p>
                    <a href="#"><i class="fa fa-heart"></i>关注</a>
                    </i>
                    <a href="#"><img src="images/s5.jpg" alt="" width="244px" height="330px"></a>
                </div>
                <div class="image2">
                    <a href="#"><img src="images/s6.jpg" alt=""></a>
                </div>
            </div>
            <div class="good-list">
                <div class="over" id="hw">
                   
                </div>
            </div>
        </div>
        <div class="content content6">
            <h2>4F<span>魅族直供</span></h2>
            <div class="image">
                <div class="image1">
                    <i class="cover">
                    <p>魅族</p>
                    <a href="#"><i class="fa fa-heart"></i>关注</a>
                    </i>
                    <a href="#"><img src="images/s7.jpg" alt="" width="244px" height="330px"></a>
                </div>
                <div class="image2">
                    <a href="#"><img src="images/s8.jpg" alt=""></a>
                </div>
            </div>
            <div class="good-list">
                <div class="over" id="mz">
                   
                </div>
            </div>
        </div>
         <div class="content content7">
            <h2>5F<span>OPPO</span></h2>
            <div class="image">
                <div class="image1">
                    <i class="cover">
                    <p>OPPO</p>
                    <a href="#"><i class="fa fa-heart"></i>关注</a>
                    </i>
                    <a href="#"><img src="images/s9.jpg" alt="" width="244px" height="330px"></a>
                </div>
                <div class="image2">
                    <a href="#"><img src="images/s10.jpg" alt=""></a>
                </div>
            </div>
            <div class="good-list">
                <div class="over" id="oppo">
                    
                </div>
            </div>
        </div>
        <div class="content content8">
            <h2>6F<span>VIVO</span></h2>
            <div class="image">
                <div class="image1">
                    <i class="cover">
                    <p>vivo</p>
                    <a href="#"><i class="fa fa-heart"></i>关注</a>
                    </i>
                    <a href="#"><img src="images/s11.jpg" alt="" width="244px" height="330px"></a>
                </div>
                <div class="image2">
                    <a href="#"><img src="images/s12.jpg" alt=""></a>
                </div>
            </div>
            <div class="good-list">
                <div class="over" id="vivo">
                    
                </div>
            </div>
        </div>
        <div class="content content9">
            <h2>7F<span>Apple</span></h2>
            <div class="image">
                <div class="image1">
                    <i class="cover">
                    <p>Apple/苹果</p>
                    <a href="#"><i class="fa fa-heart"></i>关注</a>
                    </i>
                    <a href="#"><img src="images/s13.jpg" alt="" width="244px" height="330px"></a>
                </div>
                <div class="image2">
                    <a href="#"><img src="images/s14.jpg" alt="" width="946px" height="330px"></a>
                </div>
            </div>
            <div class="good-list">
                <div class="over" id="apple">
                    
                </div>
            </div>
        </div>
        <div class="content content10">
            <h2>8F<span>乐视直供</span></h2>
            <div class="image">
                <div class="image1">
                    <i class="cover">
                    <p>乐视</p>
                    <a href="#"><i class="fa fa-heart"></i>关注</a>
                    </i>
                    <a href="#"><img src="images/s15.jpg" alt="" width="244px" height="330px"></a>
                </div>
                <div class="image2">
                    <a href="#"><img src="images/s16.jpg" alt="" ></a>
                </div>
            </div>
            <div class="good-list">
                <div class="over" id="ls">
                    
                </div>
            </div>
        </div>
        <div class="content content11">
            <h2>9F<span>三星直供</span></h2>
            <div class="image">
                <div class="image1">
                    <i class="cover">
                    <p>Samsung/三星</p>
                    <a href="#"><i class="fa fa-heart"></i>关注</a>
                    </i>
                    <a href="#"><img src="images/s17.jpg" alt="" width="244px" height="330px"></a>
                </div>
                <div class="image2">
                    <a href="#"><img src="images/s18.jpg" alt="" ></a>
                </div>
            </div>
            <div class="good-list">
                <div class="over" id="sx">
                    
                </div>
            </div>
        </div>
        <div class="content content12">
            <h2>10F<span>360直供</span></h2>
            <div class="image">
                <div class="image1">
                    <i class="cover">
                    <p>360手机</p>
                    <a href="#"><i class="fa fa-heart"></i>关注</a>
                    </i>
                    <a href="#"><img src="images/s17.jpg" alt="" width="244px" height="330px"></a>
                </div>
                <div class="image2">
                    <a href="#"><img src="images/s18.jpg" alt="" ></a>
                </div>
            </div>
            <div class="good-list">
                <div class="over" id="san">
                    
                </div>
            </div>
        </div>
        <div class="content content13">
            <h2>BRAND<span>入驻品牌</span></h2>
            <div class="img-list">
                <ul>
                    <li><a href="#"><img src="images/B1.jpg" alt="1"></a></li>
                    <li><a href="#"><img src="images/B2.jpg" alt="2"></a></li>
                    <li><a href="#"><img src="images/B3.jpg" alt="3"></a></li>
                    <li><a href="#"><img src="images/B4.jpg" alt="4"></a></li>
                    <li><a href="#"><img src="images/B5.jpg" alt="5"></a></li>
                    <li><a href="#"><img src="images/B6.jpg" alt="6"></a></li>
                    <li><a href="#"><img src="images/B7.jpg" alt="7"></a></li>
                    <li><a href="#"><img src="images/B8.jpg" alt="8"></a></li>
                    <li><a href="#"><img src="images/B9.jpg" alt="9"></a></li>
                    <li><a href="#"><img src="images/B10.jpg" alt="10"></a></li>
                    <li><a href="#"><img src="images/B11.jpg" alt="11"></a></li>
                    <li><a href="#"><img src="images/B12.jpg" alt="12"></a></li>
                    <li><a href="#"><img src="images/B13.jpg" alt="13"></a></li>
                    <li><a href="#"><img src="images/B14.jpg" alt="14"></a></li>
                    <li><a href="#"><img src="images/B15.jpg" alt="15"></a></li>
                    <li><a href="#"><img src="images/B16.jpg" alt="16"></a></li>
                    <li><a href="#"><img src="images/B17.jpg" alt="17"></a></li>
                    <li><a href="#"><img src="images/B18.jpg" alt="18"></a></li>
                    <li><a href="#"><img src="images/B19.jpg" alt="19"></a></li>
                    <li><a href="#"><img src="images/B20.jpg" alt="20"></a></li>
                    <li><a href="#"><img src="images/B21.jpg" alt="21"></a></li>
                </ul>
            </div>
        </div>
        <div class="footer">
            <div class="side side1">
                <h5>关于我们</h5>
                <ul>
                    <li><a href="#">关于我们</a></li>
                    <li><a href="#">帮助中心</a></li>
                    <li><a href="#">加入我们</a></li>
                    <li><a href="#">标签集</a></li>
                    <li><a href="#">联系我们</a></li>
                    <li><a href="#">免责声明</a></li>
                    <li><a href="#">商务合作</a></li>
                </ul>
            </div>
            <div class="side side2">
                <h5>手机应用</h5>
                <ul>
                    <li><a href="#">诚真客户端</a></li>
                    <li><a href="#">诚真壁纸</a></li>
                    <li><a href="#">诚真良品购</a></li>
                </ul>
            </div>
            <div class="side side3">
                <img src="images/code.png" alt="二维码" width="100px" height="100px">
                <p>扫描二维码</p>
                <p>下载诚真手机客户端</p>
            </div>
            <div class="side side4">
                <h5>关注我们</h5>
                <ul>
                    <li><a href="#">新浪微博</a></li>
                    <li><a href="#">微信</a></li>
                    <li><a href="#">腾讯微博</a></li>
                    <li><a href="#">QQ空间</a></li>
                    <li><a href="#">人人网</a></li>
                    <li><a href="#">豆瓣</a></li>
                </ul>
            </div>
            <div class="side side5">
                <h5>友情链接</h5>
                <ul>
                    <li><a href="#">爱物网</a></li>
                    <li><a href="#">东方女性网</a></li>
                    <li><a href="#">肉丁网</a></li>
                    <li><a href="#">致一地产</a></li>
                    <li><a href="#">南风科技</a></li>
                    <li><a href="#">壹心理</a></li>
                    <li><a href="#">旅梦</a></li>
                    <li><a href="#">更多...</a></li>
                </ul>
            </div>
        </div>
        <div class="layer"></div>
        <div class="login-reg-group">
        <div class="login">
        <div class="login-title">
            <p>登录</p>
            <a href="javascript:;" class="close">关闭</a>
        </div>
        <div class="login-content">
            <div class="login-box">
                <div class="login-form">
                <%
                session.setAttribute("userName", "");
                session.setAttribute("passWord", "");
                String userName="";
                String passWord="";
                    Cookie [] cookies=request.getCookies();
			        for(int i=0;i<cookies.length;i++){
				      if(cookies[i].getName().equals("uname")){
				     userName=cookies[i].getValue();
				     session.setAttribute("userName", userName);
				      }
				      if(cookies[i].getName().equals("upwd")){
				     passWord=cookies[i].getValue();
				     session.setAttribute("passWord", passWord);
				      }
				    }
                     %>
                    <form action="servlet/user.do?opr=login" method="post">
                        <div class="input">
                            <div class="username"><input type="text" value="${userName }" name="userName" placeholder="用户名/邮箱"  class="text un"></div>
                            <div class="password"><input type="password" value="${passWord }" name="passWord" placeholder="密码"  class="text pw"></div>
                        </div>
                        <div class="check">
                            <input type="checkbox" id="rem" name="autoLogin"><label for="rem">记住我</label>
                            <a href="#">忘记密码？</a>
                        </div>
                        <div class="submit">
                            <a href="login.html"><input type="submit" class="submit-btn" value="登录"></a>
                        </div>
                    </form>
                    
                    <div class="app">
                        <a href="#">QQ</a>
                        <a href="#">微博</a>
                        <a href="#">豆瓣</a>
                        <a href="#">淘宝</a>
                        <a href="#">腾讯微博</a>
                    </div>
                </div>
                <div class="login-code">
                    <a href="#">
                        <p>二维码</p>
                        <p>扫一扫下载手机客户端</p>
                        <p>浏览体验更佳</p>
                    </a>
                </div>
            </div>
        </div>
        <div class="login-footer">
            <a href="javascript:;" class="toregist">还没有账号？立即注册</a>
        </div>
        </div>
        <div class="register">
            <div class="register-title">
            <p>注册</p>
            <a href="javascript:;" class="close">关闭</a>
        </div>
        <div class="register-content">
            <div class="register-box clearfix">
                <div class="register-form">
                    <form action="servlet/user.do?opr=reg" method="post">
                        <div class="input">
                            <div class="username clearfix"><label for="text un">用户名：</label><input type="text" name="userName" placeholder="用户名/邮箱"  class="text un" onblur="checkUser(this)"><span id="check1"></span></div>
                            <div class="password1 clearfix"><label for="text pw1">密码：</label><input type="password" name="passWord" placeholder="密码"  class="text pw1"></div>
                            <div class="password2 clearfix"><label for="text pw2">确认密码：</label><input type="password" name="passWord1" placeholder="确认密码"  class="text pw2"></div>
                        </div>
                        <div class="reg">
                            <input type="submit" class="reg-btn" value="注册">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="reg-footer">
            <a href="javascript:;" class="tologin">已有账号？立即登录</a>
        </div>
        </div>
        </div>
        <div class="sidebar">
            <ul>
                <li><a href="#">1F</a></li>
                <li><a href="#">2F</a></li>
                <li><a href="#">3F</a></li>
                <li><a href="#">4F</a></li>
                <li><a href="#">5F</a></li>
                <li><a href="#">6F</a></li>
                <li><a href="#">7F</a></li>
                <li><a href="#">8F</a></li>
                <li><a href="#">9F</a></li>
                <li><a href="#">10F</a></li>
                <li><a href="#" class="gotop"></a></li>
            </ul>
        </div>
    </div>
</body>
</html>