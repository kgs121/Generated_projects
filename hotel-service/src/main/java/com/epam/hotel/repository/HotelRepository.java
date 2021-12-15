package com.epam.hotel.repository;

import javax.persistence.NamedNativeQueries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.epam.hotel.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

	
	@Query(value = "select h.hotel_id, hotel_name, is_deleted_ind from hotel_details h,booking_details b where date(?1) not between b.book_from and b.book_upto and is_deleted_ind = 'N' ",
			nativeQuery = true) // '2017-11-01' 
	Hotel availableHotel(String date);

}
