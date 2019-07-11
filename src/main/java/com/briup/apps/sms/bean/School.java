package com.briup.apps.sms.bean;

public class School {
	private Long id;
	private String name;
	private String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Long getAddress() {
		return address;
	}
	public void setAddress(Long address) {
		this.address = address;
	}
	private String tel;
	private Long address;
	
	}