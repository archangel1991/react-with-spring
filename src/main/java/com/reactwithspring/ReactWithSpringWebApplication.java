package com.reactwithspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.reactwithspring"})
@SpringBootApplication
public class ReactWithSpringWebApplication extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ReactWithSpringWebApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(ReactWithSpringWebApplication.class, args);
	}

}
