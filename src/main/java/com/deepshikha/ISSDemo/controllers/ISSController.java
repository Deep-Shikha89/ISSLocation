package com.deepshikha.ISSDemo.controllers;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deepshikha.ISSDemo.models.IssLocator;
import com.deepshikha.ISSDemo.service.LocationService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class ISSController {
	
	@Autowired
	
	private LocationService locationService;
	@GetMapping("/issLocation")
	@CrossOrigin
	public IssLocator getISSLocation() {
		return this.locationService.getIssLocation();
//		try {
//		RestTemplate restTemplate = new RestTemplate();
//	return 	restTemplate.getForObject("http://api.open-notify.org/iss-now.json",IssLocator.class);
//		}catch (Exception e)	{
//			IssLocator issLocator = new IssLocator();
//			issLocator.setMessage(FAILED);
//			return issLocator;
		}
		
		
	}
	


