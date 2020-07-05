package com.juri.printing.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRNT04_USR")
public class Prnt04Usr {
	@Id
	@Column(name = "PRNT04_USR_ID")
	private String prnt04UsrId;
	@Column(name = "PRNT04_USR_NME")
	private String prnt01UsrNme;
	@Column(name = "PRNT04_FST_NME")
	private String prnt04FstNme;
	@Column(name = "PRNT04_LST_NME")
	private String prnt04LstNme;
	@Column(name = "PRNT04_ADD")
	private String prnt04Addr;
	@Column(name = "PRNT04_PASS")
	private String prnt04Pass;
	@Column(name = "PRNT04_EMAIL")
	private String prnt04Email;
	@JoinColumn(name = "prnt03RoleMstrId")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Prnt03RoleMstr prnt03RoleMstrId;
	@Column(name = "PRNT04_CRT_DT", columnDefinition = "Date default getDate()")
	private Date prnt04CrtDt;
	@Column(name = "PRNT04_CRT_UR")
	private String prnt04CrtUr;
	@Column(name = "PRNT04_CRT_DS")
	private String prnt04CrtDs;
	@Column(name = "PRNT04_UPDT_DT", columnDefinition = "Date default getDate()")
	private Date prnt04UpdtDt;
	@Column(name = "PRNT04_UPDT_UR")
	private String prnt04UpdtUr;
	@Column(name = "PRNT04_UPDT_Ds")
	private String prnt04UpdtDs;
	public String getPrnt04UsrId() {
		return prnt04UsrId;
	}
	public void setPrnt04UsrId(String prnt04UsrId) {
		this.prnt04UsrId = prnt04UsrId;
	}
	public String getPrnt01UsrNme() {
		return prnt01UsrNme;
	}
	public void setPrnt01UsrNme(String prnt01UsrNme) {
		this.prnt01UsrNme = prnt01UsrNme;
	}
	public String getPrnt04FstNme() {
		return prnt04FstNme;
	}
	public void setPrnt04FstNme(String prnt04FstNme) {
		this.prnt04FstNme = prnt04FstNme;
	}
	public String getPrnt04LstNme() {
		return prnt04LstNme;
	}
	public void setPrnt04LstNme(String prnt04LstNme) {
		this.prnt04LstNme = prnt04LstNme;
	}
	public String getPrnt04Addr() {
		return prnt04Addr;
	}
	public void setPrnt04Addr(String prnt04Addr) {
		this.prnt04Addr = prnt04Addr;
	}
	public String getPrnt04Pass() {
		return prnt04Pass;
	}
	public void setPrnt04Pass(String prnt04Pass) {
		this.prnt04Pass = prnt04Pass;
	}
	public Prnt03RoleMstr getPrnt03RoleMstrId() {
		return prnt03RoleMstrId;
	}
	public void setPrnt03RoleMstrId(Prnt03RoleMstr prnt03RoleMstrId) {
		this.prnt03RoleMstrId = prnt03RoleMstrId;
	}
	public Date getPrnt04CrtDt() {
		return prnt04CrtDt;
	}
	public void setPrnt04CrtDt(Date prnt04CrtDt) {
		this.prnt04CrtDt = prnt04CrtDt;
	}
	public String getPrnt04CrtUr() {
		return prnt04CrtUr;
	}
	public void setPrnt04CrtUr(String prnt04CrtUr) {
		this.prnt04CrtUr = prnt04CrtUr;
	}
	public String getPrnt04CrtDs() {
		return prnt04CrtDs;
	}
	public void setPrnt04CrtDs(String prnt04CrtDs) {
		this.prnt04CrtDs = prnt04CrtDs;
	}
	public Date getPrnt04UpdtDt() {
		return prnt04UpdtDt;
	}
	public void setPrnt04UpdtDt(Date prnt04UpdtDt) {
		this.prnt04UpdtDt = prnt04UpdtDt;
	}
	public String getPrnt04UpdtUr() {
		return prnt04UpdtUr;
	}
	public void setPrnt04UpdtUr(String prnt04UpdtUr) {
		this.prnt04UpdtUr = prnt04UpdtUr;
	}
	public String getPrnt04UpdtDs() {
		return prnt04UpdtDs;
	}
	public void setPrnt04UpdtDs(String prnt04UpdtDs) {
		this.prnt04UpdtDs = prnt04UpdtDs;
	}
	public String getPrnt04Email() {
		return prnt04Email;
	}
	public void setPrnt04Email(String prnt04Email) {
		this.prnt04Email = prnt04Email;
	}
}