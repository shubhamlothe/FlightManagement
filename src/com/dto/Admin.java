package com.dto;

public class Admin {
	private int adminId;
	private String adminName;
	private String adminPass;
	public Admin() {
	
		this.adminName = "admin";
		this.adminPass = "adminpass";
	}
	
	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPass() {
		return adminPass;
	}
	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}
	@Override
	public String toString() {
		return "Admin [adminName=" + adminName + ", adminPass=" + adminPass + "]";
	}
	
	
	
}
