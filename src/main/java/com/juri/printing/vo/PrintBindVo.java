package com.juri.printing.vo;

public class PrintBindVo {

	private int bindId;
	private String bindType;
	private String bindSize;
	private float bindAmt;
	private boolean errFlg = false;
	private String msg = "";

	public int getBindId() {
		return bindId;
	}

	public void setBindId(int i) {
		this.bindId = i;
	}

	public String getBindType() {
		return bindType;
	}

	public void setBindType(String bindType) {
		this.bindType = bindType;
	}

	public String getBindSize() {
		return bindSize;
	}

	public void setBindSize(String bindSize) {
		this.bindSize = bindSize;
	}

	public float getBindAmt() {
		return bindAmt;
	}

	public void setBindAmt(float bindAmt) {
		this.bindAmt = bindAmt;
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
