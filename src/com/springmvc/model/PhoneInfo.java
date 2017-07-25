package com.springmvc.model;

public class PhoneInfo {
	//主键
	private int pid;
	//手机品牌
	private String pname;
	//手机数量
	private int pamount;
	//手机价格
	private double price;
	//手机型号
	private String pmodel;
	//手机介绍
	private String pintro;
	//手机分类
	private String ptype;
	//上架日期
	private String ptime;
	//手机图片
	private String pimage;
	
	public PhoneInfo() {
		
	}

	public PhoneInfo(int pid, String pname, int pamount, double price,
			String pmodel, String pintro, String ptype, String ptime,
			String pimage) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pamount = pamount;
		this.price = price;
		this.pmodel = pmodel;
		this.pintro = pintro;
		this.ptype = ptype;
		this.ptime = ptime;
		this.pimage = pimage;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPamount() {
		return pamount;
	}

	public void setPamount(int pamount) {
		this.pamount = pamount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPmodel() {
		return pmodel;
	}

	public void setPmodel(String pmodel) {
		this.pmodel = pmodel;
	}

	public String getPintro() {
		return pintro;
	}

	public void setPintro(String pintro) {
		this.pintro = pintro;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getPtime() {
		return ptime;
	}

	public void setPtime(String ptime) {
		this.ptime = ptime;
	}

	public String getPimage() {
		return pimage;
	}

	public void setPimage(String pimage) {
		this.pimage = pimage;
	}

	@Override
	public String toString() {
		return "PhoneInfo [pid=" + pid + ", pname=" + pname + ", pamount="
				+ pamount + ", price=" + price + ", pmodel=" + pmodel
				+ ", pintro=" + pintro + ", Ptype=" + ptype + ", ptime="
				+ ptime + ", pimage=" + pimage + "]";
	}
	
	
	
}
