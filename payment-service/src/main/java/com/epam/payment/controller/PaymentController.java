package com.epam.payment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.payment.entity.Payment;
import com.epam.payment.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	private static final String CLASS_NAME = "PaymentController";
	
	
	@Autowired
	private PaymentService paymentService;
	
	private static final Logger log = LoggerFactory.getLogger(PaymentController.class);
	
	@PostMapping("/")
	public Payment saveHotel(@RequestBody Payment payment) {
		final String METHOD_NAME = "saveHotel";
		log.info("INSIDE CLASS "+ CLASS_NAME + " INSIDE METHOD " + METHOD_NAME);
		
		return paymentService.savePayment(payment);
	}
	
	@GetMapping("/{userId}")
	public Payment getPaymentDetails(@PathVariable("userId") String userId) {
		final String METHOD_NAME = "getPaymentDetails";
		log.info("INSIDE CLASS "+ CLASS_NAME + " INSIDE METHOD " + METHOD_NAME);
		if(null!=userId && !"".equals(userId))
		return paymentService.getPaymentByUserId(Integer.parseInt(userId));
		else
		return new Payment();
		
	}
	

}
