package com.epam.hotel.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.hotel.entity.Hotel;
import com.epam.hotel.service.HotelService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/hotels")
@Slf4j
public class HotelController {
	
	private static final String CLASS_NAME = "HotelController";
	
	
	@Autowired
	private HotelService hotelService;
	
	private static final Logger log = LoggerFactory.getLogger(HotelController.class);// static import
	
	@PostMapping("/")
	public Hotel saveHotel(@RequestBody Hotel hotel) {
		final String METHOD_NAME = "saveHotel";
		log.info("INSIDE CLASS "+ CLASS_NAME + " INSIDE METHOD " + METHOD_NAME);
		
		return hotelService.saveHotel(hotel);
	}
	
	@GetMapping("/{date}")
	public Hotel getHotel(@PathVariable("date") String date) {
		final String METHOD_NAME = "getHotel";
		log.info("INSIDE CLASS "+ CLASS_NAME + " INSIDE METHOD " + METHOD_NAME);
		return hotelService.findAvailableHotel(date);
				
	}	
	
	/// Add more APIs 

}
