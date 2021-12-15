package com.epam.reservation.vo;




public class Payment {
	
	private Integer userPayId;
	
	private Integer userId;
	
	private Integer paymentId;

	public Integer getUserPayId() {
		return userPayId;
	}

	public void setUserPayId(Integer userPayId) {
		this.userPayId = userPayId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public Payment(Integer userPayId, Integer userId, Integer paymentId) {
		super();
		this.userPayId = userPayId;
		this.userId = userId;
		this.paymentId = paymentId;
	}

	public Payment() {
		super();
	}

	@Override
	public String toString() {
		return "Payment [userPayId=" + userPayId + ", userId=" + userId + ", paymentId=" + paymentId + "]";
	}	

}
