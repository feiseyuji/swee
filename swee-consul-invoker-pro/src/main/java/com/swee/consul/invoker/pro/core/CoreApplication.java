package com.swee.consul.invoker.pro.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CoreApplication{
    public static void main( String[] args ) {
    	SpringApplication.run(CoreApplication.class, args);
        System.out.println( "Hello World!" );
    }
}
