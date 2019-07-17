package com.swee.consul.provider.pro.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swee.consul.provider.pro.core.model.MyProperties;

@RestController
public class ProviderController {
	
	@Value("${my.prop}")
	String value;

	@Autowired
	private MyProperties properties;

	@GetMapping("/getConfigFromValue")
	public String getConfigFromValue() {
		return value;
	}

	@GetMapping("/getConfigFromProperty")
	public String getConfigFromProperty() {
		return properties.getProp();
	}

}
