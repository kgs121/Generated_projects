package com.epam.reservation.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.reservation.entity.Reservation;
import com.epam.reservation.service.ReservationService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@GetMapping("/{userName}/{date}")
	//@CircuitBreaker(name="RESERVATION-SERVICE", fallbackMethod = "reservationFallBack")
	public Reservation getRequiredDetails(@PathVariable("userName")String userName, @PathVariable("date")String date ) {
		
		return reservationService.getRequiredDetails(userName, date);
	}
	
	
public Reservation reservationFallBack(String userName, String date, Exception e ) {
		
	Reservation res =  new Reservation();
	res.setErrorMessage("Service is down, Please try again later!");
	return res;
}

}