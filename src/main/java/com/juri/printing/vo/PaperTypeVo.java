package com.juri.printing.vo;

public class PaperTypeVo {
	private int id;
	private String paperSize;
	private String gsm;
	private int price;
	private boolean errFlg = false;
	private String msg = "";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPaperSize() {
		return paperSize;
	}
	public void setPaperSize(String paperSize) {
		this.paperSize = paperSize;
	}
	public String getGsm() {
		return gsm;
	}
	public void setGsm(String gsm) {
		this.gsm = gsm;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
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
