package com.juri.printing.vo;

public class PrintTypeVo {
	private int id;
	private String printName;
	private String range;
	private float price;
	private boolean errFlg = false;
	private String msg = "";

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrintName() {
		return printName;
	}

	public void setPrintName(String printName) {
		this.printName = printName;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isErrFlg() {
		return errFlg;
	}

	public void setErrFlg(boolean errFlg) {
		this.errFlg = errFlg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
