package com.benga.sniper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restSniper {
	
	@GetMapping("/healthcheck")
	public String healthCheck()
    {
		return "Success";
		
	}
	

}
