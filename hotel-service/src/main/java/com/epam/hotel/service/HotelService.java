package com.epam.hotel.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.hotel.entity.Hotel;
import com.epam.hotel.repository.HotelRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class HotelService {
	
	private static final String CLASS_NAME = "HotelService";
	
	private static final Logger log = LoggerFactory.getLogger(HotelService.class);
	
	@Autowired
	private HotelRepository hotelRepository;

	public Hotel saveHotel(Hotel hotel) {
		final String METHOD_NAME = "saveHotel";
		log.info("INSIDE CLASS "+ CLASS_NAME + " INSIDE METHOD " + METHOD_NAME);
		return hotelRepository.save(hotel);
	}

	public Hotel findAvailableHotel(String date) {
		final String METHOD_NAME = "findAvailableHotel";
		log.info("INSIDE CLASS "+ CLASS_NAME + " INSIDE METHOD " + METHOD_NAME);

		return hotelRepository.availableHotel(date);
	
		
	}

}
