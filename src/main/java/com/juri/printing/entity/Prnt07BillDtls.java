package com.juri.printing.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRNT07_BILL_DTLS")
public class Prnt07BillDtls {
	@Id
	@Column(name = "PRNT07_BILL_DTLS_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long prnt07BillDtlsId;
	@JoinColumn(name = "prnt05CustDtlsId")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Prnt05CustDtls prnt05CustDtlsId;
	@Column(name = "PRNT07_TOT_AMT")
	private Integer prnt07TotAmt;
	@Column(name = "PRNT07_PID_AMT")
	private Integer prnt07PidAmt;
	@Column(name = "PRNT07_DUE_AMT")
	private Integer prnt07DueAmt;
	@Column(name = "PRNT07_GST_FLG")
	private Boolean prnt07GstFlg;
	@Column(name = "PRNT07_GST_AMT")
	private Integer prnt07GstAmt;
	@Column(name = "PRNT07_CRT_DT", columnDefinition = "Date default getDate()")
	private Date prnt07CrtDt;
	@Column(name = "PRNT07_CRT_UR")
	private String prnt07CrtUr;
	@Column(name = "PRNT07_CRT_DS")
	private String prnt07CrtDs;
	@Column(name = "PRNT07_UPDT_DT", columnDefinition = "Date default getDate()")
	private Date prnt07UpdtDt;
	@Column(name = "PRNT07_UPDT_UR")
	private String prnt07UpdtUr;
	@Column(name = "PRNT07_UPDT_Ds")
	private String prnt07UpdtDs;

	public Long getPrnt07BillDtlsId() {
		return prnt07BillDtlsId;
	}

	public void setPrnt07BillDtlsId(Long prnt07BillDtlsId) {
		this.prnt07BillDtlsId = prnt07BillDtlsId;
	}

	public Prnt05CustDtls getPrnt05CustDtlsId() {
		return prnt05CustDtlsId;
	}

	public void setPrnt05CustDtlsId(Prnt05CustDtls prnt05CustDtlsId) {
		this.prnt05CustDtlsId = prnt05CustDtlsId;
	}

	public Integer getPrnt07TotAmt() {
		return prnt07TotAmt;
	}

	public void setPrnt07TotAmt(Integer prnt07TotAmt) {
		this.prnt07TotAmt = prnt07TotAmt;
	}

	public Integer getPrnt07PidAmt() {
		return prnt07PidAmt;
	}

	public void setPrnt07PidAmt(Integer prnt07PidAmt) {
		this.prnt07PidAmt = prnt07PidAmt;
	}

	public Integer getPrnt07DueAmt() {
		return prnt07DueAmt;
	}

	public void setPrnt07DueAmt(Integer prnt07DueAmt) {
		this.prnt07DueAmt = prnt07DueAmt;
	}

	public Boolean getPrnt07GstFlg() {
		return prnt07GstFlg;
	}

	public void setPrnt07GstFlg(Boolean prnt07GstFlg) {
		this.prnt07GstFlg = prnt07GstFlg;
	}

	public Integer getPrnt07GstAmt() {
		return prnt07GstAmt;
	}

	public void setPrnt07GstAmt(Integer prnt07GstAmt) {
		this.prnt07GstAmt = prnt07GstAmt;
	}

	public Date getPrnt07CrtDt() {
		return prnt07CrtDt;
	}

	public void setPrnt07CrtDt(Date prnt07CrtDt) {
		this.prnt07CrtDt = prnt07CrtDt;
	}

	public String getPrnt07CrtUr() {
		return prnt07CrtUr;
	}

	public void setPrnt07CrtUr(String prnt07CrtUr) {
		this.prnt07CrtUr = prnt07CrtUr;
	}

	public String getPrnt07CrtDs() {
		return prnt07CrtDs;
	}

	public void setPrnt07CrtDs(String prnt07CrtDs) {
		this.prnt07CrtDs = prnt07CrtDs;
	}

	public Date getPrnt07UpdtDt() {
		return prnt07UpdtDt;
	}

	public void setPrnt07UpdtDt(Date prnt07UpdtDt) {
		this.prnt07UpdtDt = prnt07UpdtDt;
	}

	public String getPrnt07UpdtUr() {
		return prnt07UpdtUr;
	}

	public void setPrnt07UpdtUr(String prnt07UpdtUr) {
		this.prnt07UpdtUr = prnt07UpdtUr;
	}

	public String getPrnt07UpdtDs() {
		return prnt07UpdtDs;
	}

	public void setPrnt07UpdtDs(String prnt07UpdtDs) {
		this.prnt07UpdtDs = prnt07UpdtDs;
	}
}
