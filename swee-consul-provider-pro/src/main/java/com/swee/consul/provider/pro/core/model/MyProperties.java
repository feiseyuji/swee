package com.swee.consul.provider.pro.core.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@RefreshScope
@Configuration
@ConfigurationProperties("myPro")
public class MyProperties {
	
	private String prop;

}
