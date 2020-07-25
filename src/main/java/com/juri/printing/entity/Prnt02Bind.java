package com.juri.printing.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRNT02_BIND")
public class Prnt02Bind {
	@Id
	@Column(name = "PRNT02_BIND_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long prnt02BindId;
	@Column(name = "PRNT02_BIND_TYPE")
	private String prnt02BindType;
	@Column(name = "PRNT02_SIZE")
	private String prnt02Size;
	@Column(name = "PRNT02_AMT")
	private Float prnt02Amt;
	@Column(name = "PRNT02_CRT_DT", columnDefinition = "Date default getDate()")
	private Date prnt02CrtDt;
	@Column(name = "PRNT02_CRT_UR")
	private String prnt02CrtUr;
	@Column(name = "PRNT02_CRT_DS")
	private String prnt02CrtDs;
	@Column(name = "PRNT02_UPDT_DT", columnDefinition = "Date default getDate()")
	private Date prnt02UpdtDt;
	@Column(name = "PRNT02_UPDT_UR")
	private String prnt02UpdtUr;
	@Column(name = "PRNT02_UPDT_Ds")
	private String prnt02UpdtDs;

	public Long getPrnt02BindId() {
		return prnt02BindId;
	}

	public void setPrnt02BindId(Long prnt02BindId) {
		this.prnt02BindId = prnt02BindId;
	}

	public String getPrnt02BindType() {
		return prnt02BindType;
	}

	public void setPrnt02BindType(String prnt02BindType) {
		this.prnt02BindType = prnt02BindType;
	}

	public String getPrnt02Size() {
		return prnt02Size;
	}

	public void setPrnt02Size(String prnt02Size) {
		this.prnt02Size = prnt02Size;
	}

	public Float getPrnt02Amt() {
		return prnt02Amt;
	}

	public void setPrnt02Amt(Float prnt02Amt) {
		this.prnt02Amt = prnt02Amt;
	}

	public Date getPrnt02CrtDt() {
		return prnt02CrtDt;
	}

	public void setPrnt02CrtDt(Date prnt02CrtDt) {
		this.prnt02CrtDt = prnt02CrtDt;
	}

	public String getPrnt02CrtUr() {
		return prnt02CrtUr;
	}

	public void setPrnt02CrtUr(String prnt02CrtUr) {
		this.prnt02CrtUr = prnt02CrtUr;
	}

	public String getPrnt02CrtDs() {
		return prnt02CrtDs;
	}

	public void setPrnt02CrtDs(String prnt02CrtDs) {
		this.prnt02CrtDs = prnt02CrtDs;
	}

	public Date getPrnt02UpdtDt() {
		return prnt02UpdtDt;
	}

	public void setPrnt02UpdtDt(Date prnt02UpdtDt) {
		this.prnt02UpdtDt = prnt02UpdtDt;
	}

	public String getPrnt02UpdtUr() {
		return prnt02UpdtUr;
	}

	public void setPrnt02UpdtUr(String prnt02UpdtUr) {
		this.prnt02UpdtUr = prnt02UpdtUr;
	}

	public String getPrnt02UpdtDs() {
		return prnt02UpdtDs;
	}

	public void setPrnt02UpdtDs(String prnt02UpdtDs) {
		this.prnt02UpdtDs = prnt02UpdtDs;
	}
}
