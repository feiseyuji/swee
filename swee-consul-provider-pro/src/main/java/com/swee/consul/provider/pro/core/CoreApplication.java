package com.swee.consul.provider.pro.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Hello world!
 *
 */
@SpringBootApplication
public class CoreApplication {
	public static void main( String[] args ) {
    	SpringApplication.run(CoreApplication.class, args);
        System.out.println( "Hello World!" );
    }
}
