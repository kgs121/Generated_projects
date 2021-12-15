package com.epam.reservation.vo;



import lombok.Data;


public class UserDetail {
	
	
	private Integer userId;
	
	private String userName;
	
	private String userRole;
	
	private String address;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserDetail [userId=" + userId + ", userName=" + userName + ", userRole=" + userRole + ", address="
				+ address + "]";
	}

	public UserDetail(Integer userId, String userName, String userRole, String address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userRole = userRole;
		this.address = address;
	}

	public UserDetail() {
		super();
	}
	
	
	
	


}
