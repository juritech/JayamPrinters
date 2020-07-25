package com.juri.printing.vo;

import java.util.List;

public class Customer {
	private int id;
	private String name;
	private String email;
	private String gender;
	private String address;
	private String number;
	private List<BillBook> lstBooks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public List<BillBook> getLstBooks() {
		return lstBooks;
	}

	public void setLstBooks(List<BillBook> lstBooks) {
		this.lstBooks = lstBooks;
	}
}
