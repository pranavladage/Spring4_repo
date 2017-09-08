package com.acc.common.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/movie")
public class MovieController {
	private static final Logger logger = Logger.getLogger(MovieController.class);
	
	@RequestMapping(value = "/{name}/{id}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name,@PathVariable String id) {
		logger.info("controller called");

		return "hello world"+ name + id;

	}

	

}
