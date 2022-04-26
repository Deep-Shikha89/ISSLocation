package com.deepshikha.ISSDemo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import com.deepshikha.ISSDemo.models.IssLocator;

@Service
public class LocationService {
	private static final String FAILED = "failed";
	
	@HystrixCommand(fallbackMethod = "fallback")
	public IssLocator getIssLocation() {
		RestTemplate restTemplate = new RestTemplate();
    	return 	restTemplate.getForObject("http://api.open-notify.org/iss-now.json",IssLocator.class);	
		
	}
	public IssLocator fallback() {
		IssLocator issLocator = new IssLocator();
		issLocator.setMessage(FAILED);
		return issLocator;
		
	}
	

}
