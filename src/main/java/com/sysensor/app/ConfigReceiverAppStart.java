package com.sysensor.app;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConfigReceiverAppStart {
	Logger LOG = Logger.getLogger(this.getClass());


	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ConfigReceiverAppStart.class, args);
		//System.exit(SpringApplication.exit(context));
		System.out.print(context.toString());
	}
}
