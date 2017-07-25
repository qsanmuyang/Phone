package com.springmvc.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.model.UserInfo;
import com.springmvc.service.IUserBiz;

@Controller
@RequestMapping("/servlet")
public class UserController {

	@Autowired
	private IUserBiz userBiz;

	public IUserBiz getUserBiz() {
		return userBiz;
	}

	public void setUserBiz(IUserBiz userBiz) {
		this.userBiz = userBiz;
	}
	
	@RequestMapping("/user.do")
	public String userManage(HttpServletRequest request,HttpServletResponse response){
		String opr=request.getParameter("opr");
		HttpSession session=request.getSession();
		if(opr.equals("login")){
			String userName=request.getParameter("userName");
			String passWord=request.getParameter("passWord");
			String autoLogin=request.getParameter("autoLogin");
			Map<String, String> map=new HashMap<String, String>();
			map.put("username", userName);
			map.put("upassword", passWord);
			if(userBiz.login(map)){
				session.setAttribute("LOGIN", userName);
				if(autoLogin!=null){
					Cookie uname = new Cookie("uname",userName);
					  Cookie upwd = new Cookie("upwd",passWord);
					  int day5 = 60 * 60 * 24 * 5;
					  uname.setMaxAge(day5);
					  upwd.setMaxAge(day5);
					  uname.setPath("/");
					  upwd.setPath("/");
					  response.addCookie(uname);
					  response.addCookie(upwd);
				}
				return "redirect:/index.jsp";
			}
		}else if(opr.equals("back")){
			session.removeAttribute("LOGIN");
			Cookie [] cookies=request.getCookies();
			for(int i=0;i<cookies.length;i++){
				    cookies[i].setMaxAge(0);
				    cookies[i].setPath("/");
                    response.addCookie(cookies[i]);
				}
			return "redirect:/index.jsp";
		}else if(opr.equals("reg")){
			String userName=request.getParameter("userName");
			String passWord=request.getParameter("passWord");
			UserInfo user=new UserInfo(userName, passWord);
			int num=userBiz.addUser(user);
			if(num>0){
				session.setAttribute("LOGIN", userName);
				return "redirect:/index.jsp";
			}else{
				return "redirect:/index.jsp";
			}
		}
		return "redirect:/index.jsp";
	}
	
	@ResponseBody
	@RequestMapping("/userAjax.do")
	public Map<Object, Object> userAjax(HttpServletRequest request){
		String opr=request.getParameter("opr");
		Map<Object, Object> map=new HashMap<Object, Object>();
		if(opr.equals("findUser")){
			String flag="false";
			String userName=request.getParameter("userName");
			if(userBiz.findUser(userName)){
				flag="true";
			}
			map.put("flag", flag);
		}
		return map;
	}
}
