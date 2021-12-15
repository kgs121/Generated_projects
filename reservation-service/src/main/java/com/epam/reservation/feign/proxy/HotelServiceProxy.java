package com.epam.reservation.feign.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.epam.reservation.vo.Hotel;

@FeignClient(name="HOTEL-SERVICE")
public interface HotelServiceProxy {
	
	@GetMapping("/{date}")
	public Hotel getHotel(@PathVariable("date") String date);

}