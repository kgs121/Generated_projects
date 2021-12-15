package com.epam.reservation.feign.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.epam.reservation.vo.UserDetail;

@FeignClient(name="USER-SERVICE")
public interface UserServiceProxy {
	
	@GetMapping("/{userName}")
	public UserDetail getUserInfoByUserName(@PathVariable("userName") String userName);

}
