package com.juri.printing.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRNT08_PRINT")
public class Prnt08Print {
	@Id
	@Column(name = "PRNT08_PRINT_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long prnt08PrintId;
	@Column(name = "PRNT08_PRINT_TYPE")
	private String prnt08PrintType;
	@Column(name = "PRNT08_PAGE_SIZE")
	private String prnt08PageSize;
	@Column(name = "PRNT08_AMT")
	private Integer prnt08Amt;
	@Column(name = "PRNT08_CRT_DT", columnDefinition = "Date default getDate()")
	private Date prnt08CrtDt;
	@Column(name = "PRNT08_CRT_UR")
	private String prnt08CrtUr;
	@Column(name = "PRNT08_CRT_DS")
	private String prnt08CrtDs;
	@Column(name = "PRNT08_UPDT_DT", columnDefinition = "Date default getDate()")
	private Date prnt08UpdtDt;
	@Column(name = "PRNT08_UPDT_UR")
	private String prnt08UpdtUr;
	@Column(name = "PRNT08_UPDT_Ds")
	private String prnt08UpdtDs;

	public Long getPrnt08PrintId() {
		return prnt08PrintId;
	}

	public void setPrnt08PrintId(Long prnt08PrintId) {
		this.prnt08PrintId = prnt08PrintId;
	}

	public String getPrnt08PrintType() {
		return prnt08PrintType;
	}

	public void setPrnt08PrintType(String prnt08PrintType) {
		this.prnt08PrintType = prnt08PrintType;
	}

	public String getPrnt08PageSize() {
		return prnt08PageSize;
	}

	public void setPrnt08PageSize(String prnt08PageSize) {
		this.prnt08PageSize = prnt08PageSize;
	}

	public Integer getPrnt08Amt() {
		return prnt08Amt;
	}

	public void setPrnt08Amt(Integer prnt08Amt) {
		this.prnt08Amt = prnt08Amt;
	}

	public Date getPrnt08CrtDt() {
		return prnt08CrtDt;
	}

	public void setPrnt08CrtDt(Date prnt08CrtDt) {
		this.prnt08CrtDt = prnt08CrtDt;
	}

	public String getPrnt08CrtUr() {
		return prnt08CrtUr;
	}

	public void setPrnt08CrtUr(String prnt08CrtUr) {
		this.prnt08CrtUr = prnt08CrtUr;
	}

	public String getPrnt08CrtDs() {
		return prnt08CrtDs;
	}

	public void setPrnt08CrtDs(String prnt08CrtDs) {
		this.prnt08CrtDs = prnt08CrtDs;
	}

	public Date getPrnt08UpdtDt() {
		return prnt08UpdtDt;
	}

	public void setPrnt08UpdtDt(Date prnt08UpdtDt) {
		this.prnt08UpdtDt = prnt08UpdtDt;
	}

	public String getPrnt08UpdtUr() {
		return prnt08UpdtUr;
	}

	public void setPrnt08UpdtUr(String prnt08UpdtUr) {
		this.prnt08UpdtUr = prnt08UpdtUr;
	}

	public String getPrnt08UpdtDs() {
		return prnt08UpdtDs;
	}

	public void setPrnt08UpdtDs(String prnt08UpdtDs) {
		this.prnt08UpdtDs = prnt08UpdtDs;
	}
}
