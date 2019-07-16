package com.swee.server.pro.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class CoreApplication {
    public static void main( String[] args ) {
    	SpringApplication.run(CoreApplication.class, args);
        System.out.println( "Hello World!" ); 
    }
}
