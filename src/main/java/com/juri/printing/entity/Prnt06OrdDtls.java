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
@Table(name = "PRNT06_ORD_DTLS")
public class Prnt06OrdDtls {
	@Id
	@Column(name = "PRNT06_ORD_DTLS_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long prnt06OrdDtlsId;
	@JoinColumn(name = "prnt05CustDtlsId")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Prnt05CustDtls prnt05CustDtlsId;
	@Column(name = "PRNT06_DES", columnDefinition = "varchar(5000)")
	private String prnt06Des;
	@Column(name = "PRNT06_QTY")
	private Integer prnt06Qty;
	@Column(name = "PRNT06_AMT")
	private Integer prnt06Amt;
	@Column(name = "PRNT06_CRT_DT", columnDefinition = "Date default getDate()")
	private Date prnt06CrtDt;
	@Column(name = "PRNT06_CRT_UR")
	private String prnt06CrtUr;
	@Column(name = "PRNT06_CRT_DS")
	private String prnt06CrtDs;
	@Column(name = "PRNT06_UPDT_DT", columnDefinition = "Date default getDate()")
	private Date prnt06UpdtDt;
	@Column(name = "PRNT06_UPDT_UR")
	private String prnt06UpdtUr;
	@Column(name = "PRNT06_UPDT_Ds")
	private String prnt06UpdtDs;
	@Column(name="PRNT06_PROOF_DT")
	private Date prnt06ProofDt;
	@Column(name="PRNT06_DEL_DT")
	private Date prnt06DelDt;

	public Long getPrnt06OrdDtlsId() {
		return prnt06OrdDtlsId;
	}

	public void setPrnt06OrdDtlsId(Long prnt06OrdDtlsId) {
		this.prnt06OrdDtlsId = prnt06OrdDtlsId;
	}

	public Prnt05CustDtls getPrnt05CustDtlsId() {
		return prnt05CustDtlsId;
	}

	public void setPrnt05CustDtlsId(Prnt05CustDtls prnt05CustDtlsId) {
		this.prnt05CustDtlsId = prnt05CustDtlsId;
	}

	public String getPrnt06Des() {
		return prnt06Des;
	}

	public void setPrnt06Des(String prnt06Des) {
		this.prnt06Des = prnt06Des;
	}

	public Integer getPrnt06Qty() {
		return prnt06Qty;
	}

	public void setPrnt06Qty(Integer prnt06Qty) {
		this.prnt06Qty = prnt06Qty;
	}

	public Integer getPrnt06Amt() {
		return prnt06Amt;
	}

	public void setPrnt06Amt(Integer prnt06Amt) {
		this.prnt06Amt = prnt06Amt;
	}

	public Date getPrnt06CrtDt() {
		return prnt06CrtDt;
	}

	public void setPrnt06CrtDt(Date prnt06CrtDt) {
		this.prnt06CrtDt = prnt06CrtDt;
	}

	public String getPrnt06CrtUr() {
		return prnt06CrtUr;
	}

	public void setPrnt06CrtUr(String prnt06CrtUr) {
		this.prnt06CrtUr = prnt06CrtUr;
	}

	public String getPrnt06CrtDs() {
		return prnt06CrtDs;
	}

	public void setPrnt06CrtDs(String prnt06CrtDs) {
		this.prnt06CrtDs = prnt06CrtDs;
	}

	public Date getPrnt06UpdtDt() {
		return prnt06UpdtDt;
	}

	public void setPrnt06UpdtDt(Date prnt06UpdtDt) {
		this.prnt06UpdtDt = prnt06UpdtDt;
	}

	public String getPrnt06UpdtUr() {
		return prnt06UpdtUr;
	}

	public void setPrnt06UpdtUr(String prnt06UpdtUr) {
		this.prnt06UpdtUr = prnt06UpdtUr;
	}

	public String getPrnt06UpdtDs() {
		return prnt06UpdtDs;
	}

	public void setPrnt06UpdtDs(String prnt06UpdtDs) {
		this.prnt06UpdtDs = prnt06UpdtDs;
	}

	public Date getPrnt06ProofDt() {
		return prnt06ProofDt;
	}

	public void setPrnt06ProofDt(Date prnt06ProofDt) {
		this.prnt06ProofDt = prnt06ProofDt;
	}

	public Date getPrnt06DelDt() {
		return prnt06DelDt;
	}

	public void setPrnt06DelDt(Date prnt06DelDt) {
		this.prnt06DelDt = prnt06DelDt;
	}

}
