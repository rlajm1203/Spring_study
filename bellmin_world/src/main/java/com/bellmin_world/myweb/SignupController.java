package com.bellmin_world.myweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/signup")
@Log4j
public class SignupController {

	@GetMapping("")
	public String main() {
		log.info("Signup Page");
		return "signup/signup";
	}
}
