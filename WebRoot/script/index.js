 $(function(){
            //轮播图实现
            var index=1;
            var timer;
            var interval=2000;
            function move(offset){
                newLeft=parseInt($('.slide-list').css('margin-left'))+offset;
                if(newLeft>0){newLeft=-5950;}
                if(newLeft<-5950){newLeft=0;}
                $('.slide-list').css('margin-left',newLeft);
            }
            function showButtons(number){
                $('.circle a').eq(number-1).addClass('selected').siblings().removeClass('selected');
            }
            $('.next').on('click',function(){
                move(-1190);
                index++;
                if(index>6){index=1;}
                showButtons(index);
            })
            $('.prev').on('click',function(){
                move(1190);
                index--;
                if(index<1){index=6;}
                showButtons(index);
            })
            $('.circle a').on('click',function(){
                var myIndex=parseInt($(this).attr('index'));
                var offset=-1190*(myIndex-index);
                move(offset);
                index=myIndex;
                showButtons(index);
            })
            function play(){
                timer=setTimeout(function(){
                    $('.next').trigger('click');
                    play();
                },interval);
            }
            function stop(){
                clearTimeout(timer);
            }
            $('.slide').hover(stop,play);
            play();
            $('.slide').on('mouseover',function(){
                $('.slide .arrow').css('opacity','0.3');
            })
            $('.slide').on('mouseleave',function(){
                $('.slide .arrow').css('opacity','0');
            })
        })
        //登录弹出层
        $(function(){
            $('.layer').hide();
            $('.login-btn').on('click',function(){
                $('.layer').show();
                $('.login').show();
            })
            $('.close').on('click',function(){
                $('.layer').hide();
                $('.login').hide();
            })
        })
        //注册弹出层
        $(function(){
            $('.layer').hide();
            $('.reg-btn').on('click',function(){
                $('.layer').show();
                $('.register').show();
            })
            $('.close').on('click',function(){
                $('.layer').hide();
                $('.register').hide();
            })
        })
        //回到顶部
        $(function(){
            goTOP_status();
            $('.gotop').on('click',function(){
                $('html,body').animate({scrollTop:0},500);
            })
            $(window).on('scroll',function(){
                goTOP_status();
            })
            function goTOP_status(){
                if($(window).scrollTop()>0){
                    $('.gotop').fadeIn('slow');
                }else{
                    $('.gotop').fadeOut('slow');
                }
            }
        })
        //注册，登录轮转
        $(function(){
            $('.tologin').on('click',function(){
                $('.login-reg-group').addClass('switching');
                setTimeout(function(){
                    $('.register').css('display','none');
                    $('login').css('display','block');
                },400);
                setTimeout(function(){
                    $('.login-reg-group').removeClass('switching')
                },800);
            })
            $('.toregist').on('click',function(){
                $('.login-reg-group').addClass('switching');
                setTimeout(function(){
                    $('.register').css('display','block');
                    $('login').css('display','none');
                },400);
                setTimeout(function(){
                    $('.login-reg-group').removeClass('switching')
                },800);
            })
        })
        function checkUser(dom){
        var userName=$(dom).val();
        var url="servlet/userAjax.do?opr=findUser&userName="+userName;
        $.get(url,function(data){
        if(data.flag=="true"){
        $("#check1").text("×");
        $("#check1").css("color","red");
        }else{
        $("#check1").text("√");
        $("#check1").css("color","green");
        }
        })
        }
        window.onload=function(){
        	var url="servlet/phoneAjax.do?opr=phoneList";
        	$.get(url,function(data){
        		var hotPhones=data.hotPhones;
        		for(var i=0;i<hotPhones.length;i++){
            $("#rm").append("<figure class='focus'><a href='servlet/phone.do?opr=message&id="+hotPhones[i].pid+"'><img src='"+hotPhones[i].pimage+"' alt=''></a>"+
        				"<figcaption><a href='#'>"+hotPhones[i].pmodel+"</a><p>"+hotPhones[i].pintro+"</p>"+
        				"<p class='price'>￥"+hotPhones[i].price+"<span>已售：58</span></p></figcaption></figure>");
        		}
        		var xmPhones=data.xmPhones;
        		for(var i=0;i<xmPhones.length;i++){
            $("#xm").append("<figure class='focus'><a href='servlet/phone.do?opr=message&id="+xmPhones[i].pid+"'><img src='"+xmPhones[i].pimage+"' alt=''></a>"+
        				"<figcaption><a href='#'>"+xmPhones[i].pmodel+"</a><p>"+xmPhones[i].pintro+"</p>"+
        				"<p class='price'>￥"+xmPhones[i].price+"<span>已售：58</span></p></figcaption></figure>");
        		}
        		var ryPhones=data.ryPhones;
        		for(var i=0;i<ryPhones.length;i++){
            $("#ry").append("<figure class='focus'><a href='servlet/phone.do?opr=message&id="+ryPhones[i].pid+"'><img src='"+ryPhones[i].pimage+"' alt=''></a>"+
        				"<figcaption><a href='#'>"+ryPhones[i].pmodel+"</a><p>"+ryPhones[i].pintro+"</p>"+
        				"<p class='price'>￥"+ryPhones[i].price+"<span>已售：58</span></p></figcaption></figure>");
        		}
        		var hwPhones=data.hwPhones;
        		for(var i=0;i<hwPhones.length;i++){
            $("#hw").append("<figure class='focus'><a href='servlet/phone.do?opr=message&id="+hwPhones[i].pid+"'><img src='"+hwPhones[i].pimage+"' alt=''></a>"+
        				"<figcaption><a href='#'>"+hwPhones[i].pmodel+"</a><p>"+hwPhones[i].pintro+"</p>"+
        				"<p class='price'>￥"+hwPhones[i].price+"<span>已售：58</span></p></figcaption></figure>");
        		}
        		var mzPhones=data.mzPhones;
        		for(var i=0;i<mzPhones.length;i++){
            $("#mz").append("<figure class='focus'><a href='servlet/phone.do?opr=message&id="+mzPhones[i].pid+"'><img src='"+mzPhones[i].pimage+"' alt=''></a>"+
        				"<figcaption><a href='#'>"+mzPhones[i].pmodel+"</a><p>"+mzPhones[i].pintro+"</p>"+
        				"<p class='price'>￥"+mzPhones[i].price+"<span>已售：58</span></p></figcaption></figure>");
        		}
        		var oppoPhones=data.oppoPhones;
        		for(var i=0;i<oppoPhones.length;i++){
            $("#oppo").append("<figure class='focus'><a href='servlet/phone.do?opr=message&id="+oppoPhones[i].pid+"'><img src='"+oppoPhones[i].pimage+"' alt=''></a>"+
        				"<figcaption><a href='#'>"+oppoPhones[i].pmodel+"</a><p>"+oppoPhones[i].pintro+"</p>"+
        				"<p class='price'>￥"+oppoPhones[i].price+"<span>已售：58</span></p></figcaption></figure>");
        		}
        		var vivoPhones=data.vivoPhones;
        		for(var i=0;i<vivoPhones.length;i++){
            $("#vivo").append("<figure class='focus'><a href='servlet/phone.do?opr=message&id="+vivoPhones[i].pid+"'><img src='"+vivoPhones[i].pimage+"' alt=''></a>"+
        				"<figcaption><a href='#'>"+vivoPhones[i].pmodel+"</a><p>"+vivoPhones[i].pintro+"</p>"+
        				"<p class='price'>￥"+vivoPhones[i].price+"<span>已售：58</span></p></figcaption></figure>");
        		}
        		var applePhones=data.applePhones;
        		for(var i=0;i<applePhones.length;i++){
            $("#apple").append("<figure class='focus'><a href='servlet/phone.do?opr=message&id="+applePhones[i].pid+"'><img src='"+applePhones[i].pimage+"' alt=''></a>"+
        				"<figcaption><a href='#'>"+applePhones[i].pmodel+"</a><p>"+applePhones[i].pintro+"</p>"+
        				"<p class='price'>￥"+applePhones[i].price+"<span>已售：58</span></p></figcaption></figure>");
        		}
        		var lsPhones=data.lsPhones;
        		for(var i=0;i<lsPhones.length;i++){
            $("#ls").append("<figure class='focus'><a href='servlet/phone.do?opr=message&id="+lsPhones[i].pid+"'><img src='"+lsPhones[i].pimage+"' alt=''></a>"+
        				"<figcaption><a href='#'>"+lsPhones[i].pmodel+"</a><p>"+lsPhones[i].pintro+"</p>"+
        				"<p class='price'>￥"+lsPhones[i].price+"<span>已售：58</span></p></figcaption></figure>");
        		}
        		var sxPhones=data.sxPhones;
        		for(var i=0;i<sxPhones.length;i++){
            $("#sx").append("<figure class='focus'><a href='servlet/phone.do?opr=message&id="+sxPhones[i].pid+"'><img src='"+sxPhones[i].pimage+"' alt=''></a>"+
        				"<figcaption><a href='#'>"+sxPhones[i].pmodel+"</a><p>"+sxPhones[i].pintro+"</p>"+
        				"<p class='price'>￥"+sxPhones[i].price+"<span>已售：58</span></p></figcaption></figure>");
        		}
        		var sanPhones=data.sanPhones;
        		for(var i=0;i<sanPhones.length;i++){
            $("#san").append("<figure class='focus'><a href='servlet/phone.do?opr=message&id="+sanPhones[i].pid+"'><img src='"+sanPhones[i].pimage+"' alt=''></a>"+
        				"<figcaption><a href='#'>"+sanPhones[i].pmodel+"</a><p>"+sanPhones[i].pintro+"</p>"+
        				"<p class='price'>￥"+sanPhones[i].price+"<span>已售：58</span></p></figcaption></figure>");
        		}
        	});
        }
        
        
        
        
        
        
        
        