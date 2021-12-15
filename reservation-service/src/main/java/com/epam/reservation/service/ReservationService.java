package com.epam.reservation.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.epam.reservation.entity.Reservation;
import com.epam.reservation.feign.proxy.HotelServiceProxy;
import com.epam.reservation.feign.proxy.PaymentServiceProxy;
import com.epam.reservation.feign.proxy.UserServiceProxy;
import com.epam.reservation.repository.ReservationRepository;
import com.epam.reservation.vo.Hotel;
import com.epam.reservation.vo.Payment;
import com.epam.reservation.vo.UserDetail;

@Service
public class ReservationService {
	
	@Autowired
	private ReservationRepository reservationRepository;
	
	@Autowired
	private HotelServiceProxy hotelServiceProxy;
	
	@Autowired
	private UserServiceProxy userServiceProxy;
	
	@Autowired
	private PaymentServiceProxy paymentServiceProxy;
	
	

	public Reservation getRequiredDetails(String userName, String date) {
				
		Hotel hotel = hotelServiceProxy.getHotel(date);
		
		UserDetail userDetails = userServiceProxy.getUserInfoByUserName(userName);
		
		Payment payment = paymentServiceProxy.getPaymentDetails(Integer.toString(userDetails.getUserId()));

		
		return new Reservation(null, hotel.getHotelId(), userDetails.getUserId(), new Date(), new Date(), payment.getUserPayId());
	}

}
