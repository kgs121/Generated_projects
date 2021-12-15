package com.epam.hotel.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

//@WebMvcTest(HotelController.class)
//@ContextConfiguration(loader = AnnotationConfigContextLoader.class)

@AutoConfigureMockMvc
@SpringBootTest

public class HotelControllerTests {
	
	@Autowired
	MockMvc mockMvc;
	
	
	
	@Test
	void testGetHotel() throws Exception {
		
		mockMvc.perform(MockMvcRequestBuilders.get("/hotels/2017-01-01")).andExpect(status().isOk());

		
	}
	
	
	

}
