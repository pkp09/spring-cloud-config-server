package com.prashant.microservices.springcloudconfigserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author PKP09
 *
 */
@RestController
public class LimitsConfigurationController {
	
	@GetMapping("/default")  
	public String retriveLimitsFromConfigurations()  
	{  
	return "Hello World";  
	}  

}
