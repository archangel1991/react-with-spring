package com.reactwithspring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.fasterxml.jackson.databind.node.JsonNodeFactory;
//import com.fasterxml.jackson.databind.node.ObjectNode;

import io.swagger.annotations.Api;

@RestController
@Api(description = "PropertiesController")
public class PropertiesController {

	private static final Logger logger = LogManager.getLogger(PropertiesController.class);

	/* Uncomment this to have a controller which reads the application server system properties
	@Value("${propertyName}")
	String propertyName;
	
	@RequestMapping(value = "/getProperties", method = RequestMethod.GET)
	public ObjectNode getProperties() {
		
		logger.debug("/getProperties called");
		
		ObjectNode properties = JsonNodeFactory.instance.objectNode();
		
		properties.put("propertyName", propertyName);
		
		logger.debug(properties.toString());

		logger.debug("/getProperties ended");
		return properties;
	}*/

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		
		logger.debug("/test called");
		
		logger.debug("/test ended");
		return "OK";
	}
	
}
