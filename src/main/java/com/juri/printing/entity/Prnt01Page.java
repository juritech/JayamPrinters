package com.juri.printing.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRNT01_PAGE")
public class Prnt01Page {
	@Id
	@Column(name = "PRNT01_PAGE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long prnt01PageId;
	@Column(name = "PRNT01_PAGE_SIZE")
	private String prnt01PageSize;
	@Column(name = "PRNT01_PAGE_GSM")
	private String prnt01PageGsm;
	@Column(name = "PRNT01_AMT")
	private Float prnt01Amt;
	@Column(name = "PRNT01_CRT_DT", columnDefinition = "Date default getDate()")
	private Date prnt01CrtDt;
	@Column(name = "PRNT01_CRT_UR")
	private String prnt01CrtUr;
	@Column(name = "PRNT01_CRT_DS")
	private String prnt01CrtDs;
	@Column(name = "PRNT01_UPDT_DT", columnDefinition = "Date default getDate()")
	private Date prnt01UpdtDt;
	@Column(name = "PRNT01_UPDT_UR")
	private String prnt01UpdtUr;
	@Column(name = "PRNT01_UPDT_Ds")
	private String prnt01UpdtDs;

	public Long getPrnt01PageId() {
		return prnt01PageId;
	}

	public void setPrnt01PageId(Long prnt01PageId) {
		this.prnt01PageId = prnt01PageId;
	}

	public String getPrnt01PageSize() {
		return prnt01PageSize;
	}

	public void setPrnt01PageSize(String prnt01PageSize) {
		this.prnt01PageSize = prnt01PageSize;
	}

	public String getPrnt01PageGsm() {
		return prnt01PageGsm;
	}

	public void setPrnt01PageGsm(String prnt01PageGsm) {
		this.prnt01PageGsm = prnt01PageGsm;
	}

	public Float getPrnt01Amt() {
		return prnt01Amt;
	}

	public void setPrnt01Amt(Float prnt01Amt) {
		this.prnt01Amt = prnt01Amt;
	}

	public Date getPrnt01CrtDt() {
		return prnt01CrtDt;
	}

	public void setPrnt01CrtDt(Date prnt01CrtDt) {
		this.prnt01CrtDt = prnt01CrtDt;
	}

	public String getPrnt01CrtUr() {
		return prnt01CrtUr;
	}

	public void setPrnt01CrtUr(String prnt01CrtUr) {
		this.prnt01CrtUr = prnt01CrtUr;
	}

	public String getPrnt01CrtDs() {
		return prnt01CrtDs;
	}

	public void setPrnt01CrtDs(String prnt01CrtDs) {
		this.prnt01CrtDs = prnt01CrtDs;
	}

	public Date getPrnt01UpdtDt() {
		return prnt01UpdtDt;
	}

	public void setPrnt01UpdtDt(Date prnt01UpdtDt) {
		this.prnt01UpdtDt = prnt01UpdtDt;
	}

	public String getPrnt01UpdtUr() {
		return prnt01UpdtUr;
	}

	public void setPrnt01UpdtUr(String prnt01UpdtUr) {
		this.prnt01UpdtUr = prnt01UpdtUr;
	}

	public String getPrnt01UpdtDs() {
		return prnt01UpdtDs;
	}

	public void setPrnt01UpdtDs(String prnt01UpdtDs) {
		this.prnt01UpdtDs = prnt01UpdtDs;
	}
}
