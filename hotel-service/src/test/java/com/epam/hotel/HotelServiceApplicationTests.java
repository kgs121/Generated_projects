package com.epam.hotel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.epam.hotel.entity.Hotel;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)

class HotelServiceApplicationTests {

	@Autowired
	private TestRestTemplate testRestTemplate;
	
	
	
	@Test
	void contextLoads() {
		
		ResponseEntity<Hotel> entity = testRestTemplate.getForEntity("/hotels/2017-01-01", Hotel.class);
		
		assertEquals(entity.getStatusCode(),HttpStatus.OK);
		
		assertNotNull(entity.getBody());
		
	}

}
