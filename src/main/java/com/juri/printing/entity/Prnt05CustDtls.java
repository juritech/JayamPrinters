package com.juri.printing.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRNT05_CUST_DTLS")
public class Prnt05CustDtls {
	@Id
	@Column(name = "PRNT05_CUST_DTLS_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long prnt05CustDtlsId;
	@Column(name = "PRNT05_CUST_NME")
	private String prnt05CustNme;
	@Column(name = "PRNT05_CUST_ADDR")
	private String prnt05CustAddr;
	@Column(name = "PRNT05_CUST_GNDR")
	private String prnt05CustGndr;
	@Column(name = "PRNT05_CUST_PHN_NUM")
	private String prnt05CustPhnNum;
	@OneToMany(mappedBy = "prnt05CustDtlsId")
	private List<Prnt06OrdDtls> lstOrdDtls;
	@OneToOne(mappedBy = "prnt05CustDtlsId")
	private Prnt07BillDtls lstBillDtls;
	@Column(name = "PRNT05_CRT_DT", columnDefinition = "Date default getDate()")
	private Date prnt05CrtDt;
	@Column(name = "PRNT05_CRT_UR")
	private String prnt05CrtUr;
	@Column(name = "PRNT05_CRT_DS")
	private String prnt05CrtDs;
	@Column(name = "PRNT05_UPDT_DT", columnDefinition = "Date default getDate()")
	private Date prnt05UpdtDt;
	@Column(name = "PRNT05_UPDT_UR")
	private String prnt05UpdtUr;
	@Column(name = "PRNT05_UPDT_Ds")
	private String prnt05UpdtDs;

	public Long getPrnt05CustDtlsId() {
		return prnt05CustDtlsId;
	}

	public void setPrnt05CustDtlsId(Long prnt05CustDtlsId) {
		this.prnt05CustDtlsId = prnt05CustDtlsId;
	}

	public String getPrnt05CustNme() {
		return prnt05CustNme;
	}

	public void setPrnt05CustNme(String prnt05CustNme) {
		this.prnt05CustNme = prnt05CustNme;
	}

	public String getPrnt05CustAddr() {
		return prnt05CustAddr;
	}

	public void setPrnt05CustAddr(String prnt05CustAddr) {
		this.prnt05CustAddr = prnt05CustAddr;
	}

	public String getPrnt05CustPhnNum() {
		return prnt05CustPhnNum;
	}

	public void setPrnt05CustPhnNum(String prnt05CustPhnNum) {
		this.prnt05CustPhnNum = prnt05CustPhnNum;
	}

	public List<Prnt06OrdDtls> getLstOrdDtls() {
		return lstOrdDtls;
	}

	public void setLstOrdDtls(List<Prnt06OrdDtls> lstOrdDtls) {
		this.lstOrdDtls = lstOrdDtls;
	}

	public Prnt07BillDtls getLstBillDtls() {
		return lstBillDtls;
	}

	public void setLstBillDtls(Prnt07BillDtls lstBillDtls) {
		this.lstBillDtls = lstBillDtls;
	}

	public Date getPrnt05CrtDt() {
		return prnt05CrtDt;
	}

	public void setPrnt05CrtDt(Date prnt05CrtDt) {
		this.prnt05CrtDt = prnt05CrtDt;
	}

	public String getPrnt05CrtUr() {
		return prnt05CrtUr;
	}

	public void setPrnt05CrtUr(String prnt05CrtUr) {
		this.prnt05CrtUr = prnt05CrtUr;
	}

	public String getPrnt05CrtDs() {
		return prnt05CrtDs;
	}

	public void setPrnt05CrtDs(String prnt05CrtDs) {
		this.prnt05CrtDs = prnt05CrtDs;
	}

	public Date getPrnt05UpdtDt() {
		return prnt05UpdtDt;
	}

	public void setPrnt05UpdtDt(Date prnt05UpdtDt) {
		this.prnt05UpdtDt = prnt05UpdtDt;
	}

	public String getPrnt05UpdtUr() {
		return prnt05UpdtUr;
	}

	public void setPrnt05UpdtUr(String prnt05UpdtUr) {
		this.prnt05UpdtUr = prnt05UpdtUr;
	}

	public String getPrnt05UpdtDs() {
		return prnt05UpdtDs;
	}

	public void setPrnt05UpdtDs(String prnt05UpdtDs) {
		this.prnt05UpdtDs = prnt05UpdtDs;
	}

	public String getPrnt05CustGndr() {
		return prnt05CustGndr;
	}

	public void setPrnt05CustGndr(String prnt05CustGndr) {
		this.prnt05CustGndr = prnt05CustGndr;
	}

}
