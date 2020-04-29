package org.hcl.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	Logger log = LoggerFactory.getLogger(MainController.class);
	
	@GetMapping("/")
	public String showMsg() {
		log.debug("loging for message");
		return "welcome";
	}

}
