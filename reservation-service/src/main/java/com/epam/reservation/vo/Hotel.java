package com.epam.reservation.vo;




public class Hotel {
	
	
	private Integer hotelId;
	
	private String hotelName;
	
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
