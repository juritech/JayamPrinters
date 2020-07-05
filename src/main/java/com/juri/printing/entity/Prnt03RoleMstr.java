package com.juri.printing.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRNT03_ROLE_MSTR")
public class Prnt03RoleMstr {
	@Id
	@Column(name = "PRNT03_ROLE_MSTR_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long prnt03RoleMstrId;
	@Column(name = "PRNT03_ROLE_NME")
	private String prnt03RoleNme;
	@Column(name = "PRNT03_CRT_DT", columnDefinition = "Date default getDate()")
	private Date prnt03CrtDt;
	@Column(name = "PRNT03_CRT_UR")
	private String prnt03CrtUr;
	@Column(name = "PRNT03_CRT_DS")
	private String prnt03CrtDs;
	@Column(name = "PRNT03_UPDT_DT", columnDefinition = "Date default getDate()")
	private Date prnt03UpdtDt;
	@Column(name = "PRNT03_UPDT_UR")
	private String prnt03UpdtUr;
	@Column(name = "PRNT03_UPDT_Ds")
	private String prnt03UpdtDs;
	@OneToMany(mappedBy = "prnt03RoleMstrId", fetch = FetchType.LAZY)
	private List<Prnt04Usr> lstPrnt04Usr;

	public Long getPrnt03RoleMstrId() {
		return prnt03RoleMstrId;
	}

	public void setPrnt03RoleMstrId(Long prnt03RoleMstrId) {
		this.prnt03RoleMstrId = prnt03RoleMstrId;
	}

	public String getPrnt03RoleNme() {
		return prnt03RoleNme;
	}

	public void setPrnt03RoleNme(String prnt03RoleNme) {
		this.prnt03RoleNme = prnt03RoleNme;
	}

	public Date getPrnt03CrtDt() {
		return prnt03CrtDt;
	}

	public void setPrnt03CrtDt(Date prnt03CrtDt) {
		this.prnt03CrtDt = prnt03CrtDt;
	}

	public String getPrnt03CrtUr() {
		return prnt03CrtUr;
	}

	public void setPrnt03CrtUr(String prnt03CrtUr) {
		this.prnt03CrtUr = prnt03CrtUr;
	}

	public String getPrnt03CrtDs() {
		return prnt03CrtDs;
	}

	public void setPrnt03CrtDs(String prnt03CrtDs) {
		this.prnt03CrtDs = prnt03CrtDs;
	}

	public Date getPrnt03UpdtDt() {
		return prnt03UpdtDt;
	}

	public void setPrnt03UpdtDt(Date prnt03UpdtDt) {
		this.prnt03UpdtDt = prnt03UpdtDt;
	}

	public String getPrnt03UpdtUr() {
		return prnt03UpdtUr;
	}

	public void setPrnt03UpdtUr(String prnt03UpdtUr) {
		this.prnt03UpdtUr = prnt03UpdtUr;
	}

	public String getPrnt03UpdtDs() {
		return prnt03UpdtDs;
	}

	public void setPrnt03UpdtDs(String prnt03UpdtDs) {
		this.prnt03UpdtDs = prnt03UpdtDs;
	}

	public List<Prnt04Usr> getLstPrnt04Usr() {
		return lstPrnt04Usr;
	}

	public void setLstPrnt04Usr(List<Prnt04Usr> lstPrnt04Usr) {
		this.lstPrnt04Usr = lstPrnt04Usr;
	}

}
