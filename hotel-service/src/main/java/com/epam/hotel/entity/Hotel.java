package com.epam.hotel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
@Table(name = "hotel_details")
public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "hotel_id")
	private Integer hotelId;
	
	@Column(name = "hotel_name")
	private String hotelName;
	
	@Column(name = "is_deleted_ind")
	private String isDeletedInd;

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getIsDeletedInd() {
		return isDeletedInd;
	}

	public void setIsDeletedInd(String isDeletedInd) {
		this.isDeletedInd = isDeletedInd;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", isDeletedInd=" + isDeletedInd + "]";
	}

	public Hotel(Integer hotelId, String hotelName, String isDeletedInd) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.isDeletedInd = isDeletedInd;
	}

	public Hotel() {
		super();
	}

}
