package com.praj.omss.entity;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="Admin")

public class Admin {
	@Id
	//@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="admin_id")
	private int AdminId;
	
	public Admin(int adminId, String password, char adminName) {
		super();
		this.AdminId = adminId;
		this.password = password;
		this.AdminName = adminName;
	}
	public Admin() {
		super();
	}
	@Column(name="password")
	private String password;
	@Column(name="Name")
	private char AdminName;
	public int getAdminId() {
		return AdminId;
	}
	public void setAdminId(int adminId) {
		AdminId = adminId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public char getAdminName() {
		return AdminName;
	}
	public void setAdminName(char adminName) {
		AdminName = adminName;
	}
	@Override
	public String toString() {
		return "Admin [AdminId=" + AdminId + ", password=" + password + ", AdminName=" + AdminName + "]";
	}


}
