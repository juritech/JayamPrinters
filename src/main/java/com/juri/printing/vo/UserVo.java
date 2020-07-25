package com.juri.printing.vo;

import java.util.List;

public class UserVo {
	private String userName;
	private String password;
	private String role;
	private boolean auth = false;
	private String msg = "";
	private String firstName;
	private String moblNo;
	private boolean errFlg;
	private String address;
	private String email;
	private String gender;
	private List<String> roles;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isAuth() {
		return auth;
	}

	public void setAuth(boolean auth ) {
		this.auth  = auth;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMoblNo() {
		return moblNo;
	}

	public void setMoblNo(String moblNo) {
		this.moblNo = moblNo;
	}

	public boolean isErrFlg() {
		return errFlg;
	}

	public void setErrFlg(boolean errFlg) {
		this.errFlg = errFlg;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

}
