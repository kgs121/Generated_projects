package com.epam.payment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_payment")
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
