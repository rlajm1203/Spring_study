package com.bellmin_world.myweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping(value="/contact", method = {RequestMethod.GET})
@Log4j
public class ContactController {
	
	@GetMapping("")
	public String main() {
		log.info("Contact Page");
		return "contact";
	}
}
