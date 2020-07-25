package com.juri.printing.vo;

import java.util.List;

public class PreDataVo {
	private List<PaperTypeVo> paperLst;
	private List<PrintBindVo> bndLst;
	private List<PrintTypeVo> printLst;
	public List<PaperTypeVo> getPaperLst() {
		return paperLst;
	}

	public void setPaperLst(List<PaperTypeVo> paperLst) {
		this.paperLst = paperLst;
	}

	public List<PrintBindVo> getBndLst() {
		return bndLst;
	}

	public void setBndLst(List<PrintBindVo> bndLst) {
		this.bndLst = bndLst;
	}

	public List<PrintTypeVo> getPrintLst() {
		return printLst;
	}

	public void setPrintLst(List<PrintTypeVo> printLst) {
		this.printLst = printLst;
	}
}
