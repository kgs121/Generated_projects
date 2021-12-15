package com.epam.reservation.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "booking_details")
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookingId;
	
	private Integer hotelId;
	
	private Integer userId;
	
	private Date bookFrom;
	
	private Date bookUpto;
	
	private Integer userPayId;
	
	@Transient
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getBookFrom() {
		return bookFrom;
	}

	public void setBookFrom(Date bookFrom) {
		this.bookFrom = bookFrom;
	}

	public Date getBookUpto() {
		return bookUpto;
	}

	public void setBookUpto(Date bookUpto) {
		this.bookUpto = bookUpto;
	}

	public Integer getUserPayId() {
		return userPayId;
	}

	public void setUserPayId(Integer userPayId) {
		this.userPayId = userPayId;
	}

	public Reservation(Integer bookingId, Integer hotelId, Integer userId, Date bookFrom, Date bookUpto,
			Integer userPayId) {
		super();
		this.bookingId = bookingId;
		this.hotelId = hotelId;
		this.userId = userId;
		this.bookFrom = bookFrom;
		this.bookUpto = bookUpto;
		this.userPayId = userPayId;
	}

	public Reservation() {
		super();
	}

	@Override
	public String toString() {
		return "Reservation [bookingId=" + bookingId + ", hotelId=" + hotelId + ", userId=" + userId + ", bookFrom="
				+ bookFrom + ", bookUpto=" + bookUpto + ", userPayId=" + userPayId + "]";
	}
	
	

}
