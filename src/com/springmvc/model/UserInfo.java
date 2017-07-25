package com.springmvc.model;
/**
 * �û���Ϣʵ����
 * @author Administrator
 *
 */
public class UserInfo {
	//主键
			private int uid;
			//用户真实姓名
			private String urealname;
			//用户性别
			private String usex;
			//用户邮箱
			private String uemail;
			//用户登录名
			private String username;
			//用户登录密码
			private String upassword;
			//登录时间
			private String uregtime;
			//用户头像
			private String uimage;
			//支付账户
			private String upay;
			
			public UserInfo() {
			}
			
			public UserInfo(int uid, String urealname, String usex, String uemail,
					String username, String upassword, String uregtime, String uimage,
					String upay) {
				super();
				this.uid = uid;
				this.urealname = urealname;
				this.usex = usex;
				this.uemail = uemail;
				this.username = username;
				this.upassword = upassword;
				this.uregtime = uregtime;
				this.uimage = uimage;
				this.upay = upay;
			}
			
			public int getUid() {
				return uid;
			}

			public void setUid(int uid) {
				this.uid = uid;
			}

			public String getUrealname() {
				return urealname;
			}

			public void setUrealname(String urealname) {
				this.urealname = urealname;
			}

			public String getUsex() {
				return usex;
			}

			public void setUsex(String usex) {
				this.usex = usex;
			}

			public String getUemail() {
				return uemail;
			}

			public void setUemail(String uemail) {
				this.uemail = uemail;
			}

			public String getUsername() {
				return username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public String getUpassword() {
				return upassword;
			}

			public void setUpassword(String upassword) {
				this.upassword = upassword;
			}

			public String getUregtime() {
				return uregtime;
			}

			public void setUregtime(String uregtime) {
				this.uregtime = uregtime;
			}

			public String getUimage() {
				return uimage;
			}

			public void setUimage(String uimage) {
				this.uimage = uimage;
			}

			public String getUpay() {
				return upay;
			}

			public void setUpay(String upay) {
				this.upay = upay;
			}

			public UserInfo(String username, String upassword) {
				super();
				this.uid=0;
				this.username = username;
				this.upassword = upassword;
			}

			@Override
			public String toString() {
				return "User [uid=" + uid + ", urealname=" + urealname + ", usex="
						+ usex + ", uemail=" + uemail + ", uusername=" + username
						+ ", upassword=" + upassword + ", uregtime=" + uregtime
						+ ", uimage=" + uimage + ", upay=" + upay + "]";
			}
}
