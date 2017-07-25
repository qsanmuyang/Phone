package com.springmvc.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.model.PhoneInfo;
import com.springmvc.service.IPhoneBiz;

@Controller
@RequestMapping("/servlet")
public class PhoneController {
	
	@Autowired
	private IPhoneBiz iPhoneBiz;

	public IPhoneBiz getiPhoneBiz() {
		return iPhoneBiz;
	}

	public void setiPhoneBiz(IPhoneBiz iPhoneBiz) {
		this.iPhoneBiz = iPhoneBiz;
	}
	
	@RequestMapping("phone.do")
	public String phoneManage(HttpServletRequest request){
		String opr=request.getParameter("opr");
		HttpSession session=request.getSession();
		if(opr.equals("message")){
			String pid1=request.getParameter("id");
			int pid=Integer.parseInt(pid1);
			PhoneInfo pInfo = new PhoneInfo();
			pInfo=iPhoneBiz.getPhoneByPid(pid);
			session.setAttribute("pInfo", pInfo);
			return "redirect:/message.jsp";
		}
		return "redirect:/index.jsp";
	}
	
	@RequestMapping("phoneAjax.do")
	@ResponseBody
	public Map<Object, Object> ajaxManage(HttpServletRequest request){
		Map<Object, Object> map = new HashMap<Object, Object>();
		String opr=request.getParameter("opr");
		if(opr.equals("phoneList")){
			List<PhoneInfo> hotPhones=new ArrayList<PhoneInfo>();
			List<PhoneInfo> xmPhones=new ArrayList<PhoneInfo>();
			List<PhoneInfo> ryPhones=new ArrayList<PhoneInfo>();
			List<PhoneInfo> hwPhones=new ArrayList<PhoneInfo>();
			List<PhoneInfo> mzPhones=new ArrayList<PhoneInfo>();
			List<PhoneInfo> oppoPhones=new ArrayList<PhoneInfo>();
			List<PhoneInfo> vivoPhones=new ArrayList<PhoneInfo>();
			List<PhoneInfo> applePhones=new ArrayList<PhoneInfo>();
			List<PhoneInfo> lsPhones=new ArrayList<PhoneInfo>();
			List<PhoneInfo> sxPhones=new ArrayList<PhoneInfo>();
			List<PhoneInfo> sanPhones=new ArrayList<PhoneInfo>();
			hotPhones=iPhoneBiz.getPhonesByPtype("热门");
			xmPhones=iPhoneBiz.getPhonesByPtype("小米");
			ryPhones=iPhoneBiz.getPhonesByPtype("荣耀");
			hwPhones=iPhoneBiz.getPhonesByPtype("华为");
			mzPhones=iPhoneBiz.getPhonesByPtype("魅族");
			oppoPhones=iPhoneBiz.getPhonesByPtype("oppo");
			vivoPhones=iPhoneBiz.getPhonesByPtype("vivo");
			applePhones=iPhoneBiz.getPhonesByPtype("apple");
			lsPhones=iPhoneBiz.getPhonesByPtype("乐视");
			sxPhones=iPhoneBiz.getPhonesByPtype("三星");
			sanPhones=iPhoneBiz.getPhonesByPtype("360");
			map.put("hotPhones", hotPhones);
			map.put("xmPhones", xmPhones);
			map.put("ryPhones", ryPhones);
			map.put("hwPhones", hwPhones);
			map.put("mzPhones", mzPhones);
			map.put("oppoPhones", oppoPhones);
			map.put("vivoPhones", vivoPhones);
			map.put("applePhones", applePhones);
			map.put("lsPhones", lsPhones);
			map.put("sxPhones", sxPhones);
			map.put("sanPhones", sanPhones);
		}
		
		return map;
	}
	

}
