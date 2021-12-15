package com.epam.payment.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.payment.entity.Payment;
import com.epam.payment.repository.PaymentRepository;

@Service
public class PaymentService {
	
	private static final String CLASS_NAME = "PaymentService";
	
	private static final Logger log = LoggerFactory.getLogger(PaymentService.class);
	
	@Autowired
	private PaymentRepository paymentRepository;

	public Payment savePayment(Payment payment) {
		final String METHOD_NAME = "savePayment";
		log.info("INSIDE CLASS "+ CLASS_NAME + " INSIDE METHOD " + METHOD_NAME);
		return paymentRepository.save(payment);
	}

	public Payment getPaymentByUserId(Integer userId) {
		final String METHOD_NAME = "findAvailableHotel";
		log.info("INSIDE CLASS "+ CLASS_NAME + " INSIDE METHOD " + METHOD_NAME);

		return paymentRepository.getPaymentByUserId(userId);	
		
	}

}
