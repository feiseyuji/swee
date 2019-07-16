package com.swee.provider.project.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class CoreApplication {
    public static void main( String[] args ) {
    	SpringApplication.run(CoreApplication.class, args);
        System.out.println( "Hello World!" );
    }
}
