package com.epam.reservation.feign.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.epam.reservation.vo.Payment;

@FeignClient(name="PAYMENT-SERVICE")// configure 
public interface PaymentServiceProxy {
	
	@GetMapping("/{userId}")
	public Payment getPaymentDetails(@PathVariable("userId") String userId);
	
}
